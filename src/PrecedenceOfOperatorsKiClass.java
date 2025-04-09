public class PrecedenceOfOperatorsKiClass {
    public static void main(String[] args){
        int a = 6*5-34/2;
        /*  30 - 17 highest precedence goes to * and  / . They are then evaluated on the basis of left to right associativity
        *  a= 13
        */
        int b= 60/5-34*2   ;

        //  12- 34*2
        // 12-17
        //b= -5
    //Quick Quiz
        int c=10;
        int x=10;
        int y=5;
        int k=x-y/2;
        int l=b*b - 4*a*c/2*a;
        System.out.println(l);

    }


}
