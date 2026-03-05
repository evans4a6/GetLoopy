import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int rows = 5;
        int stars = 5;

        Scanner in = new Scanner(System.in);
        for(int c = 0; c <= 30; c++)
        {
            System.out.printf("%3d |", c);
        }
        System.out.println("\n");

        for (int b = 30; b >= 0; b--)
        {
            System.out.printf("%3d |", b);
        }
        System.out.println("\n");

        for (int d = 0; d <= 18; d += 3)
        {
            System.out.printf("%3d |", d);
        }
        System.out.println("\n");

        for (int a = 10; a >= 0; a -= 2)
        {
            System.out.printf("%3d |", a);
        }
        System.out.println("\n");
        System.out.println("\n");

        // Part 2


        for (int e = 0; e < rows; e++)
        {
            for (int f = 0; f < stars; f++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");

        for (int g = 1; g <= rows; g++)
        {
        for (int h = 1; h <= g; h++)
        {
            System.out.print("* ");
        }
            System.out.println();
        }
        System.out.println("\n");

        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        }
}