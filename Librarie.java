import java.util.Scanner;

public class Librarie
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int code , days ;
        char name;

        /*System.out.println("Enter the book code :");
        code = sc.nextInt();

        System.out.println("Enter the book name :");
        name = sc.next().charAt(0); */

        System.out.println("Enter the number of days :");
        days = sc.nextInt();

        if (days <= 12 && days>7)
            System.out.println("You have to pay :" + 5*3 );

        else if (days>12 && days<18)
            System.out.println("You have to pay :" + (5*3 + 5*5 )  ) ;

        else if (days>17)
            System.out.println("You have to pay :" + (5*3 + 5*5 + ((days - 17)*10)) );

        else if (days<=7)
            System.out.println("You don't have to pay any fines");

        else
            System.out.println("illegal statement enter input again");

    }
}




