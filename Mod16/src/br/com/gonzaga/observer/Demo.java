package Mod16.src.br.com.gonzaga.observer;

public class Demo {
    public static void main(String[] args) {
    Jornalista jor = new Jornalista();
    jor.add(new TV());
    jor.add(new Newspaper());
    jor.add(new Youtube());

    jor.notifyAll("Teste");
    }
}
