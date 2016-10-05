package com.cardgame.Players;

import com.cardgame.Deck.Card;
import com.cardgame.Deck.CardVal;
import com.cardgame.Deck.Suit;

import java.util.ArrayList;

/**
 * Created by pknudsen on 10/4/16
 *
 * The Players
 *
 * Create a model for a card player.
 *  A player has a name.
 *  A player has a collection of cards called a hand.
 *  Implement a function to add a card to a player's hand.
 *      A card should only belong to one player's hand at any given time.
 *  Implement a function to check to see if a player has a given card in their hand.
 */
public class Player {
    public int name;
    private ArrayList<Card> hand;

    public Player(int name){
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public boolean hasCard(CardVal val, Suit suit){
        for (Card c : hand) {
            if (c.getValue() == val && c.getSuit() == suit){
                return true;
            }
        }
     return false;
    }

    public ArrayList<Card> getHand(){
        return hand;
    }
}
