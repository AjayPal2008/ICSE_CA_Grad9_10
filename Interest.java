//Prg - 7
// This program calculates the interest simple and compund
import java.util.Scanner;
public class Interest
{
    public static void main (String args[])
    {
        Scanner  sc = new Scanner(System.in);

        int a ;
        double principle , rate , time , Compound_interest , Simple_interest , Amount  ;

        System.out.println("choose simple interest by typing 1 \t or \t compound interest by typing 2 ");
        a=sc.nextInt();
// switch option
        switch (a)
        {
            case 1 :
                System.out.println("\n \n enter the principle amount");
                principle=sc.nextDouble();
                System.out.println("enter the Interest rate");
                rate=sc.nextDouble();
                System.out.println("enter the term in years ");
                time=sc.nextDouble();

                Simple_interest = (principle * rate * time)/100 ;
                Amount = Simple_interest + principle;

                System.out.println("the amount is : " + Amount);
                System.out.println("the simple interest is : " + Simple_interest);

                break;

            case 2 :
                System.out.println("enter the principle");
                principle=sc.nextDouble();
                System.out.println("enter the rate");
                rate=sc.nextDouble();
                System.out.println("enter the time in years");
                time=sc.nextDouble();

                Amount = principle * (( Math.pow((1+rate/100),time)));
                Compound_interest = Amount - principle;


                System.out.println("the amount is : " + Amount);
                System.out.println("the compound interest is : " + Compound_interest);

                break ;

            default:
                throw new java.lang.IllegalStateException("Unexpected value: " + a +"\n  \n \n Please enter the value again");
        }


    }
}
