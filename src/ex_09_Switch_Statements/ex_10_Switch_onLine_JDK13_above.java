package ex_09_Switch_Statements;

public class ex_10_Switch_onLine_JDK13_above {
    public static void main(String[] args) {

        // in JDK > 13
        int itemCode = 001;
        switch (itemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }



    }
}
