import java.util.Scanner;
public class Square_Cube {
    public static  void main(String [] args){
        Scanner sc = new Scanner (System.in);
        Square_Cube a =  new Square_Cube();
        System.out.println("Enter 10 numbers");

        for (int i = 1 ; i <= 10 ; i++)
        {
            int n = sc.nextInt();
            a.squa(n);
            a.cube(n);

        }

    }

    public void squa(int a ){
        int c = a*a;
        System.out.println("the square is ===" + c);
    }

    public void cube (int a ){
        int c = a*a*a;
        System.out.println("the cube is ===" + c);
    }
}
//javac Square_Cube.java
//java Square_Cube