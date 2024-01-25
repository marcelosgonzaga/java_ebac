package ControleDeFluxo;

public class IfElse {
    public static void main(String args[]) {
        int result = 2;
        if (result >= 1 & result < 5) {
            System.out.println("Resultado esta entre 1 e 5");
        } else if (result >= 5 && result < 8) {
            System.out.println("Resultado esta entre 5 e 8");
        } else {
            System.out.println("Resultado diferente dos anteriores");
        }
    }
}
