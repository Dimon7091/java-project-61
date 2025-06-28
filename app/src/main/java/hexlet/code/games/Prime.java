package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void game(String name) {
        Random random = new Random();
        final int numOfQuestions = 3;
        // Массив вопрос ответ, отправляется в движок, колличество раундов зависить от длины.
        String[][] questionAndAnswer = new String[numOfQuestions][2];
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        // Цикл наполняет массив, вопрос, ответ.
        for (var i = 0; i < questionAndAnswer.length; i++) {
            final int startNumber = 1;
            final int finishNumber = 100;
            int randomInt = random.nextInt(startNumber, finishNumber);
            questionAndAnswer[i][0] = String.valueOf(randomInt);
            String correctAnswer = " ";


            int limit = (int) Math.sqrt(randomInt);
            for (var j = 2; j <= limit; j++) {
                if (randomInt < 2) {
                    correctAnswer = "no";
                    break;
                }
                if (randomInt % j == 0) {
                    correctAnswer = "no";
                    break;
                } else {
                    correctAnswer = "yes";
                }
            }

            questionAndAnswer[i][1] = correctAnswer;
        }
        Engine.logicOfGames(description, questionAndAnswer, name);
    }
}
