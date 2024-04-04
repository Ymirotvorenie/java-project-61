package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String user;
        int choice = 1;

        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        if (s.hasNextInt()) {
            choice = s.nextInt();
            switch (choice) {
                case 0:
                    return;
                case 1:
                    System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
                    user = getUserInput();
                    System.out.println("Hello, " + user + "!");
                    break;
                case 2:
                    System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
                    user = getUserInput();
                    System.out.println("Hello, " + user + "!");
                    Even.startGame(user);
                    break;
                default:
                    System.out.println("Enter correct number!");

            }

        } else {
            throw new IllegalArgumentException("Enter number of task!");
        }
    }
    public static void greet(String name) {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        System.out.println("Hello, " + name);
    }
    public static String getUserInput() {
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
}
