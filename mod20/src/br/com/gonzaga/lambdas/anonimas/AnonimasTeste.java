package br.com.gonzaga.lambdas.anonimas;

public class AnonimasTeste {
    public static void main(String[] args) {
        MyEventConsumer anonima = new MyEventConsumer() {
            @Override
            public void consumer(Object value) {
                System.out.println(value);

            }
        };
        anonima.consumer("Teste anônima");

        MyEventConsumer anonimaLambda = (Object value) -> System.out.println(value);
        anonimaLambda.consumer("Teste Lambda");

        receberInterface("Value", value -> System.out.println());
        receberInterface(Boolean.TRUE, value -> System.out.println());

    }

    private static void receberInterface(Object o, MyEventConsumer anonimaLambda) {
        anonimaLambda.consumer(o);
    }
}
