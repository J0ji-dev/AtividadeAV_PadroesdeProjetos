public class MainRelatorios {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE RELATÓRIOS DE VENDAS ===\n");
        
        System.out.println("1. RELATÓRIO BÁSICO:");
        Relatorio basico = new RelatorioBasico();
        basico.gerar();
        
        System.out.println("\n==================================================\n");
        
        System.out.println("2. RELATÓRIO COM ESTATÍSTICAS:");
        Relatorio comEstatisticas = new DecoratorEstatisticas(new RelatorioBasico());
        System.out.println("Tipo: " + comEstatisticas.getDescricao());
        comEstatisticas.gerar();
        
        System.out.println("\n==================================================\n");
        
        System.out.println("3. RELATÓRIO COMPLETO:");
        Relatorio completo = new DecoratorPDF(
                              new DecoratorGraficos(
                                new DecoratorEstatisticas(
                                  new RelatorioBasico())));
        System.out.println("Tipo: " + completo.getDescricao());
        completo.gerar();
        
        System.out.println("\n==================================================\n");
        
        System.out.println("4. RELATÓRIO PERSONALIZADO (PDF + Gráficos):");
        Relatorio personalizado = new DecoratorPDF(
                                   new DecoratorGraficos(
                                     new RelatorioBasico()));
        System.out.println("Tipo: " + personalizado.getDescricao());
        personalizado.gerar();
    }
}