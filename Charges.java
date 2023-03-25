//Prg - 3
//This program calculates the agewise ticket charges
import java.util.Scanner;
public class Charges
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);

        int choice;

        System.out.println("Choose your age from given options (1 <-> 4)");
        System.out.println("[(1)] Below 3");
        System.out.println("[(2)] Between 4-18");
        System.out.println("[(3)] Between 19-59");
        System.out.println("[(4)] 60 years and above ");

        choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Infants need not pay");
                break;

            case 2 :
                System.out.println("You  have to pay $50");
                break;

            case 3:
                System.out.println("You  have to pay $80");
                break;

            case 4:
                System.out.println("Senior Citizens don't have to pay any fees");
                break;

            default:
                System.out.println("Please read the instructions carefully");
        }
    }
}
