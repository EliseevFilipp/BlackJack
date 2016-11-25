package com.company;

import java.util.Scanner;

/**
 * Created by student1 on 25.11.16.
 */
public class ConsoleIntellect extends Intellect {
    private static Scanner in = new Scanner(System.in);
    
    public Command decide(int score){
        do{
            System.out.println("HIT/STAND:");
            String c = in.nextLine();
            if ("hit".startsWith(c.toLowerCase()))
                return Command.HIT;
            if ("stand".startsWith(c.toLowerCase()))
                return Command.STAND;
            System.out.println("Can't understand, please repeat...");
        }
        while (true);
    }
}
