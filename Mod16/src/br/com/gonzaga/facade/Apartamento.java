package Mod16.src.br.com.gonzaga.facade;

public class Apartamento {

    private Long codigo;
    private String end;
    private Long tel;

    public Apartamento(Long codigo, String endereco, Long tel) {
        this.codigo = codigo;
        this.end = endereco;
        this.tel = tel;

    }

    public Apartamento(long codigo, String endereço, long tel) {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }
}
