package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calculator {
    public static void game() {
        Random random = new Random();
        // Массив вопрос ответ, отправляется в движок, колличество раундов зависить от длины.
        String[][] QuestionAndAnswer = new String[3][2];
        String description = "What is the result of the expression?";
        // Цикл наполняет массив, вопрос, ответ.
        for (var i = 0; i < QuestionAndAnswer.length; i++) {
            int randomInt_1 = random.nextInt(10, 100);
            int randomInt_2 = random.nextInt(1, 50);
            int randomOperator = random.nextInt(0, 10);
            int Answer = 0;
            String operator = "";

            if (randomOperator % 2 == 0) {
                Answer = randomInt_1 - randomInt_2;
                operator = " - ";
            } else if (randomOperator % 2 == 1){
                Answer = randomInt_1 + randomInt_2;
                operator = " + ";
            }

            String impression = String.valueOf(randomInt_1) + operator + String.valueOf(randomInt_2);
            QuestionAndAnswer[i][0] = impression;
            String correctAnswer = String.valueOf(Answer);
            QuestionAndAnswer[i][1] = correctAnswer;
        }
        Engine.logicOfGames(description, QuestionAndAnswer);
    }
}
