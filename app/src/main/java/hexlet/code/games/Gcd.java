package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Gcd {
    public static void game(String name) {
        Random random = new Random();
        final int numOfQuestions = 3;
        // Массив вопрос ответ, отправляется в движок,
        // колличество раундов зависить от длины первого массива.
        String[][] questionAndAnswer = new String[numOfQuestions][2];
        String description = "Find the greatest common divisor of given numbers.";
        // Цикл наполняет массив, вопрос, ответ.
        for (var i = 0; i < questionAndAnswer.length; i++) {
            final int startRange = 1;
            final int finishRange = 100;
            int a = random.nextInt(startRange, finishRange);
            int b = random.nextInt(startRange, finishRange);

            var answer = euclideanAlgorithm(a, b);

            String impression = String.valueOf(a) + " " + String.valueOf(b);
            questionAndAnswer[i][0] = impression;
            String correctAnswer = String.valueOf(answer);
            questionAndAnswer[i][1] = correctAnswer;

        }
        Engine.logicOfGames(description, questionAndAnswer, name);
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
