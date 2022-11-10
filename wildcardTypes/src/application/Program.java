package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        //List<Object> myObjs = new ArrayList<>();
        //List<Integer> myNumbers = new ArrayList<>();

        //myObjs = myNumbers ISSO NAO PODE SER FEITO; Não é possivel fazer o upcasting;

        Object obj;
        Integer x = 10;
        obj = x;

        //Integer é um objecto;
        //Uma lista de Integer não é uma lista de object;

        List<?> wildcardList= new ArrayList<>();  //TIPO CURINGA /PODE RECEBER ALGUMA OUTRA LISTA;
        List<Integer> myNumbers = new ArrayList<>();

        wildcardList = myNumbers;
    }
}
