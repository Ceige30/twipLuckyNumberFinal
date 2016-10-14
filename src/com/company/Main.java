package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        perfectRandom test = new perfectRandom();
        Scanner sc = new Scanner(System.in);

        String answer = "same";
        while (!answer.equals("y")) {
            int randnum = test.randomInteger();
            answer = "same";
            System.out.println("Please enter your name below");
            String name = sc.nextLine();
            System.out.println("Nice to meet you " + name);
            System.out.println("Your number is " + randnum);

            String same = "this took hours to commit dang it";

            while (answer.equals("1") || !answer.equals("2")) {
                System.out.println("Press 0 to exit or 1 for a listing of the name and randomNumber of the object or 2 to enter another name. ");
                answer = sc.nextLine();
                if (answer.equals("0")) {
                    System.out.println("Thanks for suing this program, have a good day");
                    System.exit(0);
                } else if (answer.equals("1")) {
                    System.out.println("Your name was " + name);
                    System.out.println("And your number was " + randnum);
                } else if (answer.equals("2")) {
                    answer = "2";
                } else {
                    System.out.println("You haven't entered a correct value please try again");
                }
            }
        }
    }
}