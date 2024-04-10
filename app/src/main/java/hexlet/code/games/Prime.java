package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Prime {
    private static final int MIN_NUM = 0;
    private static final int MAX_NUM = 999;
    public static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String[] getRoundResult() {
        int number = Random.getRandNum(MIN_NUM, MAX_NUM);
        String answer = isPrime(number) ? "yes" : "no";

        return new String[]{String.valueOf(number), answer};
    }

    public static void startGame() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][Engine.QUESTION_PARTS];
        for (int i = 0; i < gameData.length; i++) {
            gameData[i] = getRoundResult();
        }
        Engine.action(TASK, gameData);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
