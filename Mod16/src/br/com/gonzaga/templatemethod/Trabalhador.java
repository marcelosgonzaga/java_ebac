package Mod16.src.br.com.gonzaga.templatemethod;

public abstract class Trabalhador { // padrão de projetto com metodos abstratos

    public void executar() {//metodo pricipal
        iniciarRotina();
        levantar();
        irAoTrabalho();
        trabalhar();
        voltarParaCasa();

    }
    protected abstract void trabalhar();
    protected void irAoTrabalho() {
        System.out.println("indo trabalhar");

    }
    protected void voltarParaCasa() {
        System.out.println("Voltando para casa");
        
    }
    protected void iniciarRotina() { //método publico
        System.out.println("Iniciando Rotina");
    }
    protected void levantar() {
        System.out.println("Levantando da cama");

    }

}
