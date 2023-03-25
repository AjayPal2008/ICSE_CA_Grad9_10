//Prg - 5
//This program swaps the values
import java.util.Scanner;
public class Exchange
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);

        int a , b , z ;

        System.out.println("Enter a number  :  ");
        a=sc.nextInt();

        System.out.println("Enter another number  :  ");
        b=sc.nextInt();

        System.out.println("Before Exchange");
        System.out.println("The present value of the first number is   :  " + a);
        System.out.println("The present value of the second number is   :  " + b);

        z = b;
        b = a ;
        a = z ;
        System.out.println("After Exchange");
        System.out.println("The new value of the first number is   :  " + a);
        System.out.println("The new value of the second number is   :  " + b);
    }
}
