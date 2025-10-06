public class Curriculo implements DocumentoPrototype{
    private String tipo = "Currículo";
    private String estrutura;
    private String cliente;
    private String cor;
    private String fonte;
    private String logo;

    public Curriculo(){
        this.estrutura = "Estrutura padrão de currículo:\n" +
                        "- Dados Pessoais\n" +
                        "- Formação Acadêmica\n" + 
                        "- Experiência Profissional\n" +
                        "- Habilidades\n" +
                        "- Idiomas";
    }

    @Override
    public DocumentoPrototype clonar(){
        Curriculo clone =  new Curriculo();
        clone.estrutura = this.estrutura;
        clone.cliente = this.cliente;
        clone.cor = this.cor;
        clone.fonte = this.fonte;
        clone.logo = this.logo;
        return clone;
    }

    @Override
    public void personalizar(String cliente, String cor, String fonte, String logo){
        this.cliente = cliente;
        this.cor = cor;
        this.fonte = fonte;
        this.logo = logo;
    }

    @Override
    public void exibir(){
        System.out.println("=== " + tipo + " ===");
        System.out.println("Cliente: " + (cliente != null ? cliente : "Não personalizado"));
        System.out.println("Cor: " + (cor != null ? cor : "Padrão"));
        System.out.println("Fonte: " + (fonte != null ? fonte : "Arial"));
        System.out.println("Logo: " + (logo != null ? logo : "Sem logo"));
        System.out.println(estrutura);
        System.out.println();
    }
}