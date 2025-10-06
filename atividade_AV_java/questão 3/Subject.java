public interface Subject {
    void registrarObservador(Observador observador, String topico);
    void removerObservador(Observador observador, String topico);
    void notificarObservador(String noticia, String topico);
}
