package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Gcd {
    public static void game() {
        Random random = new Random();
        // Массив вопрос ответ, отправляется в движок,
        // колличество раундов зависить от длины первого массива.
        String[][] QuestionAndAnswer = new String[3][2];
        String description = "Find the greatest common divisor of given numbers.";
        // Цикл наполняет массив, вопрос, ответ.
        for (var i = 0; i < QuestionAndAnswer.length; i++) {
            int a = random.nextInt(3, 100);
            int b = random.nextInt(3, 100);

            var Answer = euclideanAlgorithm(a, b);

            String impression = String.valueOf(a) + " " + String.valueOf(b);
            QuestionAndAnswer[i][0] = impression;
            String correctAnswer = String.valueOf(Answer);
            QuestionAndAnswer[i][1] = correctAnswer;

        }
        Engine.logicOfGames(description, QuestionAndAnswer);
    }

    public static int euclideanAlgorithm(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
