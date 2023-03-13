package hexlet.code;
import java.util.Scanner;
public class Calc {
    public static String nameUser = Cli.nameUser;
    public static void calculator() {
        Scanner user = new Scanner(System.in);
        String correctAnswer = "Correct!";
        String[] operators = {"+", "-", "*"};
        int numOfOperator = (int) (Math.random() * 2);
        int resultOfExpression = 0;
        int firstNumber = 0;
        int lastNumber = 100;
        int firstRandomNum = firstNumber + (int) (Math.random() * lastNumber);
        int secondRandomNum = firstNumber + (int) (Math.random() * lastNumber);
        System.out.println("What is the result of the expression?");
            switch (operators[numOfOperator]){
                case "+":
                    resultOfExpression = firstRandomNum + secondRandomNum;
                    break;
                case "-":
                    resultOfExpression = firstRandomNum -secondRandomNum;
                    break;
                case "*":
                    resultOfExpression = firstRandomNum * secondRandomNum;
                    break;
            }
            System.out.print("Question: " + firstRandomNum + operators[numOfOperator] + secondRandomNum + "\n");
            System.out.print("Your answer: ");
            String answer = user.next();
            int userAnswer = Integer.parseInt(answer);
            if(userAnswer == resultOfExpression) {
                System.out.println(correctAnswer);
            } else { System.out.println("'" + answer +  "'" + " is wrong answer ;(. Correct answer was " + "'" + resultOfExpression + "'" + "\n" + "Let`s try again, " + nameUser + "!");
                System.exit(0);

            }
    }

}



