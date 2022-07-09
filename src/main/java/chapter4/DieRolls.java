package chapter4;

import java.util.Random;

public class DieRolls {
    public static void main(String args[]){
        /*
         * 1. Roll the die for the user (generate a Random number between 1 – 6) and advance the user that number of spaces on the game board.
         * After each roll, tell the user which game space they are on and how many more spaces they have to go to win.
         * Repeat this 4 additional times, for 5 rolls in total.
         * However, if the user gets to 20 before 5 rolls, end the game - they’ve won.
         * If they are greater than or less than 20 spaces exactly, they lose.
         * Remember there are only 20 spaces on the board, so a message like “You advanced to space 22” is a bug.
         */
        Random random = new Random();

        int currentSpace = 0;
        int lastSpace = 20;
        int maxRolls = 6;


        System.out.println(("Welcome to Roll the Die! Let's begin..."));
        for (int i = 1; i < maxRolls; i++) {
            int die = random.nextInt(6);
            currentSpace += die;
            System.out.print(String.format("Roll #%d:\n You've rolled a %d.\n ", i, die));

            if(currentSpace == lastSpace){
                System.out.print("You're on space " + currentSpace + ". Congrats, you win!");
                break;
            }
            else if(currentSpace > lastSpace){
                System.out.print("Unfortunately, that takes you past " + lastSpace + " spaces. You lose!");
                break;
            }
            else if(i==maxRolls && currentSpace < lastSpace){
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all " +
                        lastSpace + " spaces. You lose!");
            }
            else{
                int spacesToGo = lastSpace - currentSpace;
                System.out.print("You are now on space " + currentSpace +
                        " and have " + spacesToGo + " more to go.");
            }
            System.out.println();
        }
    }




}
