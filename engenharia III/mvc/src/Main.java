package src;
public class Main {
    public static void main(String[] args) {
      
        ProdutoModel produto = new ProdutoModel(1, "Teclado Mecânico", 299.90);
        ProdutoView view = new ProdutoView();
        ProdutoController controller = new ProdutoController(produto, view);

        System.out.println("=== Produto Inicial ===");
        controller.atualizarView();

        controller.setNomeProduto("Teclado Gamer RGB");
        controller.setPrecoProduto(349.90);

        System.out.println("\n=== Produto Atualizado ===");
        controller.atualizarView();
    }
}
