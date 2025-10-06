public class PropostaComercial implements DocumentoPrototype {

    private String tipo = "Proposta Comercial";
    private String estrutura;
    private String cliente;
    private String cor;
    private String fonte;
    private String logo;

     public PropostaComercial() {
        this.estrutura = "Estrutura padrão de proposta:\n" +
                        "- Capa\n" +
                        "- Sumário\n" + 
                        "- Apresentação da Empresa\n" +
                        "- Escopo do Projeto\n" +
                        "- Cronograma\n" +
                        "- Orçamento\n" +
                        "- Termos e Condições";
    }



    @Override
    public DocumentoPrototype clonar() {
        PropostaComercial clone = new PropostaComercial();
        clone.estrutura = this.estrutura;
        clone.cliente = this.cliente;
        clone.cor = this.cor;
        clone.fonte = this.fonte;
        clone.logo = this.logo;
        return clone;
    }

    @Override
    public void personalizar(String cliente, String cor, String fonte, String logo) {
         this.cliente = cliente;
        this.cor = cor;
        this.fonte = fonte;
        this.logo = logo;
    }

    @Override
    public void exibir() {
        System.out.println("=== " + tipo + " ===");
        System.out.println("Cliente: " + (cliente != null ? cliente : "Não personalizado"));
        System.out.println("Cor: " + (cor != null ? cor : "Azul Corporativo"));
        System.out.println("Fonte: " + (fonte != null ? fonte : "Times New Roman"));
        System.out.println("Logo: " + (logo != null ? logo : "Logo Empresa"));
        System.out.println(estrutura);
        System.out.println();
    }
}