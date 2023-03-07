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
        switch(numberOfGame) {
            case "0":
                System.exit(0);
                break;
            case "1":
                System.out.println("Welcome to the Brain Games!");
                Cli.askingNameUser();
                break;
            case "2":
                System.out.println("Welcome to the Brain Games!");
                Cli.askingNameUser();
                IsEven.checkNumber();
        }
    }
}

