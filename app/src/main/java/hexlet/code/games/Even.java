package hexlet.code.games;

public class Even {
    public static String getQuestion() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    public static boolean startGame(int number) {
        return number % 2 == 0;
    }
}
