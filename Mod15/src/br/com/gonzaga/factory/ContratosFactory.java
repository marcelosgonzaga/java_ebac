package Mod15.src.br.com.gonzaga.factory;

public class ContratosFactory extends Factory{
    @Override
    Car retriveCar(String requestedGrade) {
            if("A".equals(requestedGrade)) {
                return new CorolaCar(100, "cheio", "azul");
            } else {
                return null;

            }
    }
}
