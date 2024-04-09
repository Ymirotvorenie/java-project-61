package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static final int QUESTION_PARTS = 2;
    public static final int QUESTION_INDEX = 0;
    public static final int ANSWER_INDEX = 1;

    public static void action(String task, String[][] gameData) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        String user = sc.nextLine();
        System.out.println("Hello, " + user + "!");

        System.out.println(task);
        for (String[]roundData : gameData) {
            System.out.println("Question: " + roundData[QUESTION_INDEX]);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();

            if (answer.equals(roundData[ANSWER_INDEX])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + roundData[ANSWER_INDEX] + "'.");
                System.out.println("Let's try again, " + user + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + user + "!");
    }
}
