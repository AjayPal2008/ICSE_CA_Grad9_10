//Prg - 4
//Display the colours - use of if else and logical operators
import java.util.Scanner;

public class Colours
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        char a ;
        System.out.println("Enter  a letter from VIBGYOR ");
        a = sc.next().charAt(0);
        System.out.println("Value of a is" + a);
        int i = (int)a;
        System.out.println("vale of i is" + i);
         if (i == 86 || i==118)
             System.out.println("Violet");
         else if (i== 73 || i== 105)
             System.out.println("Indigo");
         else if (i== 66 || i==98)
             System.out.println("Blue");
         else if (i== 71 || i== 103)
             System.out.println("Green");
         else if (i== 89 || i==  121)
             System.out.println("Yellow");
         else if (i==79 || i == 111)
             System.out.println("Orange");
         else if (i==82 || i == 114)
             System.out.println("Red");
         else
             System.out.println("wrong input , please enter value again");
    }
}
