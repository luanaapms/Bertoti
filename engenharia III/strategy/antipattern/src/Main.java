public class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new PagamentoCartao();
        pagamento1.pagar(150.0);

        Pagamento pagamento2 = new PagamentoPIX();
        pagamento2.pagar(200.0);
    }
}
