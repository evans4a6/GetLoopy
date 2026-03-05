import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Random rnd = new Random();

        int die1 = 0;
        int die2 = 1;
        int die3 = 2;
        int rollNumber = 0;
        boolean playAgain = false;
        String answer = "";

        System.out.println("Roll:      Die1  Die2  Die3  Sum");
        System.out.println("________________________________");


        do {

            while (!(die1 == die2 && die2 == die3)) {
                rollNumber++;
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                die3 = rnd.nextInt(6) + 1;

                int dieRoll = die1 + die2 + die3;

                System.out.printf("Roll: %-4d %4d %4d %4d %4d\n", rollNumber, die1, die2, die3, dieRoll);
            }


        }while (!playAgain);
    }
}
