package services;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileServices {

    public static List<Product> returnProductList(String path) {

        List<Product> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] stringLine = line.split(",");
                String name = stringLine[0];
                double price = Double.parseDouble(stringLine[1]);

                Product product = new Product(name, price);
                list.add(product);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            e.getMessage();
        }

        return list;
    }
}
