package Mod16.src.br.com.gonzaga.observer;

public class TV implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("Recebendo a notícia via TV " + subject.toString());
    }
}