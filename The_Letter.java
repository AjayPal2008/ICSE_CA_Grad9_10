//Prg - 16
//This program
import java.util.Scanner;

public class The_Letter
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);

        double a , b , S ;

        System.out.println("enter one value");
        a=sc.nextInt();

        System.out.println("enter another value");
        b=sc.nextInt();

        S = Math.abs(a) + Math.abs(b) + (Math.pow(a,3) + Math.pow(b,3));

        System.out.println("The value of S is : \t"+ S);

    }
}
