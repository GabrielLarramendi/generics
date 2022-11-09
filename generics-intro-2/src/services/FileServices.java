package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileServices {

    public static List<Integer> returnAnIntegerList(String path) {

        List<Integer> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                list.add(Integer.parseInt(line));
                line = br.readLine();
            }
        }
        catch (IOException e) {
            e.getMessage();
        }

        return list;
    }
}
