package hexlet.code;

//import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    private static String user;
    public static int getRandNum() {
        int start = 0;
        int finish = 999;
        return start + (int) (Math.random() * finish);
    }
    public static String getUserInput() {
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
    public static void startGame(String question, int choice) {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        user = getUserInput();
        System.out.println("Hello, " + user + "!");
        if (choice == 1) {
            return;
        }
        System.out.println(question);
        Scanner s = new Scanner(System.in);

        String answer = null;
        String correctAnswer = null;
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            switch (choice) {
                case 2:
                    int number = getRandNum();
                    System.out.print("Question: " + number);
                    correctAnswer = Even.startGame(number) ? "yes" : "no";
                    break;
                case 3:
                    int a = getRandNum();
                    int b = getRandNum();
                    correctAnswer = String.valueOf(Calc.startGame(a, b));
                    break;
                case 4:
                    int c = getRandNum();
                    int d = getRandNum();
                    System.out.print("Question: " + c + " " + d);
                    correctAnswer = String.valueOf(GCD.startGame(c, d));
                    break;
                default:
                    System.out.println("Error");
                    return;
            }
            System.out.print("\nYour answer: ");
            answer = s.nextLine();
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + user + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + user + "!");
    }
}
