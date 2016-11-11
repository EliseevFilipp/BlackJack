package com.company;

public class Main {

    public static void main(String[] args) {
        for (Suit s: Suit.values())
            for (Value v: Value.values()) {
            Card c = new Card(s, v);
                System.out.println(c);
            }
	    Suit m = Suit.CLUBS;
        System.out.println(m);
        Card c = new Card(Suit.SPADES, Value.ACE);
        System.out.println(c);
    }
}
