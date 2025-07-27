package ex_07_Increment_decrement_OP;

public class ex_4_Pre_Post {
    public static void main(String[] args) {


        int a = 10;
        int result = ++a;
        System.out.println(result);

        System.out.println("____________________________________");
        int c = 10;
        int result2 = c++;
        System.out.println(c);
        System.out.println(result2);
    }
}