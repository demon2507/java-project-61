package hexlet.code;
import java.util.Scanner;
public class Calc {
    public static String nameUser = Cli.nameUser;
    public static void calculator() {
        Scanner user = new Scanner(System.in);
        System.out.println("Hello, " + nameUser + "!");
        String correctAnswer = "Correct!";
        String[] operators = {"+", "-", "*"};
        int firstNumber = 0;
        int lastNumber = 100;
        System.out.println("What is the result of the expression?");
        for(int i = 0; i < 3; i++) {
            int firstRandomNum = firstNumber + (int) (Math.random() * lastNumber);
            int secondRandomNum = firstNumber + (int) (Math.random() * lastNumber);
            int numOfOperator = 0 + (int) (Math.random() * 2);
            int resultOfExpression = firstRandomNum + secondRandomNum;
            System.out.print("Question: " + firstRandomNum + operators[numOfOperator] + secondRandomNum + "\n");
            System.out.print("Your answer: ");
            String answer = user.next();
            int userAnswer = Integer.valueOf(answer);
            if(userAnswer == resultOfExpression) {
                System.out.println(correctAnswer);
            } else { System.out.println("'" + answer +  "'" + " is wrong answer ;(. Correct answer was " + "'" + resultOfExpression + "'" + "\n" + "Let`s try again, " + nameUser + "!");
                System.exit(0);

            }
        }
        System.out.print("Congratulations, " + nameUser + "!");

    }

}



