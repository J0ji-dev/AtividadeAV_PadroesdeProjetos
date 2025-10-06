public class CartaoCredito implements MeioPagamento {
    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " via Cartão de Crédito");
        return true;
    }
    
    @Override
    public String gerarComprovante() {
        return "Comprovante Cartão de Crédito - Transação aprovada";
    }
}