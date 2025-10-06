public class SiteNoticias implements Subject{
    private Observador[][] observadoresPorTopico;
    private String[] topicos = {"politica", "esportes", "tecnologia"};
    private int[] quantidades;

    public SiteNoticias(){
        this.observadoresPorTopico = new Observador[3][10];
        this.quantidades = new int[3];
    }

    private int indiceTopico(String topico){
        for (int i = 0; i < topicos.length; i++){
            if (topicos[i].equals(topico)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void registrarObservador(Observador observador, String topico) {
        
        int indice =  indiceTopico(topico);
        if (indice != -1 && quantidades[indice] < 10){
            observadoresPorTopico[indice][quantidades[indice]] = observador;
            quantidades[indice]++;
            System.out.println(observador + " inscrito em " + topico);
        }
    }

    @Override
    public void removerObservador(Observador observador, String topico) {
        int indice = indiceTopico(topico);
        if(indice != -1){
            for (int i = 0; i < quantidades[indice]; i++){
                if (observadoresPorTopico[indice][i] == observador){
                    for (int j = i; j < quantidades[indice] - 1; j++){
                        observadoresPorTopico[indice][j] = observadoresPorTopico[indice][j + 1];
                    }
                    observadoresPorTopico[indice][quantidades[indice] - 1] = null;
                    quantidades[indice]--;
                    System.out.println(observador + "removido de " + topico);
                    break;
                }
            }
        }
    }

    @Override
    public void notificarObservador(String noticia, String topico) {
        int indice = indiceTopico(topico);
        if (indice != -1){
            for (int i = 0; i < quantidades[indice]; i++){
                observadoresPorTopico[indice][i].atualizar(noticia, topico);
            }
        }
    }

    public void publicarNoticia(String noticia, String topico){
        System.out.println("\n NOVA NOTÍCIA PUBLICADA EM " + topico.toUpperCase());
        System.out.println("\n Conteúdo " + noticia);
        notificarObservador(noticia, topico);
    }
}