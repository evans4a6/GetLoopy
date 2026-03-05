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


        do {

                die1 = 0;
                die2 = 1;
                die3 = 2;
                rollNumber = 0;

                System.out.println("Roll:      Die1  Die2  Die3  Sum");
                System.out.println("________________________________");

                while (!(die1 == die2 && die2 == die3)) {
                    rollNumber++;
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    die3 = rnd.nextInt(6) + 1;

                    int dieRoll = die1 + die2 + die3;

                    System.out.printf("Roll: %-4d %4d %4d %4d %4d\n", rollNumber, die1, die2, die3, dieRoll);
                }

            System.out.print("\nTriple! Would you like to play again? [Y/N]: ");
            answer = in.nextLine().toUpperCase();

            if (answer.equals("Y"))
            {
                playAgain = false;
            }
            else
            {
                System.out.println("\nThanks for playing!");
                playAgain = true;
            }
        }while (!playAgain);
    }
}
