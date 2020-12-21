package test;

import java.util.Scanner;

public class PrintWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----$-STRING EXPRESSION-$-");
        System.out.println("ENTER ANY SENTENCES");
        String word = scan.nextLine();
        String[] parts = word.split(" ");
//        String word[];
        System.out.println("---------------------------- ");
        for (int i = 0; i < parts.length; i++) {
             if (i !=0) {
                System.out.print("+");
            }
            System.out.print("\"" + parts[i] + "\"");
           
        }
        System.out.println("");
       System.out.println("------------------------------");
        System.out.println("-ITs Reverse of Every Words-");
        for (int j = parts.length - 1; j >= 0; j--) {
            System.out.print("\"" + parts[j] + "\"");
            if (j != 0) {
                System.out.print("+");
            }
        }
        System.out.println(" ");
        System.out.println(parts.length + " words.");
    }
}
