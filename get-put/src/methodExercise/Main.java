package methodExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();

        copyList(myInts, myObjs);
        printList(myObjs);
        copyList(myDoubles, myObjs);
        printList(myObjs);



    }

    public static void copyList(List<? extends Number> sourceList, List<? super Number> destinyList) {
        /*Quero que a lista receba qualquer valor numerico;
          Ou seja, recebe qualquer valor que seja subtipo de Number (Extends)
          e copia para uma lista qualquer de Object (Super Number)
        */

        /*
        for (Number number : sourceList) {
            destinyList.add(number);
        }
        */

        destinyList.addAll(sourceList);



    }

    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
