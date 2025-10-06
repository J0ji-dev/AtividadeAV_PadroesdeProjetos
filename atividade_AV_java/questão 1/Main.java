public class Main {
    public static void main(String[] args) {
        Transporte terrestre = TransporteFactory.criarTransporte("terrestre");
        Transporte aereo = TransporteFactory.criarTransporte("aereo");
        Transporte maritimo = TransporteFactory.criarTransporte("maritimo");
        
        double tarifaTerrestre = terrestre.calcularTarifa(300, 50);
        double tarifaAerea = aereo.calcularTarifa(120);
        double tarifaMaritima = maritimo.calcularTarifa(500, 1000, 50);
        
        System.out.println("===>SISTEMA DE CÁLCULO DE TARIFAS<===");
        System.out.printf("Tarifa terrestre: R$ %.2f%n", tarifaTerrestre);
        System.out.printf("Tarifa aérea: R$ %.2f%n", tarifaAerea);
        System.out.printf("Tarifa marítima: R$ %.2f%n", tarifaMaritima);
    }
}