//Prg - 10
//This program generates 1 to 5 natural numbers based upon user's choice of loop
import java.util.Scanner;
public class Natural__Numbers
{
    public static void main(String args[]) // main function
    {
        Scanner sc = new Scanner (System.in);

        //Variables definition

        int  Counter = 5 , Constant =1;
        String Input;

        System.out.println("Enter which loop you want by entering it's letter");
        System.out.println("[a] For loop");
        System.out.println("[b] While loop");
        System.out.println("[c] Do ... While loop");

        //Input from user
        Input = sc.next();

        //Switch statemnt for user's choice
        switch (Input)
        {
            case "a" :
            {
                //Using For loop
                for (;Constant<= Counter; Constant++)
                {
                    System.out.println( Constant);
                }

                break;

            }
            case "b" :
            {
                //Using While Looop
                while (Constant<= Counter)
                {
                    System.out.println( Constant);
                    Constant++;
                }
                break;

            }

            case "c" :
            {
    //Using Do.. While Loop
                 do {
                     System.out.println( Constant);
                     Constant++;
                     }
                 while (Constant<= Counter);

                break;

            }
            default :
                System.out.println("Invalid input");

        }
    }
}

//End of the program
