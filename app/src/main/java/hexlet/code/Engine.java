package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static int getRandNum(int startNum, int endNum) {
        return startNum + (int) (Math.random() * endNum);
    }
    public static String getUserInput() {
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
    public static void startGame(String question, int choice) {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        String user = getUserInput();
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
                    int number = getRandNum(0, 999);
                    System.out.print("Question: " + number);
                    correctAnswer = Even.startGame(number) ? "yes" : "no";
                    break;
                case 3:
                    int a = getRandNum(0, 999);
                    int b = getRandNum(0, 999);
                    correctAnswer = String.valueOf(Calc.startGame(a, b));
                    break;
                case 4:
                    int c = getRandNum(0, 999);
                    int d = getRandNum(0, 999);
                    System.out.print("Question: " + c + " " + d);
                    correctAnswer = String.valueOf(GCD.startGame(c, d));
                    break;
                case 5:
                    int arraySize = getRandNum(8, 15);
                    int skipPosition = getRandNum(0, arraySize - 1);
                    int progressionStep = getRandNum(2, 15);
                    int startPosition = getRandNum(0, 99);
                    correctAnswer = String.valueOf(Progression.startGame(arraySize, skipPosition,
                            progressionStep, startPosition));
                    break;
                case 6:
                    int num = getRandNum(0, 3571);
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
