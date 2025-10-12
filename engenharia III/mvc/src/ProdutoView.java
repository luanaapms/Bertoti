package src;
public class ProdutoView {
    public void exibirDetalhesProduto(int id, String nome, double preco) {
        System.out.println("=== Detalhes do Produto ===");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("===========================");
    }
}

