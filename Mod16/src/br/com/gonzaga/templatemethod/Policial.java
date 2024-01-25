package Mod16.src.br.com.gonzaga.templatemethod;

public class Policial extends Trabalhador {
    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como Policial");

    }

    @Override
    public void levantar() {
        System.out.println("Levantando da cama as 08h");
    }
}
