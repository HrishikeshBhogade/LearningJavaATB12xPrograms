package ex_6_Ternary_Operator;

public class ex_4_max_No_btn_two {
    public static void main(String[] args) {
        // Find the maximum number between two numbers.
        int x = 10;
        int y = 20;
        System.out.println(Math.max(x,y));

        int max = x > y ? x : y;
        System.out.println(max);
    }
}
