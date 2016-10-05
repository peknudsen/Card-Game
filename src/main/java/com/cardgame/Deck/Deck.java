package com.cardgame.Deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by pknudsen on 10/4/16
 *
 * The Deck
 *
 * Create a model (a combination of classes, enums and interfaces) for a standard deck of playing cards.
 *  Individual cards have a suit and value.
 *  A deck has one card for every suit and value combination.
 * Implement a function to shuffle a deck of cards.
 *  Calling shuffle on the deck of cards will result in a new ordering of individual cards.
 * Implement a function to remove and return the top card of the deck.
 *
 */
public class Deck {

    private ArrayList<Card> deck;

    //A clean and sorted deck of cards
    public Deck() {
        this.deck = new ArrayList<>(52);
        for (Suit s: Suit.values()){
            for (CardVal v: CardVal.values()){
                Card card = new Card(v,s);
                this.deck.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck, new Random());
    }

    public Card getCard() throws IllegalStateException {
        Card c;
        //First check how many cards are left, if 0 throw an exception
        if (!deck.isEmpty()){
            c = deck.get(0);
                //System.out.println(c.getValue() + " of " + c.getSuit());
                deck.remove(c);
        } else {
            throw new IllegalStateException("No more cards to deal");
        }
        return c;
    }

    public boolean isEmpty() {
        return this.deck.isEmpty();
    }
}
