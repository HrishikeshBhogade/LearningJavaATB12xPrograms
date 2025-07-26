package ex_7_Increment_decrement_OP;

public class ex_11_increment_task2 {
    public static void main(String[] args) {
        int a = 11;
        int b = 22;
        int c;

        c = (a + b + a++ + b++ + ++a + ++b);

        // (a+b)= (11+22) = 33
        // (33+11)+1
        // 44+1 = 45
        // (45+22)+1 = 67+1 = 68
        // (68+12+23)= 103
        // c= 103

        // a = a -> a++ -> ++a = 11-> 11+1=12 -> 12+1 => 13
        //a =13
        // b = b -> b++ -> ++b = 22 -> 22+1=23 -> 23+1= 24
        // b =24
        // c = 103





        System.out.println("a=" + a);

        System.out.println("b=" + b);

        System.out.println("c=" + c);


    }
}
