import java.util.Scanner;
public class StringsKiClass  {
    public  static void main(String [] args){
       // String name=new String("Honey");
        String name="honey";
        int a=6;
        float b=5.123f;
        System.out.printf(" The value of a is %d and the value of b is %f", a, b);

        Scanner sc= new Scanner(System.in);
        //String st =sc.next(); this will print only one word of line
        String st=sc.nextLine(); //This will print whole line
        System.out.println(st);



    }

}
