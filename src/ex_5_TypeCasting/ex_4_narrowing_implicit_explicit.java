package ex_5_TypeCasting;

public class ex_4_narrowing_implicit_explicit {
    public static void main(String[] args) {

        long phone_no = 9876543210l;  // converted to binary
//        short s = phone_no; // Narrowing - implicit
        short s = (short) phone_no; // Narrowing - Explicit
        System.out.println(s); // 5866


    }
}
