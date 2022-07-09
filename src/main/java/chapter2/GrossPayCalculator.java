package chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
        //1. Get the number of working hours
        System.out.println("Enter the number of hours");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Enter employee pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        //3. Multiply hours and pay rate
            double grossPay = hours * rate;

        //4. Print result
        System.out.println("$" + grossPay);

    }
}
