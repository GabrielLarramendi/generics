package application;

import entities.Product;
import services.CalculationService;
import services.FileServices;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        String path = "/home/larramendi/IdeaProjects/generics/generics-intro-2/src/files/products.csv";

        Product x = CalculationService.max(FileServices.returnProductList(path));
        System.out.print("MAX: " + x);

    }
}
