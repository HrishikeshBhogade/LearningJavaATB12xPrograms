package ex_10_For_Loop;

import java.util.Scanner;

public class ex_14_factorial_java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fact = 1;
        if( n == 0){
            fact = 1;
        }

        if(n > Integer.MAX_VALUE){ // if(n > 2147483647){
            System.out.println("I can't handle the number > Max of Int");
        }


        for (int i = 1; i <= n ; i++) {
            fact = fact*i;
        }

        System.out.println(fact);



    }
}
