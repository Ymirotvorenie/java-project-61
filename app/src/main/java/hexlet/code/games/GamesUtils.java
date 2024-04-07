package hexlet.code.games;

public class GamesUtils {
    public static int calculate(char operator, int number1, int number2) {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            default:
                throw new RuntimeException("Wrong expression operator");
        }
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static int getGCD(int a, int b) {
        return b == 0 ? a : getGCD(b, a % b);
    }
//    public static int[] generateProgression(int size, int start, int step) {
//        int[] progression = new int[size];
//        for (int i = 0; i < size; i++) {
//            progression[i] = (start + step * i);
//            }
//        return progression;
//    }
    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
