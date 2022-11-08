package problem01.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<genericType>{

    List<genericType> list = new ArrayList<genericType>();

    public void addValue(genericType value) {
        list.add(value);
    }

    public genericType first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print() {

        if (!list.isEmpty()) {
            System.out.print("[" + list.get(0));
        }

        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }

        System.out.println("]");
    }
}
