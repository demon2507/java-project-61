package hexlet.code;
import java.util.Scanner;

public class Check {
    public static void checkNumber() {
        String correctAnswer = "Correct!";
        int firstNumber = 0; // Начальное значение диапазона - "от"
        int lastNumber = 100; // Конечное значение диапазона - "до"

        int firstRandomNumber = firstNumber + (int) (Math.random() * lastNumber);
        int secondRandomNumber = firstNumber + (int) (Math.random() * lastNumber);
        int thirdRandomNumber = firstNumber + (int) (Math.random() * lastNumber);
        String isEvenFirstNum = firstRandomNumber % 2 == 0 ? "yes" : "no";
        String isEvenSecondNum = secondRandomNumber % 2 == 0 ? "yes" : "no";
        String isEvenThirdNum = thirdRandomNumber % 2 == 0 ? "yes" : "no";
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner  userAnswer = new Scanner(System.in);
        System.out.print("Question: " + firstRandomNumber + "\n");
        String firstAnswer = userAnswer.next();
        System.out.println("Your answer: " + firstAnswer);
        if(firstAnswer.equals(isEvenFirstNum)) {
            System.out.println(correctAnswer);
        }
            else{
            System.out.println("'" + firstAnswer +  "'" + " is wrong answer ;(. Correct answer was " + "'" + isEvenFirstNum + "'");
            }
        System.out.print("Question: " + secondRandomNumber + "\n");
        String secondAnswer = userAnswer.next();
        System.out.println("Your answer: " + secondAnswer);
        if(secondAnswer.equals(isEvenSecondNum)) {
            System.out.println(correctAnswer);
        }
            else{
            System.out.println("'" + secondAnswer +  "'" + " is wrong answer ;(. Correct answer was " + "'" + isEvenSecondNum+ "'");
            }
        System.out.print("Question: " + thirdRandomNumber + "\n");
        String thirdAnswer = userAnswer.next();
        System.out.println("Your answer: " + thirdAnswer);
        if(thirdAnswer.equals(isEvenThirdNum)) {
            System.out.println(correctAnswer);
        }
        else{
            System.out.println("'" + thirdAnswer +  "'" + " is wrong answer ;(. Correct answer was " + "'" + isEvenThirdNum+ "'");
        }


    }
}


