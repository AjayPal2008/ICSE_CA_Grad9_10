//Prg -12
//This program finds the prime and palindrome
import java.util.Scanner;
public class Prime__Palindrome
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);

        int a , b , c , d , e=2 , f=0 , g , h;


        System.out.println (" Enter a number");

        a = sc.nextInt();
        d = a ;

        while (a>=0)
        {
            b = a % 10;
            if (a==d) {
                if (b == 1)

                    e = 1;
            }

            else if (a==1)

                f=1;


            else
            {}

                a=a/10;


        }
        h=0;

        for ( g = 1 ; g<= d ; g++)
        {
            if(d%g==0)
                h=h+1;
        }


        if(h==2 && e==f)

            System.out.println("PALINDROME NUMBER");

        else

            System.out.println("NOT A PALINDROME NUMBER");





    }

}
