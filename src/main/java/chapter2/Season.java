package chapter2;

import java.util.Scanner;

public class Season {
    public static void main(String arg[]){

        System.out.println("What is you favorite season?");

        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("How many coffee did you drink then ?");
        int cups = scanner.nextInt();

        System.out.println("On a colorful " + season + " day" + " I drink a minimum of " + cups + " cups of coffee.");




    }
}
