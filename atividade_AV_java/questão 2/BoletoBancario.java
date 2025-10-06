public class BoletoBancario implements MeioPagamento {
    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Gerando boleto de R$ " + valor);
        System.out.println("Boleto gerado - aguardando pagamento");
        return true;
    }
    
    @Override
    public String gerarComprovante() {
        return "Boleto bancário gerado - Código: 12345.67890.12345.678900.123456789012";
    }
}