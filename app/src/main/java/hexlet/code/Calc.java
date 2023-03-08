package hexlet.code;
import java.util.Scanner;
public class Calc {
    public static void calculator() {
        System.out.print("May I have your name? ");
        Scanner user = new Scanner(System.in);
        String userName = user.next();
        System.out.println("Hello, " + userName + "!");
        String correctAnswer = "Correct!";
        int firstNumber = 0;
        int lastNumber = 100;
        System.out.println("What is the result of the expression?");
        for(int i = 0; i < 3; i++) {
            int firstRandomNum = firstNumber + (int) (Math.random() * lastNumber);
            int secondRandomNum = firstNumber + (int) (Math.random() * lastNumber);
            int resultOfExpression = firstRandomNum + secondRandomNum;
            String result = String.valueOf(resultOfExpression);
            System.out.print("Question: " + result + "\n");
            System.out.print("Your answer: ");
            String answer = user.next();
            if(answer.equals(result)) {
                System.out.println(correctAnswer);
            } else { System.out.println("'" + answer +  "'" + " is wrong answer ;(. Correct answer was " + "'" + result + "'" + "\n" + "Let`s try again, " + userName + "!");
                System.exit(0);

            }
        }
        System.out.print("Congratulations, " + userName + "!");

    }

}



