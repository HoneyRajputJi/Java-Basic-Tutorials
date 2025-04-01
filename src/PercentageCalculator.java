import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args){



        System.out.println("Please Enter your Marks as Asked");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter out of Marks: ");
        int outoff=sc.nextInt();
        //int outOf=500;
        System.out.println("Please Enter English Marks: ");
        int english=sc.nextInt();
        System.out.println("Please Enter Maths Marks: ");
        int maths=sc.nextInt();
        System.out.println("Please Enter Hindi Marks: ");
        int hindi=sc.nextInt();
        System.out.println("Please Enter Science Marks: ");
        int science=sc.nextInt();
        System.out.println("Please Enter SST Marks: ");
        int sst=sc.nextInt();
        int total=english+maths+hindi+science+sst;
        System.out.println("Total Marks is: " + total);
        float percentage= (float) (total * 100) /outoff;
        System.out.println("Total Percentage : " +percentage + "%");





    }
}
