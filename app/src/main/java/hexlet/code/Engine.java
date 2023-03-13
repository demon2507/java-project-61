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
            case "2":
                IsEven.checkNumber(nameOfUser);
                IsEven.checkNumber(nameOfUser);
                IsEven.checkNumber(nameOfUser);
                break;
            case "3":
                Calc.calculator(nameOfUser);
                Calc.calculator(nameOfUser);
                Calc.calculator(nameOfUser);
                break;
            case "4":
                GCD.gcd(nameOfUser);
                GCD.gcd(nameOfUser);
                GCD.gcd(nameOfUser);
                break;
        }
         System.out.print("Congratulations, " + nameOfUser + "!");
    }

}




