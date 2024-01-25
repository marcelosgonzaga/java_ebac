package Mod17.src.generic;

import Mod17.src.generic.fruta.Banana;
import Mod17.src.generic.fruta.Fruta;
import Mod17.src.generic.fruta.Maca;

import java.util.ArrayList;
import java.util.List;

public class ExemplosJavaGenerics {
    public static void main(String[] args) {
        List<String> lista = new ArrayList();
        lista.add("Marcelo");
        lista.add("1");
        imprimir(lista);

        List<Long> listaLong = new ArrayList();
        listaLong.add(19L);
        listaLong.add(78L);
        imprimir(listaLong);

        String primeiroSt = pegarPrimeiro(lista);
        System.out.println(primeiroSt);

        Long ultimoSt = pegarUltimo(listaLong);
        System.out.println(ultimoSt);

        imprimir2(listaLong);


        List<Fruta> frutas = new ArrayList<>();
        frutas.add(new Maca());
        frutas.add(new Banana());
        imprimirFrutas(frutas);

    }

        public static void imprimirFrutas(List<? extends Fruta> lista) {
            for ( Fruta fruta : lista) {
                System.out.println(fruta);
            }

        }

        public static void imprimir2(List<?> lista) {
        for (Object st : lista) {
            if (st instanceof Long) {//converte o objeto rebido em long
                Long stLong = (Long) st;
                System.out.println(stLong);
            }
            System.out.println("Qualquer coisa: " + st);

        }
    }
    public static <T> void imprimir(List<T> lista) {
        for (T st : lista) {
            System.out.println(st);

        }
    }

    public static <T> T pegarPrimeiro(List<T> lista) {
        return lista.get(0);
    }

    public static <T> T pegarUltimo(List<T> listaLong) {
        return listaLong.get(1);
    }
}
