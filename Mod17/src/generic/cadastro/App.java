package Mod17.src.generic.cadastro;



//import generic.cadastro.dao.ClienteMapDAO;
//import generic.cadastro.dao.IClienteDAO;
//import generic.cadastro.domain.Cliente;

import Mod17.src.generic.cadastro.dao.ClienteMapDAO;
import Mod17.src.generic.cadastro.dao.IClienteDAO;
import Mod17.src.generic.cadastro.domain.Cliente;


import javax.swing.*;

public class App {
    private static IClienteDAO iClienteDAO;

    public static void main(String args[]) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "1-Cadastro, \n2-Consultar, \n3-Exclusão, \n4-Alteração, \n5-Sair",
                "Cadastro\n", JOptionPane.INFORMATION_MESSAGE);
        while (!isOpcaoValida(opcao)) {
            if ("".equals(opcao)){
                sair();
        }
        opcao = JOptionPane.showInputDialog(null,
                "Opção inválida, digite: \n1-Cadastro, \n2-Consultar, \n3-Exclusão, \n4-Alteração, \n5-Sair ",
                "Gree dinner", JOptionPane.INFORMATION_MESSAGE);
        }

        while(isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vígurla, conforme: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);
            } else if (isConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o cpf",
                        "Consultar", JOptionPane.INFORMATION_MESSAGE);

                consultar(dados);
            }

            opcao = String.valueOf(JOptionPane.showConfirmDialog(null,
                    "Digite:\n1-Cadastro, \n2-Consultar, \n3-Exclusão, \n4-Alteração, \n5-Sair ",
                    "Green dinner", JOptionPane.INFORMATION_MESSAGE));
        }
    }

    private static void consultar(String dados) {
        //Validação do CPF
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrados:  " + cliente.toString(), "Suceso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, " cliente não encontrado: ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private static boolean isConsultar(String opcao) {
        if ("2".equals(opcao)) {
            return true;
        }
        return false;
    }
    private static void cadastrar(String dados){
            String[] dadosSeparados = dados.split(",");
            //Validar se todos os campos estão preenchidos
            //Se não tiver passar null no construtor onde o valor é nulo
        Cliente cliente = new Cliente(dadosSeparados[0], dadosSeparados[1], dadosSeparados[2], dadosSeparados[3], dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
        if(isCadastrado){
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso", "Suceso", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null, "Cliente já esta cadastrado", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }
        private static boolean isOpcaoValicao(String opcao){
            if("1".equals(opcao)){
                return true;
            }
            return false;
        }
        private static boolean isOpcaoSair(String opcao){
            if("5".equals(opcao)){
                return true;
            }
            return false;
        }
        private static void sair(){
            JOptionPane.showMessageDialog(null, "Até logo; ", "Sair", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        private static boolean isOpcaoValida(String opcao){
            if("1".equals(opcao) ||  "2".equals(opcao)
            ||  "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
                return true;
            }
            return false;
        }
        private static boolean isCadastro(String opcao){
            if("1".equals(opcao)){
                return true;
            }
            return false;
        }
}
