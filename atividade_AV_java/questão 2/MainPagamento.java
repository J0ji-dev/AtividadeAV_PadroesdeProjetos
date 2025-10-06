public class MainPagamento {
    public static void main(String[] args) {
        MeioPagamento cartao = PagamentoFactory.criarMeioPagamento("cartao");
        MeioPagamento boleto = PagamentoFactory.criarMeioPagamento("boleto");
        MeioPagamento pix = PagamentoFactory.criarMeioPagamento("pix");
        
        System.out.println("===>PLATAFORMA DE PAGAMENTOS<===");
        System.out.println();
        
        cartao.processarPagamento(150.00);
        System.out.println(cartao.gerarComprovante());
        System.out.println("-----------------------------------");
        System.out.println();
        
        boleto.processarPagamento(299.90);
        System.out.println(boleto.gerarComprovante());
        System.out.println("-----------------------------------");
        System.out.println();
        
        pix.processarPagamento(75.50);
        System.out.println(pix.gerarComprovante());
        System.out.println("-----------------------------------");
    }
}