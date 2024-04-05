package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class GCD {
    private static final  int MIN_NUM = 0;
    private static final int MAX_NUM = 500;
    public static String getTask() {
        return "Find the greatest common divisor of given numbers.";
    }
    public static String[][] getGameResult() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][Engine.QUESTION_PARTS];
        for (int i = 0; i < gameData.length; i++) {
            int number1 = Random.getRandNum(MIN_NUM, MAX_NUM);
            int number2 = Random.getRandNum(MIN_NUM, MAX_NUM);
            int result = gcd(number1, number2);
            String question = number1 + " " + number2;
            gameData[i] = new String[]{question, String.valueOf(result)};
        }
        return gameData;
    }
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
