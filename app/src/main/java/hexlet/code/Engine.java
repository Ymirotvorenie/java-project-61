package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class Engine {
    public static final int START = 0;
    public static final int FINISH = 999;
    public static final int PROGRESSION_SIZE = 12;
    public static final int ROUNDS_COUNT = 3;
    public static final int MIN_PROGRESSION_STEP = 2;
    public static final int MAX_PROGRESSION_STEP = 22;
    public static final int MAX_PRIME_NUMBER = 3571;
    public static int getRandNum(int startNum, int endNum) {
        return startNum + (int) (Math.random() * endNum);
    }
    public static String getUserInput() {
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
    public static void startGame(String question, UserChoice choice) {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        String user = getUserInput();
        System.out.println("Hello, " + user + "!");
        if (choice == UserChoice.GREET) {
            return;
        }
        System.out.println(question);
        Scanner s = new Scanner(System.in);

        String answer = null;
        String correctAnswer = null;
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            switch (choice) {
                case EVEN:
                    int number = getRandNum(START, FINISH);
                    System.out.print("Question: " + number);
                    correctAnswer = Even.startGame(number) ? "yes" : "no";
                    break;
                case CALC:
                    int a = getRandNum(START, FINISH);
                    int b = getRandNum(START, FINISH);
                    correctAnswer = String.valueOf(Calc.startGame(a, b));
                    break;
                case GCD:
                    int c = getRandNum(START, FINISH);
                    int d = getRandNum(START, FINISH);
                    System.out.print("Question: " + c + " " + d);
                    correctAnswer = String.valueOf(GCD.startGame(c, d));
                    break;
                case PROGRESSION:
                    int skipPosition = getRandNum(START, PROGRESSION_SIZE - 1);
                    int progressionStep = getRandNum(MIN_PROGRESSION_STEP, MAX_PROGRESSION_STEP);
                    int startPosition = getRandNum(START, FINISH);
                    correctAnswer = String.valueOf(Progression.startGame(PROGRESSION_SIZE, skipPosition,
                            progressionStep, startPosition));
                    break;
                case PRIME:
                    int num = getRandNum(START, MAX_PRIME_NUMBER);
                    System.out.print("Question: " + num);
                    correctAnswer = Prime.startGame(num) ? "no" : "yes";
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
