public class Relatorio implements DocumentoPrototype{
    
    private String tipo = "Relatório";
        private String estrutura;
        private String cliente;
        private String cor;
        private String fonte;
        private String logo;


    public Relatorio(){
         this.estrutura = "Estrutura padrão de relatório:\n" +
                        "- Página de Rosto\n" +
                        "- Resumo Executivo\n" + 
                        "- Introdução\n" +
                        "- Metodologia\n" +
                        "- Resultados\n" +
                        "- Conclusões\n" +
                        "- Anexos";
    }


    @Override
    public DocumentoPrototype clonar() {
        Relatorio clone = new Relatorio();
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
        System.out.println("Cor: " + (cor != null ? cor : "Preto"));
        System.out.println("Fonte: " + (fonte != null ? fonte : "Calibri"));
        System.out.println("Logo: " + (logo != null ? logo : "Sem logo"));
        System.out.println(estrutura);
        System.out.println();
    }
}
