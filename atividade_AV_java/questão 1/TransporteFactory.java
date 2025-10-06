public class TransporteFactory {
    public static Transporte criarTransporte(String tipo) {
        switch (tipo.toLowerCase()) {
            case "terrestre":
                return new TransporteTerrestre();
            case "aereo":
                return new TransporteAereo();
            case "maritimo":
                return new TransporteMaritimo();
            default:
                throw new IllegalArgumentException("Tipo de transporte não suportado: " + tipo);
        }
    }
}