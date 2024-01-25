package Mod16.src.br.com.gonzaga.observer;

public class Newspaper implements Observer{
    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo a notícia via Jornal " + subject.toString());

    }
}
