package application;

import services.CalculationService;
import services.FileServices;

public class Program {
    public static void main(String[] args) {

        String path = "/home/larramendi/IdeaProjects/generics/generics-intro-2/src/files/products.csv";

        Integer x = CalculationService.max(FileServices.returnAnIntegerList(path));
        System.out.print("MAX: " + x);

    }
}
