package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void game() {
        Random random = new Random();
        // Массив вопрос ответ, отправляется в движок, колличество раундов зависить от длины.
        String[][] QuestionAndAnswer = new String[3][2];
        String description = "What number is missing in the progression?";
        // Цикл наполняет массив, вопрос, ответ.
        for (var i = 0; i < QuestionAndAnswer.length; i++) {
            int randomStep = random.nextInt(2, 5);
            int startNumber = random.nextInt(2, 49);
            int randomPosition = random.nextInt(1, 10);
            int rowLength = 10;
            int rowNumber = startNumber;
            int hiddenNumber = 0;
            StringBuilder rowString = new StringBuilder(" ");
            for (var j = 0; j < rowLength; j++ ) {
                    rowNumber += randomStep;
                if (j == randomPosition) {
                    rowString.append("* ");
                    hiddenNumber = rowNumber;
                } else {
                    rowString.append(rowNumber + " ");
                }
            }
            QuestionAndAnswer[i][0] = rowString.toString();
            QuestionAndAnswer[i][1] = String.valueOf(hiddenNumber);
        }
        Engine.logicOfGames(description, QuestionAndAnswer);
    }
}
