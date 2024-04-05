package hexlet.code.games;

public class Progression {
    public static String question = "What number is missing in the progression?";

    public static int startGame(int arraySize, int skipPosition, int progressionStep, int startPosition) {
        int answer = 0;
        for (int i = 0; i < arraySize; i++) {
            if (i != skipPosition) {
                System.out.print(startPosition + progressionStep * i + " ");
            } else {
                answer = startPosition + progressionStep * i;
                System.out.print("..");
            }
        }
        return answer;
    }
}

