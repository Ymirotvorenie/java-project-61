package hexlet.code.games;

public class Prime {
    public static String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static boolean startGame(int number) {
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
