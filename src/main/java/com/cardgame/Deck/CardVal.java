package com.cardgame.Deck;

/**
 * Created by pknudsen on 10/4/16
 */
public enum CardVal {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private int cardVal;

    CardVal(int i) {
        this.cardVal = i;
    }
}
