package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;

public class Progression {
    private static final int MIN_SIZE = 8;
    private static final int MAX_SIZE = 13;
    private static final int MIN_STEP = 2;
    private static final int MAX_STEP = 22;
    private static final int MIN_START = 0;
    private static final int MAX_START = 500;
    private static final int MIN_SKIP = 0;

    public static String getTask() {
        return "What number is missing in the progression?";
    }

    public static String[][] getGameResult() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][Engine.QUESTION_PARTS];

        for (int i = 0; i < gameData.length; i++) {
            int progressionSize = Random.getRandNum(MIN_SIZE, MAX_SIZE);
            int progressionStep = Random.getRandNum(MIN_STEP, MAX_STEP);
            int startPosition = Random.getRandNum(MIN_START, MAX_START);
            int skipPosition = Random.getRandNum(MIN_SKIP, progressionSize - 1);
            StringBuilder question = new StringBuilder();
            int answer = 0;
            for (int j = 0; j < progressionSize; j++) {
                if (j != skipPosition) {
                    question.append(startPosition + progressionStep * j).append(" ");
                } else {
                    answer = startPosition + progressionStep * j;
                    question.append(startPosition + progressionStep * j).append(" ");
                }
            }
            gameData[i] = new String[] {question.toString(), String.valueOf(answer)};
        }
        return gameData;
    }
}

