package Mod15.src.br.com.gonzaga.factory;

public class Demo {
    public static void main(String[] args) {
        Customer cliente = new Customer( "A",  false);
        Factory factory = getFactory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.startEngine();
    }

    private static Factory getFactory(Customer cliente) {
        if(cliente.isHasCompanyContract()) {
            return new ContratosFactory();
        }else {
            return new SemContratosFactory();
        }
    }
}
