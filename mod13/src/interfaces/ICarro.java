package interfaces;

public interface ICarro {
        default void parar() {
            System.out.println("O carro está parando ");
        }

        public void andar();

}
