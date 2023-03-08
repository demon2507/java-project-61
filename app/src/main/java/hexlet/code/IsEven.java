package hexlet.code;
import java.util.Scanner;
public class IsEven {
     public  static String nameOfUser = Cli.nameUser;
    public static void checkNumber() {
        String correctAnswer = "Correct!";
        Scanner user = new Scanner(System.in);
        int firstNumber = 0; // Начальное значение диапазона - "от"
        int lastNumber = 100; // Конечное значение диапазона - "до"
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            for(int i = 0; i < 3; i++) {
            int randomNum = firstNumber + (int) (Math.random() * lastNumber);
            String isEvenRandomNum = randomNum % 2 == 0 ? "yes" : "no";
            System.out.print("Question: " + randomNum + "\n");
            System.out.print("Your answer: ");
            String answer = user.next();
            if(answer.equals(isEvenRandomNum)) {
                System.out.println(correctAnswer);
                } else { System.out.println("'" + answer +  "'" + " is wrong answer ;(. Correct answer was " + "'" + isEvenRandomNum + "'" + "\n" + "Let`s try again, " + nameOfUser + "!");
                    System.exit(0);

                }
            }
         System.out.print("Congratulations, " + nameOfUser + "!");

    }
}


