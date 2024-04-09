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
    public static final String TASK = "What number is missing in the progression?";
    public static int[] generateProgression(int size, int start, int step) {
        int[] progression = new int[size];
        for (int i = 0; i < size; i++) {
            progression[i] = (start + step * i);
        }
        return progression;
    }
    public static String[] getRoundResult() {
        int progressionSize = Random.getRandNum(MIN_SIZE, MAX_SIZE);
        int progressionStep = Random.getRandNum(MIN_STEP, MAX_STEP);
        int startPosition = Random.getRandNum(MIN_START, MAX_START);
        int skipPosition = Random.getRandNum(MIN_SKIP, progressionSize - 1);
        int[] progression = generateProgression(progressionSize, startPosition, progressionStep);
        StringBuilder question = new StringBuilder();
        int answer = 0;
        for (int number : progression) {
            if (number != skipPosition) {
                question.append(number).append(" ");
            } else {
                answer = number;
                question.append(".. ");
            }
        }
        return new String[]{question.toString(), String.valueOf(answer)};
    }
    public static void startGame() {
        String[][] gameData = new String[Engine.ROUNDS_COUNT][Engine.QUESTION_PARTS];
        for (int i = 0; i < gameData.length; i++) {
            gameData[i] = getRoundResult();
        }
        Engine.action(TASK, gameData);
    }
}

