package com.cardgame.Deck;

/**
 * Created by pknudsen on 10/4/16
 */
public class Card {
    //An instance of a card can only be a single suit or value at a time, so these are non-static
    private Suit suit;
    private CardVal value;

    public Card(CardVal value, Suit suit){
        this.value = value;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public CardVal getValue() {
        return value;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public void setValue(CardVal val) {
        this.value = val;
    }
}
