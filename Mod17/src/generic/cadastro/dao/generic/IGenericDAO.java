package Mod17.src.generic.cadastro.dao.generic;

import Mod17.src.generic.cadastro.domain.Persistente;

import java.util.Collection;

public interface IGenericDAO <T extends Persistente> {
    public Boolean cadastrar(T entity);
    public void excluir(Long valor);
    public void alterar(T entity);
    public T consultar(Long valor);
    public Collection<T> buscaTodos();
}
