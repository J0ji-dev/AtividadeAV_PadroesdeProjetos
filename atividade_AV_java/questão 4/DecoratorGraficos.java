public class DecoratorGraficos extends RelatorioDecorator{

    public DecoratorGraficos(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String getDescricao(){
        return relatorioDecorado.getDescricao() + "+ Gráficos";
    }

    @Override
    public void gerar() {
        relatorioDecorado.gerar();
        adicionarGraficos();
    }

    private void adicionarGraficos() {
        System.out.println("\n--->GRÁFICOS<---");
        System.out.println("Gráfico de vendas por período: [▓▓▓▓▓▓▓▓▓▓]");
        System.out.println("Gráfico de crescimento: [▓▓▓▓▓▓▓▓____]");
        System.out.println("Gráfico de produtos mais vendidos: [▓▓▓▓▓▓▓▓▓▓▓▓]");
    }  
}
