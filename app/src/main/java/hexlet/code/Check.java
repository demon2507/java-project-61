package hexlet.code;
import java.util.Scanner;
import  java.util.Random;

public class Check {
    public static void checkNumber() {
        String correctAnswer = "Correct!";
         final Random random = new Random();
        int firstRandomNumber = random.nextInt();
        int secondRandomNumber = random.nextInt();
        int thirdRandomNumber = random.nextInt();
        String isEvenFirstNum = firstRandomNumber % 2 == 0 ? "yes" : "no";
        /*String isEvenSecondNum = secondRandomNumber % 2 == 0 ? "yes" : "no";
         String isEvenThirdNum = thirdRandomNumber % 2 == 0 ? "yes" : "no";*/
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner  userAnswer = new Scanner(System.in);
        System.out.print("Question: " + firstRandomNumber);
        String firstAnswer = userAnswer.next();
        System.out.println("Your answer: " + firstAnswer);
        if(firstAnswer.equals(isEvenFirstNum)) {
            System.out.println(correctAnswer);
        }
        else{
            System.out.println("'" + firstAnswer +  "'" + " is wrong answer ;(. Correct answer was " + "'" + isEvenFirstNum + "'");
            userAnswer.close();
        }

    }
}


