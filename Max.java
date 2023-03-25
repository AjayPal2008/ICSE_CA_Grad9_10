//Prg - 9
//This program find the greatest of two numbers
import java.util.Scanner;

public class Max
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        double a , b,t;


        System.out.println ("enter the first number");
        a = sc.nextDouble();

        System.out.println ("enter the second number");
        b = sc.nextDouble();

        t =(a>b)?a:b;

        System.out.println("The greatest value is : \t " + t);



    }
}
