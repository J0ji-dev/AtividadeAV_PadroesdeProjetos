public class MainDocumentos {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE MODELOS DE DOCUMENTOS ===\n");
        
        System.out.println("1. MODELOS ORIGINAIS:");
        Curriculo modeloCurriculo = new Curriculo();
        PropostaComercial modeloProposta = new PropostaComercial();
        Relatorio modeloRelatorio = new Relatorio();
        
        modeloCurriculo.exibir();
        modeloProposta.exibir();
        modeloRelatorio.exibir();
        
        System.out.println("==========================================\n");
        
        System.out.println("2. CLONAGEM E PERSONALIZAÇÃO:");
        
        System.out.println("--- CLIENTE: João Silva ---");
        Curriculo curriculoJoao = (Curriculo) modeloCurriculo.clonar();
        curriculoJoao.personalizar("João Silva", "Azul Marinho", "Georgia", "JS_logo.png");
        curriculoJoao.exibir();
        
        PropostaComercial propostaJoao = (PropostaComercial) modeloProposta.clonar();
        propostaJoao.personalizar("João Silva", "Verde", "Verdana", "JS_enterprises.png");
        propostaJoao.exibir();
        
        System.out.println("--- CLIENTE: Maria Santos ---");
        Curriculo curriculoMaria = (Curriculo) modeloCurriculo.clonar();
        curriculoMaria.personalizar("Maria Santos", "Roxo", "Helvetica", "MS_logo.svg");
        curriculoMaria.exibir();
        
        Relatorio relatorioMaria = (Relatorio) modeloRelatorio.clonar();
        relatorioMaria.personalizar("Maria Santos", "Laranja", "Courier New", "MS_analytics.png");
        relatorioMaria.exibir();
        
        System.out.println("--- CLIENTE: Empresa XYZ ---");
        PropostaComercial propostaXYZ = (PropostaComercial) modeloProposta.clonar();
        propostaXYZ.personalizar("Empresa XYZ", "Cinza", "Arial Black", "XYZ_corp.jpg");
        propostaXYZ.exibir();
        
        Relatorio relatorioXYZ = (Relatorio) modeloRelatorio.clonar();
        relatorioXYZ.personalizar("Empresa XYZ", "Azul", "Tahoma", "XYZ_logo.png");
        relatorioXYZ.exibir();
        
        System.out.println("==========================================\n");
        
        System.out.println("3. VERIFICAÇÃO - MODELOS ORIGINAIS INTACTOS:");
        modeloCurriculo.exibir();
        modeloProposta.exibir();
        modeloRelatorio.exibir();
    }
}