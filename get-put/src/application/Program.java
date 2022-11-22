package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Program {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjects = new ArrayList<>();

        List<? extends Number> list = myInts;

        Number x = list.get(0);
        //Covariância -> Operação GET é permitida; Inserir não é permitido;
        //list.add(20) ERRO DE COMPILAÇÃO. O TIPO DA LISTA PODE NAO SER O TIPO INFORMADO;

        List<Object> myObjs = new ArrayList<>();
        myObjs.add("Maria");
        myObjs.add("Gabriel");

        List<? super Number> myNums = myObjs;
        //Essa lista vai receber qualquer tipo Number ou supertipo de Number (Object);
        myNums.add(10);
        myNums.add(3.5);

        //Number x = myNums.get(0); Erro! Pode ser algum valor do tipo Object;
        Object ob = myNums.get(0);
        System.out.println("Object ob value = " + ob);

        for (Object o: myNums) {
            System.out.println(o);
        }

        //RESUMO
    /* Quando declara uma lista de um tipo que extends Number, o "Number" é o nivel maximo de abstração
        Quando declara uma lista super de number, ela pode receber qualquer valor;

        Variância -> Get funciona pois existe um nivel limitado de abstração (Por exemplo, numeros), put não funciona (Caso adicione String, por exemplo);
        Contravariancia -> Get não fuinciona para atribuir a uma variavel de tipo numerico especifico, ja que pode ser qqr valor.
        Inserir na lista dá bom, ja que ela recebe qualquer valor (Super number) -> Object
     */

    }


}
