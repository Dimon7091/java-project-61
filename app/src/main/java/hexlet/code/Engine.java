package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void logicOfGames(String description, String[][] arrGame) {
        Cli.greeting();
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        var userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);
        boolean isVictory = true;
        // Цыкл выполнения игры,
        // колличество интераций звисит от длины переданного массива игры.
        for (var i = 0; i < arrGame.length; i++) {
            var gameQuestion = arrGame[i][0];
            System.out.println("Question: " + gameQuestion);
            System.out.print("Your answer: ");
            var userAnswer = scanner.next();
            var correctMessage = "Correct!";
            var correctAnswer = arrGame[i][1];
            var incorrectMessage = "'" + userAnswer + "'" + " is wrong answer "
                    + ";(. Correct answer was " + "'" + correctAnswer + "'" + ".\n"
                    + "Let's try again, " + userName;
            if (arrGame[i][1].equals(userAnswer)) {
                System.out.println(correctMessage);
            } else {
                System.out.println(incorrectMessage);
                isVictory = false;
                break;
            }
        }
        if (isVictory) {
            System.out.println("Congratulations, " + userName);
        }
    }
}

