package ex_06_Ternary_Operator;

public class ex_3_Nasted_Ternary {
    public static void main(String[] args) {


        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        int number = 2;
        String result = (number > 18) ? (number > 25 ? "In Goa, You can drink" : "In Goa, You can't Drink") : "You can't go GOA";
        System.out.println(result);

    }
}
