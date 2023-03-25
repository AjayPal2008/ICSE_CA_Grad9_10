//Prg - 2
//Here all the variables are considered as double. Casting needs to be done.
// This Program finds the area and perimeter of a triangle
import java.util.Scanner;
public class Area_Perimeter_of_Triangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float a, b, c, peri, semi_peri, area,inter;

        System.out.println( "Enter the first side of a triangle");
         a = sc.nextFloat();
         //a = sc.nextDouble();

        System.out.println( "Enter the second side of a triangle");
         b = sc.nextFloat();
        //b = sc.nextDouble();

        System.out.println( "Enter the third side of a triangle");
        c = sc.nextFloat();
        //c = sc.nextDouble();

        semi_peri = (float) ((a + b + c) / 2);
        peri = semi_peri * 2;

        inter = (float)((semi_peri * (semi_peri - a) * (semi_peri - b) * (semi_peri - c)));

        area    = (float) Math.sqrt(inter);

        System.out.println("The perimeter is equal to : " + inter);

        System.out.println("The perimeter is equal to : " + peri);
        System.out.println("The area is equal to  : " + area);

    }
}