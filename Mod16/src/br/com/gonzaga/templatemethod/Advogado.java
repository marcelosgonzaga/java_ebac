package Mod16.src.br.com.gonzaga.templatemethod;

public class Advogado extends Trabalhador{

    @Override
    protected void trabalhar() {

    }

    @Override
    protected void irAoTrabalho() {
        super.irAoTrabalho();
    }

    @Override
    protected void voltarParaCasa() {
        System.out.println("Voltar para casa de carro");

    }

    @Override
    protected void iniciarRotina() {
        super.iniciarRotina();
    }

    @Override
    protected void levantar() {
        super.levantar();
    }
}
