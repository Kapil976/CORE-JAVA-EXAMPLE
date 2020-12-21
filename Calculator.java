package test;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int number1 = 0, number2 = 0, addition, subtraction, multiplication;
        double divide;
        String option;
        boolean yn = true;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("-----$-JAVA ARITHMETIC OPERATION-$-----");
            System.out.println("Enter first number:");
            try {
                number1 = scan.nextInt();
                System.out.println("Enter second number:");
                number2 = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Please Enter only numbers");
                System.out.println("Please Try Again ");
                System.out.println("Thank You !!! ");
                System.exit(0);
            }

            System.out.println("---------------------------------");
            System.out.println("Please Choose Operation ");
            System.out.println(" Enter A for Addition ");
            System.out.println(" Enter S for Subtraction");
            System.out.println(" Enter M for Multiplication ");
            System.out.println(" Enter  D for Divide");
            System.out.println(" Enter  Q for Quit");
            System.out.println("---------------------------------");

            option = scan.next();
            String option1 = option.toUpperCase();
            switch (option1) {
                case "A":
                    addition = number1 + number2;
                    System.out.println("Addition of " + number1 + " And " + number2 + " is");
                    System.out.println("Result is :" + addition);
                    break;

                case "S":
                    subtraction = number1 - number2;
                    System.out.println("Result:" + subtraction);
                    break;

                case "M":
                    multiplication = number1 * number2;
                    System.out.println("Result:" + multiplication);
                    break;

                case "D":
                    divide = (double) number1 / number2;
                    System.out.println("Result:" + divide);
                    break;

                case "Q":
                    System.exit(0);
            }
            System.out.println("Do you want to use another sum if you want press Y for Yes and N for NO ");
            String a = scan.next();
            String word = a.toUpperCase();
            if (word.equals("Y")) {
                continue;
            } // end of if
            else {
                System.exit(0);
            }

        }
    }
}
