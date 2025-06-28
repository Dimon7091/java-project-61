package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calculator {
    public static void game(String name) {
        Random random = new Random();
        final int numOfQuestions = 3;
        // Массив вопрос ответ, отправляется в движок, колличество раундов зависить от длины.
        String[][] questionAndAnswer = new String[numOfQuestions][2];
        String description = "What is the result of the expression?";
        // Цикл наполняет массив, вопрос, ответ.
        for (var i = 0; i < questionAndAnswer.length; i++) {
            final int startRange  = 1;
            final int finishRange = 100;
            int randomInt1 = random.nextInt(startRange, finishRange);
            int randomInt2 = random.nextInt(startRange, finishRange);

            int randomOperator = random.nextInt(1, 2);
            int answer = 0;
            String operator = "";

            if (randomOperator == 1) {
                answer = randomInt1 - randomInt2;
                operator = " - ";
            } else if (randomOperator == 2) {
                answer = randomInt1 + randomInt2;
                operator = " + ";
            }

            String impression = String.valueOf(randomInt1) + operator + String.valueOf(randomInt2);
            questionAndAnswer[i][0] = impression;
            String correctAnswer = String.valueOf(answer);
            questionAndAnswer[i][1] = correctAnswer;
        }
        Engine.logicOfGames(description, questionAndAnswer, name);
    }
}
