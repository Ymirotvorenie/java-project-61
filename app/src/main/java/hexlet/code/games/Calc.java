package hexlet.code.games;

public class Calc {
    public static String getQuestion() {
        return "What is the result of the expression?";
    }
    private static char mathOperation = '+';
    public static void getRandOperation() {
        final int start = 0;
        final int finish = 2;
        int result = start + (int) (Math.random() * finish);
        switch (result) {
            case 0:
                mathOperation = '+';
                break;
            case 1:
                mathOperation = '-';
                break;
            case 2:
                mathOperation = '*';
            default:
                break;
        }
    }
    public static int startGame(int a, int b) {
        getRandOperation();
        System.out.print("Question: " + a + " " + mathOperation + " " + b);
        switch (mathOperation) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            default:
                System.out.println("Calc game error");
                return 0;
        }
    }

}
