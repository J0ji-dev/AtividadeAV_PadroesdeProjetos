public class PagamentoFactory {
    public static MeioPagamento criarMeioPagamento(String tipo) {
        switch (tipo.toLowerCase()) {
            case "cartao":
            case "cartão":
            case "credito":
            case "crédito":
                return new CartaoCredito();
            case "boleto":
                return new BoletoBancario();
            case "pix":
                return new Pix();
            default:
                throw new IllegalArgumentException("Meio de pagamento não suportado: " + tipo);
        }
    }
}