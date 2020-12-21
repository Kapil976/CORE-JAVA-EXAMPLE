package test;

public class AdditionOfString {

    public static void main(String[] args) {
        String arr[] = {"nan", "-1", "100", "10.0","22"};
        double number = 0;
        double total = 0;
        for (String value : arr) {
            try {
                number = Double.parseDouble(value);
                if (number > 0) 
                    total += number;
            } catch (Exception e) {
                System.out.println("Can not add String and negative Numbers");
            }
        }

        System.out.println("Addition of Only positive numbers is " + total);
    }
}
