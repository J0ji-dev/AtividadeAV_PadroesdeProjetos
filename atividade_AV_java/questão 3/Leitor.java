public class Leitor implements Observador{
    private String nome;

    public Leitor(String nome){
        this.nome = nome;
    }

    @Override
    public void atualizar(String noticia, String topico) {
        System.out.println(">>" + nome + "recebeu notificação de " + topico + "<<");
        System.out.println("  "  + noticia);
        System.out.println();
    }

    @Override
    public String toString(){
        return nome;
    }
}