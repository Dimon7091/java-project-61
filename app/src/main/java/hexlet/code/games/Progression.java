package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void game(String name) {
        Random random = new Random();
        final int numOfQuestions = 3;
        // Массив вопрос ответ, отправляется в движок, колличество раундов зависить от длины.
        String[][] questionAndAnswer = new String[numOfQuestions][2];
        String description = "What number is missing in the progression?";
        // Цикл наполняет массив, вопрос, ответ.
        for (var i = 0; i < questionAndAnswer.length; i++) {
            //Длинна шага.
            final int startStep = 2;
            final int finisStep = 5;
            int randomStep = random.nextInt(startStep, finisStep);
            //Диапазон чисел начального числа.
            final int startRange = 2;
            final int finisRange = 49;
            int startNumber = random.nextInt(startRange, finisRange);
            //Позиция спрятанного числа
            final int startPosition = 1;
            final int finishPosition = 10;
            int randomPosition = random.nextInt(startPosition, finishPosition);
            //Колличество цифр в строке вопроса.
            final int rowLength = 10;
            int rowNumber = startNumber;
            int hiddenNumber = 0;
            StringBuilder rowString = new StringBuilder();
            for (var j = 0; j < rowLength; j++) {
                rowNumber += randomStep;
                if (j == randomPosition) {
                    rowString.append(".. ");
                    hiddenNumber = rowNumber;
                } else {
                    StringBuilder append = rowString.append(rowNumber + " ");
                }
            }
            questionAndAnswer[i][0] = rowString.toString();
            questionAndAnswer[i][1] = String.valueOf(hiddenNumber);
        }
        Engine.logicOfGames(description, questionAndAnswer, name);
    }
}
