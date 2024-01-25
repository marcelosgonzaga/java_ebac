package forewhile;

import java.util.ArrayList;
import java.util.List;

public class ExemploForWhile {
    public static void main(String args[]) {
        List<Integer> valores = new ArrayList<>();
        for(int i = 0; i <= 10; i++) {
            System.out.println("Linha1 " + i);
            valores.add(i);
        }

        for(Integer i : valores) {
            System.out.println("Linha2 " + i);
        }
        valores.forEach(i-> System.out.println("Linha3 " + i));

    }
}
