package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String getUserName() {
        Scanner s = new Scanner(System.in);

        return s.nextLine();
    }
}
