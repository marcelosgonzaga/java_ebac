package Mod17.src.generic.cadastro.dao;

import Mod17.src.generic.cadastro.dao.generic.GenericDAO;
import Mod17.src.generic.cadastro.domain.Produto;

import java.util.HashMap;
import java.util.Map;

public class ProdutoDAO extends GenericDAO<Produto>implements IProdutoDAO{

    public ProdutoDAO() {
        super();
        Map<Long, Produto> mapaInterno = this.map.get(getTipoClasse());
        if (mapaInterno == null) {
            mapaInterno = new HashMap<>();
            this.map.put(getTipoClasse(), mapaInterno);
        }
    }

    @Override
    public Class<Produto> getTipoClasse() {
        return Produto.class;
    }

    @Override
    public void atualizarDados(Produto entity, Produto entityCadastrado) {

    }
}

