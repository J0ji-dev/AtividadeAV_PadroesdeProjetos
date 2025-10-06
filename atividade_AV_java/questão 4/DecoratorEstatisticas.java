public class DecoratorEstatisticas extends RelatorioDecorator{

    public DecoratorEstatisticas(Relatorio relatorio){
        super(relatorio);
    }

    @Override
    public String getDescricao(){
        return relatorioDecorado.getDescricao() + "  + Estatísticas de Faturamento";
    }


    @Override
    public void gerar() {
        relatorioDecorado.gerar();
        adicionarEstatisticas();
    }

    private void adicionarEstatisticas() {
        System.out.println("\n ===> ESTATÍSTICAS DE FATURAMENTO <===");
        System.out.println("Faturamento total: R$ 525,40");
        System.out.println("Ticket médio:R$175,13");
        System.out.println("Pedido mais caro: R$299,90");
        System.out.println("Pedido mais barato: R$75,50");
    }
}
