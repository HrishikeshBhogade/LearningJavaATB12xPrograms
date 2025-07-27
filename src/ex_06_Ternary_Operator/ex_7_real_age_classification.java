package ex_06_Ternary_Operator;

public class ex_7_real_age_classification {
        public static void main(String[] args) {

            // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)

            String user_input = args[0]; // take input from user=  Near run button click on dropdown on PGM name ->
                                        // edit configurations -> add value in program arguments


            System.out.println(user_input instanceof String);
            System.out.println(user_input);

            int age = Integer.parseInt(user_input); // NumberFormatException: For input string: "pramod"
                                                    // Integer.parseInt covert string into integer

            System.out.println(age);

            String result = (age < 18) ? "Minor" : ( age < 65) ? "Adult" : "Senior Citizen";
            System.out.println(result);






        }
    }
