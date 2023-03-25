
import java.util.Scanner;

public class Quotient_Remainder
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double a, b, quo1, quo2, prod, sum;

        System.out.println("Enter two numbers");

        System.out.println("Enter the first number");
        a = sc.nextDouble();

        System.out.println("Enter the second number");
        b = sc.nextDouble();

        quo1 = a / 10;
        quo2 = b / 10;

        sum = (((int) quo1) + (((int) quo2)));
        prod = (((int) a % 10)) * (((int) b % 10));

        System.out.println("the sum of the  quotients of "+a+" and "+b+" is "+ sum);
        System.out.println("the product of the  remainders of "+a+" and "+b+"is"+ prod);
    }
}










