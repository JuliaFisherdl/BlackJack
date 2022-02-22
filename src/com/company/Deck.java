package com.company;

import java.util.ArrayList;
import java.util.List;

public class Deck {

    /*
    com.company.Deck should have a public method that “builds” an arraylist of Card objects
    Assign each Card a Suit (Spades, Clubs, Diamond, and Heart)
    Assigning each card a Rank (2-10, Jack, Queen, King, Ace)
    Assigning each card a value to 2-11
    This should be done to recreate the 52 unique cards in a deck*/

    public static final String[] suits = {"Spades", "Clubs", "Diamonds", "Hearts"};
    public static final String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public List<Card> buildDeck() {
        List<Card> newDeck = new ArrayList<Card>();
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                int value;
                if (rank[j] == "Jack" || rank[j] == "Queen" || rank[j] == "King") {
                    value = 10;

                } else if (rank[j] == "Ace") {
                    value = 11;

                } else value = Integer.parseInt(rank[j]);


                newDeck.add(new Card(rank[j], suits[i], value));
            }

        }
return newDeck;
    }
}

