package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class GCD {
    private static final  int MIN_NUM = 0;
    private static final int MAX_NUM = 500;
    public static final String TASK = "Find the greatest common divisor of given numbers.";
    public static int getGCD(int a, int b) {
        return b == 0 ? a : getGCD(b, a % b);
    }
    public static String[] getRoundResult() {
        int number1 = Random.getRandNum(MIN_NUM, MAX_NUM);
        int number2 = Random.getRandNum(MIN_NUM, MAX_NUM);
        int result = getGCD(number1, number2);
        String question = number1 + " " + number2;

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
