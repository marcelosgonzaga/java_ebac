package abstratas;

public class Programa {

    public static void main( String args[]){
        Assalariado empregado = new Assalariado();
        empregado.setCpf("1");
        empregado.setNome("Marcelo");
        empregado.setSobrenome("Gonzaga");
        empregado.setSalario(100d);
        imprimir(empregado);

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("2");
        comissionado.setNome("Marcelo2");
        comissionado.setSobrenome("Gonzaga");
        comissionado.setTotalVenda(1000d);
        comissionado.setTotalComissao(0.1d);
        imprimir(comissionado);

        Horista horista = new Horista();
        horista.setCpf("2");
        horista.setNome("Marcelo2");
        horista.setSobrenome("Gonzaga");
        horista.setPrecoHora(100d);
        horista.setHorasTrabalhadas(60d);
        imprimir(horista);
    }

    public static void imprimir(Empregado empregado) {
        if ( empregado instanceof Horista) {
            Horista hor = (Horista) empregado;
            System.out.println(hor.getPrecoHora());
        }
        empregado.imprimirSobrenome();
        empregado.imprmirValores();
        System.out.println(empregado.getNome() + " tem de salário: " + empregado.vencimento());
    }


}
