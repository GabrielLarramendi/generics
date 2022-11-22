package problem01.application;

import problem01.services.PrintService;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintService<String> ps = new PrintService<String>();

        System.out.print("How many values: ");
        int  n = sc.nextInt();
        //ps.addValue("Maria"); Type safety: A lista não pode mais receber um valor Object qualquer, so Strings.
        for (int i = 0; i < n; i++) {
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        String x = ps.first(); //Não precisa mais fazer o casting
        System.out.println("First: " + x);

        sc.close();
    }
}
