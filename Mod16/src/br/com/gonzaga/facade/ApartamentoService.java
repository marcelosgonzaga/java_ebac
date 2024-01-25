package Mod16.src.br.com.gonzaga.facade;

public class ApartamentoService implements IApartamentoService {
    @Override
    public Boolean cadastrarApartamento(Apartamento apartamento) {
        Boolean isCadastrado =  isApartamentoCadastrado(apartamento);
        Boolean isCamposValidos =  isApartamentoCadastrado(apartamento);
        if (isCadastrado && !isCamposValidos) {
            return false;
        }
        
        return cadastrarNoBanco(apartamento);
        
        //return null;
    }

    private Boolean cadastrarNoBanco(Apartamento apartamento) {
        //lógica de cadastro
        return true;
    }

    private Boolean isApartamentoCadastrado(Apartamento apartamento) {
        //Ir no banco e verificar se está cadastrado
        return false;
    }
    private Boolean isCamposValidos(Apartamento apartamento) {
        return true;
    }
}
