package br.com.gonzaga.lambdas.anonimas;

public class ReferenciadeMetodos {

    public static void main(String[] args) {
        MyEventConsumer myEvent1 = s -> System.out.println(s);
        myEvent1.consumer("Olá!1");

        MyEventConsumer myEvent2 = System.out::println;
        myEvent2.consumer("Olá!2");

    }
}
