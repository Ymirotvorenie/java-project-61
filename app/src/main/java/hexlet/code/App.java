package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String user = null;
        int choice = 1;

        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
        if (s.hasNextInt()) {
            choice = s.nextInt();
            switch (choice) {
                case 0:
                    return;
                case 1:
                    Engine.startGame("", choice);
                    break;
                case 2:
                    Engine.startGame(Even.question, choice);
                    break;
                case 3:
                    Engine.startGame(Calc.question, choice);
                default:
                    break;

            }
        } else {
            throw new IllegalArgumentException("Enter number of task!");
        }
    }
}