//Prg - 6
//This program finds the factorial of a given number
import java.util.Scanner;
public class Factorials
{
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        int x, Sum = 0, w, n, r, fact = 1;

        System.out.println("Enter a number : ---------->")

        x = sc.nextInt();

        System.out.println("Enter another  number : ---------->")

        n = sc.nextInt();

        for (r = 1; r < = n; r++)
        {   if (r % 2 == 0)
                x = -1 * x;

        for (w = 1; w <= r; w++) {
            fact = fact * w;
        }
        sum = sum + ((math.pow(x, r)) / fact);
    }








    }
}
