package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner  choice = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String numberOfGame = choice.next();
        System.out.print("\n");
        switch(numberOfGame) {
            case "0":
                System.exit(0);
                break;
            case "1":
                Cli.askingNameUser();
                break;
            case "2":
               Engine.engine("2");
            break;
            case "3":
                Engine.engine("3");
                break;
            case "4":
              Engine.engine("4");

        }
    }
}

