package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Even {
    public static void game() {
        Random random = new Random();
        // Массив вопрос ответ, отправляется в движок, колличество раундов зависить от длины.
        String[][] QestionAndAnswer = new String[3][2];
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        // Цикл наполняет массив, вопрос, ответ.
        for (var i = 0; i < QestionAndAnswer.length; i++) {
            int randomInt = random.nextInt(1, 100);
            QestionAndAnswer[i][0] = String.valueOf(randomInt);
            String correctAnswer = (randomInt % 2 == 0) ? "yes" : "no";
            QestionAndAnswer[i][1] = correctAnswer;
        }
        Engine.logicOfGames(description, QestionAndAnswer);
    }
}
