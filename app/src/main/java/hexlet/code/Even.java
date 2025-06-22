package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");

        System.out.println("Question: 15");
        System.out.print("Your answer: ");
        String userAnswer = scanner.next();
        if (userAnswer.equals("no")) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" +userAnswer + "'" + " is wrong answer ;(. Correct answer was 'no'.\n" +
                    "Let's try again, " + userName);
            return;
        }

        System.out.println("Question: 6");
        System.out.print("Your answer: ");
        String userAnswer2 = scanner.next();
        if (userAnswer2.equals("yes")) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" +userAnswer2 + "'" + " is wrong answer ;(. Correct answer was 'no'.\n" +
                    "Let's try again, " + userName);
            return;
        }

        System.out.println("Question: 7");
        System.out.print("Your answer: ");
        String userAnswer3 = scanner.next();
        if (userAnswer3.equals("no")) {
            System.out.println("Correct!\nCongratulation, " + userName);
        } else {
            System.out.println("'" +userAnswer3 + "'" + " is wrong answer ;(. Correct answer was 'no'.\n" +
                    "Let's try again, " + userName);
            return;
        }
    }
}
