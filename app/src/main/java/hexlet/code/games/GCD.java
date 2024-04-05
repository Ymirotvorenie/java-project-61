package hexlet.code.games;

public class GCD {
    public static String getQuestion() {
        return "Find the greatest common divisor of given numbers.";
    }
    public static int startGame(int a, int b) {
        if (b == 0) {
            return a;
        }
        return startGame(b, a % b);
    }
}
