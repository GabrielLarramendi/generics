package application;

import java.util.Arrays;
import java.util.List;

public class MethodExercise {
    public static void main(String[] args) {
        //Fazer um método que receba uma lista de qualquer tipo e imprima os item dessa lista;
        List<Integer> myInts = Arrays.asList(5, 3, 10);
        printList(myInts);

        List<String> myStrings = Arrays.asList("Gabriel", "João", "Joana");
        printList(myStrings);

        List<Double> myDoubles = Arrays.asList(1.5, 2.4, 5.9);
        printList(myDoubles);
    }

    public static void printList(List<?> list) { //Caso recebesse uma lista de Objectm não funcionaria
        for (Object obj : list) {                //Ja que nao é possivel fazer o upcasting das listas;
            System.out.println(obj);
        }
    }
}
