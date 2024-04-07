package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Prime {
    private static final int MIN_NUM = 0;
    private static final int MAX_NUM = 999;
    public static String getTask() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    public static String[][] getGameResult() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][Engine.QUESTION_PARTS];
        for (int i = 0; i < gameData.length; i++) {
            int number = Random.getRandNum(MIN_NUM, MAX_NUM);
            String answer = GamesUtils.isPrime(number) ? "yes" : "no";
            gameData[i] = new String[]{String.valueOf(number), answer};
        }
        return gameData;
    }
}
