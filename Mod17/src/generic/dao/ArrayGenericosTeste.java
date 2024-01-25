package Mod17.src.generic.dao;

public class ArrayGenericosTeste {
    public static void main(String[] args) {

    Integer[] arrayInteger = { 1, 2, 3};
    imprimir(arrayInteger);

    Long[] arrayLong = {4l, 5l, 3l};
    imprimir(arrayLong);

   System.out.println();
}

    private static <T> void imprimir(T values[]) {
        for (T i : values) {
            System.out.println(i);
        }

    }
    private static <T extends Comparable <T>> void imprimir(T values[]) {
        T max = values[0];
        for (T i : values) {
            if (i.compareTo(max) > 0 ) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
