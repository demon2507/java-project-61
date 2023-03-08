package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static String nameUser;
    public static void askingNameUser() {
            System.out.println("Welcome to the Brain Games!");
            Scanner  scanner = new Scanner(System.in);
            System.out.println("May I have your name?");
            nameUser = scanner.next();
            System.out.println("Hello, " + nameUser + "!");
        }
    }




