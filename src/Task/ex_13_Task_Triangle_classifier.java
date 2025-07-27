package Task;

public class ex_13_Task_Triangle_classifier {
    public static void main(String[] args) {
        int side1 = 3; // Replace with the lengths of your triangle's sides
        int side2 = 3;
        int side3 = 3;


        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {


            if (side1 == side2 && side2 == side3) {
                System.out.println("EQ");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("ISO");
            } else {
                System.out.println("Scalene");
            }
        }
        else {
            System.out.println("Not a valid triangle.");
        }


    }
}
