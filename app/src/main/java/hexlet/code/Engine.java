package hexlet.code;
import java.util.Scanner;
public class Engine{
    public static String greeting() {
        System.out.println("Welcome to the Brain Games!");
        Scanner  scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String nameOfUser = scanner.next();
        System.out.println("Hello, " + nameOfUser + "!");
        return nameOfUser;
    }
    public static void engine(String choiceOfGame) {
        String nameOfUser = greeting();
        switch (choiceOfGame) {
            case "1":
                System.exit(0);
                break;
            case "2":
                IsEven.checkNumber();
                IsEven.checkNumber();
                IsEven.checkNumber();
                break;
            case "3":
                Calc.calculator();
                Calc.calculator();
                Calc.calculator();
                break;
            case "4":
                GCD.gcd();
                GCD.gcd();
                GCD.gcd();
                break;
        }
         System.out.print("Congratulations, " + nameOfUser + "!");
    }

}




