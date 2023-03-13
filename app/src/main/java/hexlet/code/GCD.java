package hexlet.code;
import java.util.Scanner;

public class GCD {
    public static String nameUser = Cli.nameUser;
    public static int gcd_3(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    public static void gcd() {
        Scanner user = new Scanner(System.in);
        String correctAnswer = "Correct!";
        int firstNumber = 0;
        int lastNumber = 100;
        System.out.println("What is the result of the expression?");
            int firstRandomNum = firstNumber + (int) (Math.random() * lastNumber);
            int secondRandomNum = firstNumber + (int) (Math.random() * lastNumber);
            int nod = gcd_3(firstRandomNum, secondRandomNum);
            System.out.println(firstRandomNum + " " + secondRandomNum);
            System.out.print("Your answer: ");
            String answer = user.next();
            int userAnswer = Integer.parseInt(answer);
            if(nod == userAnswer) {
                System.out.println(correctAnswer);
            } else { System.out.println("'" + answer +  "'" + " is wrong answer ;(. Correct answer was " + "'" + nod + "'" + "\n" + "Let`s try again, " + nameUser + "!");
                System.exit(0);

            }
    }
}


