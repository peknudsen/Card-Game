package com.cardgame.Game;

import com.cardgame.Deck.Card;
import com.cardgame.Deck.Suit;
import com.cardgame.Players.Player;

import static com.cardgame.Game.Table.deck;

/**
 * Created by pknudsen on 10/4/16
 *
 * The Game
 *
 * Create a card table.
 * Add 6 players to the table.
 * Deal all cards out players until no cards remain in the deck.
 * Find the player who has the most Spades. This player wins. Print a winning message for this player.
 *
 * Repeat the game 1000 times. Print the percentage amount of wins for each player.
 */
public class Game {

    public Player winner;
    public Player[] players;
    public Table table;

    private Suit winningSuit = Suit.SPADES;
    private int numberOfPlayers;
    private int numberOfGames;
    private static int gameNumber = 0;
    private static int[] winsPerPlayer;

    public Game(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        //Setup a new table for our players
    }

    //let the games
    public void begin(int numberOfGames) {
        Game.winsPerPlayer = new int[numberOfPlayers];
        this.numberOfGames = numberOfGames;
        for (int i = 0; i < numberOfGames; i++) {
            startGame();
        }
        for(int p = 0; p < numberOfPlayers; p++){
            winPercentages(p);
        }
    }

    public void startGame() {
        this.table = new Table();
        this.players = table.addPlayers(numberOfPlayers);
        while (!deck.isEmpty()) {
            //Put a card from the deck into a players hand starting at the first player
            for (Player player : players) { //we could make this smarter and pick a random player so the cards are more evenly distrubuted
                try {
                    player.getHand().add(table.dealCard());
                } catch (IllegalStateException e) {
                    //No more cards to deal
                    whoWins();
                    return;
                }
            }
        }
        //this makes sure we set a winner so it's never null
        whoWins();
    }

    public void winPercentages(int i) {
        float wins = winsPerPlayer[i] * 100.0f;
        float winPercent = wins/numberOfGames;
        System.out.print("Player " + i + " has a win percentage of: " + winPercent + "%\n\n");
    }

    //Count the number of spades in a players hand. The player with the most spades wins. Ties are ignored.
    private Player whoWins(){
        int[] suited = new int[numberOfPlayers];
        //for each player
        for (Player player : players) {
            //and for each card in a hand
            for (Card c : player.getHand()) {
                //check if the card is of the winning suit.
                if (c.getSuit() == winningSuit){
                    //add to the players suited tally
                    suited[player.name] += 1;
                }
            }
        }

        int suitedIndex = 0;
        for (int i = 0; i < suited.length; i++) {
            for (int k = i + 1; k < suited.length; k++) {
                if (suited[i] > suited[k] && suited[i] > suited[suitedIndex]) {
                    suitedIndex = i;
                } else {
                }
            }
        }

        Game.winsPerPlayer[suitedIndex] += 1;
        winner = players[suitedIndex];
        gameNumber++;
        System.out.print("Congratulations player " + winner.name + "! You have the winning hand for game #" + gameNumber + ". \n\n");
        return winner;
    }
}
