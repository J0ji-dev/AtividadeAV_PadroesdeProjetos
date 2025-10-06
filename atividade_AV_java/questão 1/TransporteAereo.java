public class TransporteAereo implements Transporte{

    @Override
    public double calcularTarifa(double... parametros) {
        if (parametros.length < 1) throw new IllegalArgumentException("Transporte aéreo precisa do peso");
        double peso = parametros[0]; 
        return peso * 15.00 + 100.00; 
    }
}
