public class TransporteMaritimo implements Transporte{

    @Override
    public double calcularTarifa(double... parametros) {
        if (parametros.length < 3) throw new IllegalArgumentException("Transporte marítimo precisa de distância, peso e volume");
        double distancia = parametros[0];
        double peso = parametros[1];
        double volume = parametros[2]; 
        return (peso * 5.00) + (volume * 10.00) + (distancia * 0.20);
    }
}
