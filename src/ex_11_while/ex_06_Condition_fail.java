package ex_11_while;

public class ex_06_Condition_fail {
    public static void main(String[] args) {
        int i = 0;
        while (i < 0) {
            System.out.println(i);
            i++;
        }
    }
}
