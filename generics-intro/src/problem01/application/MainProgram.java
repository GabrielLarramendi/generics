package problem01.application;

import problem01.services.PrintService;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintService ps = new PrintService();

        System.out.print("How many values: ");
        int  n = sc.nextInt();

        ps.addValue("Maria");

        for (int i = 0; i < n; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = (Integer) ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}
