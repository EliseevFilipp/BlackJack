package com.company;

import Command.Command;
import Intellect.Intellect;

/**
 * Created by student1 on 14.11.16.
 */
public abstract class Player {
    public Hand hand = new Hand();
    private Intellect intellect;

    public void take(Card current) {
        hand.add(current);
    }

    public Command decision() {
        int score = hand.getScore();
        return intellect.decide(score);
    }
}
