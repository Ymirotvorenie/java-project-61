package hexlet.code;

import java.util.Scanner;

public class Even {
    private static final int ROUNDS_COUNT = 3;
    private static int curNum;
    public static int getRoundsCount() {
        return ROUNDS_COUNT;
    }
    public static int getCurNum() {
        return curNum;
    }
    public static void getRandNum() {
        int start = 0;
        int finish = 999;
        curNum = start + (int) (Math.random() * finish);
    }
    public static void startGame(String userInput) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner s = new Scanner(System.in);
        String answer;
        String correctAnswer;
        for (int i = 0; i < Even.getRoundsCount(); i++) {
            Even.getRandNum();
            System.out.println("Question: " + getCurNum());
            System.out.print("Your answer: ");
            answer = s.nextLine();
            if (getCurNum() % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userInput + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userInput + "!");
        s.close();
    }
}
