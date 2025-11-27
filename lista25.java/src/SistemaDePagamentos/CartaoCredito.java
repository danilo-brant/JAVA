package SistemaDePagamentos;

public class CartaoCredito extends Pagamento {
    public void processarPagamento() {
        System.out.println("Pagamento com cartão de crédito aprovado.");
    }
}
