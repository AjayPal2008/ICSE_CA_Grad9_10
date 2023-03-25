import java.util.Scanner;//import scanner class
class percent{//creating class
    public static void main(String [] args){//creating function
        Scanner sc = new Scanner(System.in);//creating object of scanner class
        int a1=0,a2=0,a3=0,a4=0,a5=0,avg,per,e=1;//initializing variables
        while (e==1){
        System.out.println("enter your Math marks");
            if (sc.hasNextInt()) a1 = sc.nextInt();
            else{
                System.out.println("enter numeric input");continue;}

        System.out.println("enter your English marks");
            if (sc.hasNextInt()) a2 = sc.nextInt();
            else{
                System.out.println("enter numeric input");continue;}

        System.out.println("enter your French marks");
            if (sc.hasNextInt()) a3 = sc.nextInt();
            else{
                System.out.println("enter numeric input");continue;}

        System.out.println("enter your  Computer marks");
            if (sc.hasNextInt()) a4 = sc.nextInt();
            else{
                System.out.println("enter numeric input");continue;}

        System.out.println("enter your Science marks");
            if (sc.hasNextInt()) a5 = sc.nextInt();
            else{
                System.out.println("enter numeric input");continue;}



    
                if (a1 > 100 || a2 > 100 || a3 > 100 || a4 > 100 || a5 > 100) {
                    System.out.println("enter input again");
                    System.out.println("should be below 100");

                }
                else
                    e=2;
            }
        avg = (a1+a2+a3+a4+a5)/5;`
        System.out.println(avg);
        }








    }


