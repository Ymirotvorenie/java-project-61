package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String user = null;
        int choice = 1;

        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        if (s.hasNextInt()) {
            choice = s.nextInt();
            switch (choice) {
                case 0:
                    return;
                case 1:
                    Engine.startGame("", UserChoice.GREET);
                    break;
                case 2:
                    Engine.startGame(Even.getQuestion(), UserChoice.EVEN);
                    break;
                case 3:
                    Engine.startGame(Calc.getQuestion(), UserChoice.CALC);
                    break;
                case 4:
                    Engine.startGame(GCD.getQuestion(), UserChoice.GCD);
                    break;
                case 5:
                    Engine.startGame(Progression.getQuestion(), UserChoice.PROGRESSION);
                    break;
                case 6:
                    Engine.startGame(Prime.getQuestion(), UserChoice.PRIME);
                    break;
                default:
                    break;

            }
        } else {
            throw new IllegalArgumentException("Enter number of task!");
        }
    }
}
