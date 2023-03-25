//Prg -14
//This program swaps/exchange two values
import java.util.Scanner;
public class Switch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);

        char a , b , z ;

        System.out.println("Enter a character  :  ");
        a=sc.next().charAt(0);

        System.out.println("Enter another character    :  ");
        b=sc.next().charAt(0);

        System.out.println("Before Exchange");
        System.out.println("The present value of the first character   is   :  " + a);
        System.out.println("The present value of the second character   is   :  " + b);

        z = b;
        b = a ;
        a = z ;

        System.out.println("After Exchange");
        System.out.println("The new value of the first character   is   :  " + a);
        System.out.println("The new value of the second character   is   :  " + b);


    }
}
