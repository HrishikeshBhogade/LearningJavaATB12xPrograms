package ex_10_For_Loop;

public class ex_12_Continue_Even_Number {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd -> " + i);
        }


    }
}
