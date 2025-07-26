package ex_7_Increment_decrement_OP;

public class ex_10_Increment_task1 {
    public static void main(String[] args) {
        int i = 11;
        i = (i++ + ++i);
        // i++ : i = 11
        // then i+1 = 11+1 = 12
        // i= 12
        //++i = 12+1 = 13
        // i = (11+13) = 24
        System.out.println(i);
    }
}
