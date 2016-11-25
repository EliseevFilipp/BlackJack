package com.company;

/**
 * Created by student1 on 14.11.16.
 */
public abstract class Player {
    public Hand hand = new Hand();
    private Intellect intellect;

    public void take(Card current) {
        hand.add(current);
    }

    public Player(String name, Intellect intellect) {
        this.intellect = intellect;
    }

    public Command decision() {
        int score = hand.getScore();
        if (score>21)
            return Command.STAND;
        return intellect.decide(score);
    }
}
