package Mod15.src.br.com.gonzaga.builder;

public class Demo {
    public static void main(String[] args) {
    // Gerente gerente = new Gerente(new CheeseBurgerBuilder());
        Gerente gerente = new Gerente();
        gerente.setBuilder(new CheeseBurgerBuilder());
        Burger buger = gerente.buildBurger();
        buger.print();

        //Gerente gerente1 = new Gerente(new VeganBurgerBuildler());
        gerente.setBuilder(new VeganBurgerBuildler());
        Burger buger1 = gerente.buildBurger();
        buger1.print();

    }
}
