package agregacao;

public class Comprador {

    private String nome;

    private Double verba;

    public Comprador(java.lang.String nome, Double verba) {
        this.nome = nome;
        this.verba = verba;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVerba() {
        return verba;
    }

    public void setVerba(Double verba) {
        this.verba = verba;
    }

    public void compra() {
        System.out.println("Comprar");

    }

}
