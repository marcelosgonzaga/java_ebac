package Mod17.src.generic.cadastro.dao;

import Mod17.src.generic.cadastro.dao.generic.GenericDAO;
import Mod17.src.generic.cadastro.domain.Cliente;

import java.util.HashMap;
import java.util.Map;

public class ClienteMapDAO extends GenericDAO<Cliente> implements IClienteDAO {



    public ClienteMapDAO(){
        super();
        Map<Long, Cliente> mapaInterno = this.map.get(getTipoClasse());
        if (mapaInterno == null) {
            mapaInterno = new HashMap<>();
            this.map.put(getTipoClasse(), mapaInterno);
        }
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente cliente, Cliente entityCadastrado) {
        entityCadastrado.setNome(cliente.getNome());
        entityCadastrado.setTel(cliente.getTel());
        entityCadastrado.setNumero(cliente.getNumero());
        entityCadastrado.setEnd(cliente.getEnd());
        entityCadastrado.setCidade(cliente.getCidade());
        entityCadastrado.setEstado(cliente.getEstado());

    }

//    @Override
//    public void atualizarDados(Cliente entity) {
//
//
//    }
//    private Map<Long, Cliente> map;
//
//    public ClienteMapDAO() {
//        this.map = new HashMap<>();
//    }
//    @Override
//    public Boolean cadastrar(Cliente cliente) {
//        if(this.map.containsKey(cliente.getCpf())){
//            return false;
//        }
//        this.map.put(cliente.getCpf(), cliente);
//        return true;
//    }
//
//    @Override
//    public void excluir(Long cpf) {
//        Cliente clienteCadastrado = this.map.get(cpf);
//
//        if (clienteCadastrado != null){
//            this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
//
//        }
//    }
//
//    @Override
//    public void alterar(Cliente cliente) {
//        Cliente clienteCadastrado = this.map.get(cliente.getCpf());
//        if(clienteCadastrado != null) {
//            clienteCadastrado.setNome(cliente.getNome());
//            clienteCadastrado.setTel(cliente.getTel());
//            clienteCadastrado.setNumero(cliente.getNumero());
//            clienteCadastrado.setEnd(cliente.getEnd());
//            clienteCadastrado.setCidade(cliente.getCidade());
//            clienteCadastrado.setEstado(cliente.getEstado());
//        }
//
//    }
//
//    @Override
//    public Cliente consultar(Long cpf) {
//        return this.map.get(cpf);
//    }
//
//    @Override
//    public Collection<Cliente> buscaTodos() {
//        return this.map.values();
//    }
}
