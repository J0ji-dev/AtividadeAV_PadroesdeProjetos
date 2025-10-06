public class TransporteTerrestre implements Transporte {
    @Override
    public double calcularTarifa(double... parametros) {
        if (parametros.length < 2) throw new IllegalArgumentException("Transporte terrestre precisa de distância e peso");
        double distancia = parametros[0]; 
        double peso = parametros[1]; 
        return distancia * 0.50 + peso * 2.00;
    }
}