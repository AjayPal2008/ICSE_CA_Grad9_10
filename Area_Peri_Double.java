//Prg 1
// Here the variables are declared as double. No casting is required.
import java.util.Scanner;
public class Area_Peri_Double
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double a, b, c, peri, semi_peri, area;


        System.out.println( "Enter the first side of a triangle");
        a = sc.nextDouble();

        System.out.println( "Enter the second side of a triangle");
        b = sc.nextDouble();

        System.out.println( "Enter the third side of a triangle");
        c = sc.nextDouble();

        semi_peri = (a + b + c) / 2;
        peri = semi_peri * 2;

        area    = Math.sqrt((semi_peri * (semi_peri - a) * (semi_peri - b) * (semi_peri - c)));

        System.out.println("The perimeter is : " + peri);
        System.out.println("The area is : " + area);

    }
}