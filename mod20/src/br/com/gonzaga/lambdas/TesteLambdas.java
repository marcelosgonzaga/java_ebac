package br.com.gonzaga.lambdas;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;

//@author marcelo.gonzaga
public class TesteLambdas {
    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (int a, int b) -> {//expressão lambdas
            return a + b;
        };

        intBinaryOperator.applyAsInt(1, 1);

        IntBinaryOperator ope = new IntBinaryOperatorClass();//interface + implementação
        int result1 = ope.applyAsInt(1, 1 );//programação normal
        System.out.println(result1);

        BiFunction<Integer, Integer, Integer> biFunctions =  (Integer a, Integer b) -> {
            return a + b;
        };
        Integer rusultBi = biFunctions.apply(10 , 10);
        System.out.println(rusultBi);

        BiFunction<Double, Double, String> biFunctionsStr =  (Double a, Double b) -> {
            Double re = a+b;
            return String.valueOf(re);
        };
        String biFunctions1 = biFunctionsStr.apply(11d , 11d);
        System.out.println("String: " + biFunctions1);

       Long returLong = calcular(1L, 2L, (Long v1, Long v2) -> {
            return v1+v2;
        });
        System.out.println(returLong);

        Runnable helloWord = () -> System.out.println("Hello Word");
        Consumer<String> stringConsumer = (String s) -> {
            System.out.println(s);
        };
        stringConsumer.accept("Value");

        Supplier<Integer> integerCallable = () -> 42;
        Supplier<Double> idoubleCallable = () -> {
            return 3.1415;
        };


    }

    private static Long calcular(Long t, Long u, BiFunction <Long, Long, Long> function) {//método calcular
        return function.apply(t, u);
    }
}
