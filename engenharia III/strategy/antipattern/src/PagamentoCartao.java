public class PagamentoCartao extends Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento com cartão de crédito: " + valor);
    }
}