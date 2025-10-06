public interface MeioPagamento{
    boolean processarPagamento(double valor);
    String gerarComprovante();
}