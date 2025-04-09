public class FormatSpecifierKiClass {

    public  static void main(String [] args){
        int a=6;
        float b=5.123456f;

        System.out.printf(" The value of a is %d and the value of b is %f", a, b);
        System.out.format(" The value of a is %d and the value of b is %f", a, b); //printf and format both are same
        System.out.format(" The value of a is %d and the value of b is %8.2f", a, b); //it will take 8 space after the text to print and will print 2 values after decimal

        // %d is used to print int values
        //%f is used to print float
        //%c is for chars
        //%s is for strings


    }

}

