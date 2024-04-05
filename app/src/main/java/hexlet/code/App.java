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
                    Engine.startGame("", UserChoice.GREET);
                    break;
                case EVEN:
                    Engine.startGame(Even.getQuestion(), UserChoice.EVEN);
                    break;
                case CALC:
                    Engine.startGame(Calc.getQuestion(), UserChoice.CALC);
                    break;
                case GCD:
                    Engine.startGame(GCD.getQuestion(), UserChoice.GCD);
                    break;
                case PROGRESSION:
                    Engine.startGame(Progression.getQuestion(), UserChoice.PROGRESSION);
                    break;
                case PRIME:
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
