package interfaces;

public class ClasseTeste {

    public static void main(String args[]) {
        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("Olá Marcelo ");
        caneta.escreverComumATodas();
        System.out.println(caneta.getCor());

        ICaneta giz = new Giz();
        giz.escrever("Olá Marcelo ");
        giz.escreverComumATodas();
        System.out.println(giz.getCor());

        ICaneta lapis = new Lapis();
        lapis.escrever("Olá Marcelo ");
        lapis.escreverComumATodas();
        System.out.println(lapis.getCor());

        ICarro carro = new CarroPasseio();
        carro.andar();
        carro.parar();

        ICarro caminhao = new Caminhao();
        caminhao.andar();
        caminhao.parar();
    }


}
