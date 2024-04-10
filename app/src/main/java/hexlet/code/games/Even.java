package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Even {
    private static final int MIN_NUM = 0;
    private static final int MAX_NUM = 999;
    public static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static String[] getRoundResult() {
        int number = Random.getRandNum(MIN_NUM, MAX_NUM);
        String question = String.valueOf(number);

        return new String[]{question, isEven(number) ? "yes" : "no"};
    }

    public static void startGame() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][Engine.QUESTION_PARTS];
        for (int i = 0; i < gameData.length; i++) {
            gameData[i] = getRoundResult();
        }
        Engine.action(TASK, gameData);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
