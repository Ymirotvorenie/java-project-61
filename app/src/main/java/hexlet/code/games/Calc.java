package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Calc {
    private static final int MIN = 0;
    private static final int MAX_NUM = 200;
    private static final char[] OPERATORS = {'+', '-', '*'};
    public static String getTask() {
        return "What is the result of the expression?";
    }
    public static String[][] getGameResult() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][Engine.QUESTION_PARTS];
        for (int i = 0; i < gameData.length; i++) {
            int number1 = Random.getRandNum(MIN, MAX_NUM);
            int number2 = Random.getRandNum(MIN, MAX_NUM);
            char operator = OPERATORS[Random.getRandNum(MIN, OPERATORS.length - 1)];

            String question = number1 + " " + operator + " " + number2;
            int result = GamesUtils.calculate(operator, number1, number2);
            gameData[i] = new String[] {question, String.valueOf(result)};
        }
        return gameData;
    }
}
