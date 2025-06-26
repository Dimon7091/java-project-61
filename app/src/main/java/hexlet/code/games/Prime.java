package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    public static void game() {
        Random random = new Random();
        // Массив вопрос ответ, отправляется в движок, колличество раундов зависить от длины.
        String[][] QuestionAndAnswer = new String[10][2];
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        // Цикл наполняет массив, вопрос, ответ.
        for (var i = 0; i < QuestionAndAnswer.length; i++) {
            int randomInt = random.nextInt(1, 100);
            QuestionAndAnswer[i][0] = String.valueOf(randomInt);
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

            QuestionAndAnswer[i][1] = correctAnswer;
        }
        Engine.logicOfGames(description, QuestionAndAnswer);
    }
}
