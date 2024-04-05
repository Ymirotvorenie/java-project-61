package hexlet.code.games;

public class Calc {
    public static String getQuestion() {
        return "What is the result of the expression?";
    }
    private static char mathOperation = '+';
    public static void getRandOperation() {
        final int start = 1;
        final int finish = 3;
        int result = start + (int) (Math.random() * finish);
        switch (result) {
            case 1 :
                mathOperation = '+';
                break;
            case 2:
                mathOperation = '-';
                break;
            case 3:
                mathOperation = '*';
            default:
                break;
        }
    }
    public static int startGame(int a, int b) {
        getRandOperation();
        System.out.print("Question: " + String.valueOf(a) + " " + mathOperation + " " + String.valueOf(b));
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
