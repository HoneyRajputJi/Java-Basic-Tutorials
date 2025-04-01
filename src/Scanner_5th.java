import java.util.Scanner;

public class Scanner_5th {

    public static void main(String[] args){

        System.out.println("taking Inputs from the Keyboard");

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your first Number");
        int a=sc.nextInt();
        System.out.println("Enter your second Number");
        int b=sc.nextInt();
        int sum= a+b;
        System.out.println("The sum of these number is : ");
        System.out.println(sum);

        //boolean b1= sc.hasNextInt();
        //System.out.println(b1);
        //String str=sc.next();
        //String str=sc.nextLine();
        //System.out.println(str);





    }

}
