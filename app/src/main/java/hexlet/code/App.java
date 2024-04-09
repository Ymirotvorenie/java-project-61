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
                case GREET -> Cli.greetUser();
                case EVEN -> Even.startGame();
                case CALC -> Calc.startGame();
                case GCD -> GCD.startGame();
                case PROGRESSION -> Progression.startGame();
                case PRIME -> Prime.startGame();
                default -> throw new RuntimeException("Enter game number!");
            }
        } else {
            throw new IllegalArgumentException("Enter number of task!");
        }
    }
}
