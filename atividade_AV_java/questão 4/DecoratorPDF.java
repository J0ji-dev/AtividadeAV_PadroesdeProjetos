public class DecoratorPDF extends  RelatorioDecorator{

    public DecoratorPDF(Relatorio relatorio){
        super(relatorio);
    }

    @Override
    public String getDescricao(){
        return relatorioDecorado.getDescricao() + " + Exportação PDF";
    }

    @Override
    public void gerar() {
        relatorioDecorado.gerar();
        exportarPDF();
    }
  

    private void exportarPDF() {
        System.out.println("\n--->EXPORTAÇÃO PDF<---");
        System.out.println("Gerando arquivo PDF...");
        System.out.println("PDF exportado com sucesso: relatorio_vendas.pdf");
        System.out.println("Local: C:/Relatorios/relatorio_vendas.pdf");
    }  
}
