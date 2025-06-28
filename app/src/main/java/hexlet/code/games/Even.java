package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Even {
    public static void game(String name) {
        Random random = new Random();
        // Массив вопрос ответ, отправляется в движок, колличество раундов зависить от длины.
        String[][] questionAndAnswer = new String[3][2];
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        // Цикл наполняет массив, вопрос, ответ.
        for (var i = 0; i < questionAndAnswer.length; i++) {
            int randomInt = random.nextInt(1, 100);
            questionAndAnswer[i][0] = String.valueOf(randomInt);
            String correctAnswer = (randomInt % 2 == 0) ? "yes" : "no";
            questionAndAnswer[i][1] = correctAnswer;
        }
        Engine.logicOfGames(description, questionAndAnswer, name);
    }
}
