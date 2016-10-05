package com.cardgame;

import com.cardgame.Game.Game;

/**
 * Created by pknudsen on 10/4/16.
 *
 * The Deck
 *
 * Create a model (a combination of classes, enums and interfaces) for a standard deck of playing cards.
 *  Individual cards have a suit and value.
 *  A deck has one card for every suit and value combination.
 * Implement a function to shuffle a deck of cards.
 *  Calling shuffle on the deck of cards will result in a new ordering of individual cards.
 * Implement a function to remove and return the top card of the deck (deal a card).
 *
 *
 * The Players
 *
 * Create a model for a card player.
 *  A player has a name.
 *  A player has a collection of cards called a hand.
 * Implement a function to add a card to a player's hand.
 *  A card should only belong to one player's hand at any given time.
 * Implement a function to check to see if a player has a given card in their hand.
 *
 *
 * The Table
 *
 * Create a model for a card table.
 *  A card table has one deck of cards.
 *  A card table can have several players.
 * Implement a function to add a player to the card table.
 * Implement a function to deal a card to a player from the card deck.
 *
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

public class Main {
    public static void main(String[] args) {
        //sane defaults for number of games and number of players
        int numberOfGames = 1000;
        int numberOfPlayers = 6;

        try { //assumption is that we get 2 startup args for number of games and number of players with values > 0.
            numberOfGames = Integer.parseInt(args[0]);
            numberOfPlayers = Integer.parseInt(args[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //no op since we set sane defaults for number of games and number of players.
        }

        Game game = new Game(numberOfPlayers);
        game.begin(numberOfGames);

    }
}