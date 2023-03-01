package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner  choice = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        String numberOfGame = choice.next();
        System.out.println("Your choice: " + numberOfGame);
        System.out.print("Welcome to the Brain Games!");
        Cli.askingNameUser();
    }
}

