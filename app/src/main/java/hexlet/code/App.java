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

        UserChoice choice;

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        if (s.hasNextInt()) {
            choice = UserChoice.values()[(s.nextInt())];
            switch (choice) {
                case EXIT:
                    return;
                case GREET:
                    Engine.greet();
                    break;
                case EVEN:
                    Engine.action(Even.getTask(), Even.getGameResult());
                    break;
                case CALC:
                    Engine.action(Calc.getTask(), Calc.getGameResult());
                    break;
                case GCD:
                    Engine.action(GCD.getTask(), GCD.getGameResult());
                    break;
                case PROGRESSION:
                    Engine.action(Progression.getTask(), Progression.getGameResult());
                    break;
                case PRIME:
                    Engine.action(Prime.getTask(), Prime.getGameResult());
                    break;
                default:
                    break;

            }
        } else {
            throw new IllegalArgumentException("Enter number of task!");
        }
    }
}
