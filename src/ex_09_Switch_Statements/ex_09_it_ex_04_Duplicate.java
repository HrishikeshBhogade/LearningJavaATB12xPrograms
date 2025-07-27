package ex_09_Switch_Statements;

public class ex_09_it_ex_04_Duplicate {
    public static void main(String[] args) {
        int a = 98;
        switch (a) {
            case 98:
                System.out.println("98");
//            case 98:
//                System.out.println("98");
                // switch does not support duplicate statement
        }
    }
}
