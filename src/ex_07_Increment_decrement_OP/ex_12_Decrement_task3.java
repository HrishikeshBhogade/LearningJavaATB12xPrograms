package ex_07_Increment_decrement_OP;

public class ex_12_Decrement_task3 {
    public static void main(String[] args) {


        int i = 1, j = 2, k = 3;

        int m = i-- - j-- - k--;

        // i = 1 -> 1-1= 0  - j= 2 then j= 1 - k=3 then 3-1= 2
        // m = 1 - 2 - 3 = -1-3 = -4
        System.out.println(m);

        // i = 0 , j= 1 , k = 2

        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);
        // i = 0 ;
        // j = 1 ;
        // k = 2 ;
        // m = -4)
    }
}
