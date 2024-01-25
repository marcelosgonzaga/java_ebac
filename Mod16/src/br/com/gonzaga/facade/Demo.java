package Mod16.src.br.com.gonzaga.facade;

public class Demo {
    public static void main(String[] args) {
        IApartamentoService service = new ApartamentoService();
        service.cadastrarApartamento(new Apartamento(1L, "Endereço", 8888-9999L));

    }
}
