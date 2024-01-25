package agregacao;

public class Programa {

    public static void main(String args[]) {

        Produto produtoTV = criarProduto(1L, 10d, "TV" );
        Produto produtoCell = criarProduto(12L, 1000d, "celular" );

        Vendedor vendedor = criarVendedor("Marcelo", 10d);

        Comprador comprador = criarComprador("Teste", 2000d);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoTV);
        venda.add(produtoCell);

        venda.concretizarVenda();
        System.out.println(venda);

        venda.cancerlarVenda();
        venda = null;
        System.out.println(venda);
    }

    private static Comprador criarComprador(java.lang.String nome, Double verba) {
        return new Comprador(nome, verba);
    }

    private static Vendedor criarVendedor(java.lang.String nome, Double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setComissao(comissao);
        vendedor.setNome(nome);
        return vendedor;

    }

    private static Produto criarProduto(Long codigo, Double valor, String nome) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreco(valor);
        produto.setNome(nome);
        return produto;
    }
}
