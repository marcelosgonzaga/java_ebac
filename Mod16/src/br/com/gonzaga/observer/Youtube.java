package Mod16.src.br.com.gonzaga.observer;

public class Youtube implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo a notícia via YouTube " + subject.toString());

    }
}
