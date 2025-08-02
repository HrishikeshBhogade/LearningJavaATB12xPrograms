package ex_10_For_Loop;

public class ex_09_odd_even_top_50 {
    public static void main(String[] args) {

        // TO find the even numbers from 1 to 50
        // even -> i%2 ==0

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even -> " + i);
            }
        }


    }
}
