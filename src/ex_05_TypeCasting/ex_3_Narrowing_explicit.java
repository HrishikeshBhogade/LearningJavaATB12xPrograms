package ex_05_TypeCasting;

public class ex_3_Narrowing_explicit {
    public static void main(String[] args) {
        int val = 300;
//        byte b = val; // Narrowing - Implicit JVM to do it. - Data loss will be there.
        byte b1 = (byte) val; // Narrowing - EXPLICIT JVM to do it. - Data loss will be there.
        System.out.println(b1); // 44


    }
}
