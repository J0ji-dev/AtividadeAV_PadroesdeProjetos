public class Pix implements MeioPagamento {
    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Processando PIX de R$ " + valor);
        System.out.println("Pagamento instantâneo via PIX");
        return true;
    }
    
    @Override
    public String gerarComprovante() {
        return "Comprovante PIX - Transferência realizada com sucesso";
    }
}