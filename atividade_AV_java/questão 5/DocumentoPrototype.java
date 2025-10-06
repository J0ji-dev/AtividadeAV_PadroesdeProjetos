public interface DocumentoPrototype extends Cloneable {
    DocumentoPrototype clonar();
    void personalizar(String cliente, String cor, String fonte, String logo);
    void exibir();
}

