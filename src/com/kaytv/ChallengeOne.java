package com.kaytv;

import java.util.Scanner;

public class ChallengeOne {

    public static void main(String[] args) {
        String question = "What is Nightcrawler's Power";
        String choiceOne = "Teleportation";
        String choiceTwo = "Super Strength";
        String choiceTree = "Flight";

        System.out.println(question);
        System.out.println("A." + choiceOne);
        System.out.println("B." + choiceTwo);
        System.out.println("C." + choiceTree);

        boolean runningQuiz = true;
        Scanner scanner = new Scanner(System.in);

        while (runningQuiz) {
            String answer = scanner.nextLine().toLowerCase();
            if (answer.equals(choiceOne) || answer.equals("a")) {
                System.out.println("You are correct it is " + choiceOne);
                runningQuiz = false;
            } else {
                System.out.println("Nope, try again");
            }
        }

    }
}
