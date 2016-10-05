package com.cardgame.Game;

import com.cardgame.Deck.Card;
import com.cardgame.Deck.Deck;
import com.cardgame.Players.Player;

/**
 * Created by pknudsen on 10/4/16
 *
 * The Table
 *
 * Create a model for a card table.
 *  A card table has one deck of cards.
 *  A card table can have several players.
 * Implement a function to add a player to the card table.
 * Implement a function to deal a card to a player from the card deck.
 */
public class Table {
    static Player[] players;
    static Deck deck;

    public Table() {
        deck = new Deck();
        deck.shuffle();
    }

    public Player[] addPlayers(int numberOfPlayers) {
        players = new Player[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++) {
            players[i] = new Player(i);
        }
        return players;
    }

    public Card dealCard() {
        return deck.getCard();
    }

    //For when we want to manipulate current players without adding new players
    public Player[] getPlayers() {
        return players;
    }

}
