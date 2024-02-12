package br.com.gonzaga.lambdas.anonimas;

@FunctionalInterface
public interface MyEventConsumerReturn<T> {
    public T consumer (Object value);

}
