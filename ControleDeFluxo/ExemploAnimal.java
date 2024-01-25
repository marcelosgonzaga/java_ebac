package ControleDeFluxo;

import java.util.Scanner;

public class ExemploAnimal {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Você prefere cachorro ou gato?");
        String texto = s.next();
        String animal = exampleOfIF(texto);
        System.out.println(animal);
    }

    private static String exampleOfIF(String animal) {
        String result;
        if (animal.equals("cachoro") || animal.equals("gato")) {
            result = "Animal Doméstico";
        } else if (animal.equals("Tigre")) {
            result = "Animal desconhecido";
        } else {
            result = "Animal desconhecido";
        }
        return result;

    }
}
