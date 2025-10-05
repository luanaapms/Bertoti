public class PagamentoPIX extends Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via PIX: " + valor);
    }
}
