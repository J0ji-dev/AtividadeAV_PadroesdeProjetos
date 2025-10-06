public class RelatorioBasico extends Relatorio{

    public RelatorioBasico() {
        this.descricao = "Relatório Básico - Lista de Pedidos";
    }
    
    @Override
    public void gerar(){
        System.out.println("===> " + descricao + " <===");
        System.out.println("1. pedido #001 - R$150,00");
        System.out.println("2. pedido #002 - R$299,0");
        System.out.println("3. pedido #003 - R$75,50");
        System.out.println("Total de pedidos: 3");
    }
}