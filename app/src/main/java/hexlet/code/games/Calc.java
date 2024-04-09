package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Calc {
    private static final int MIN = 0;
    private static final int MAX_NUM = 200;
    private static final char[] OPERATORS = {'+', '-', '*'};
    public static final String TASK = "What is the result of the expression?";
    public static int calculate(char operator, int number1, int number2) {
        return switch (operator) {
            case '+' -> number1 + number2;
            case '-' -> number1 - number2;
            case '*' -> number1 * number2;
            default -> throw new RuntimeException("Wrong expression operator");
        };
    }
    public static String[] getRoundResult() {
        int number1 = Random.getRandNum(MIN, MAX_NUM);
        int number2 = Random.getRandNum(MIN, MAX_NUM);
        char operator = OPERATORS[Random.getRandNum(MIN, OPERATORS.length - 1)];

        String question = number1 + " " + operator + " " + number2;
        int result = calculate(operator, number1, number2);

        return new String[]{question, String.valueOf(result)};
    }
    public static void startGame() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][Engine.QUESTION_PARTS];
        for (int i = 0; i < gameData.length; i++) {
            gameData[i] = getRoundResult();
        }
        Engine.action(TASK, gameData);
    }
}

