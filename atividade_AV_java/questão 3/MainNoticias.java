public class MainNoticias {
    public static void main(String[] args) {
        SiteNoticias site = new SiteNoticias();
        
        Leitor joao = new Leitor("João ");
        Leitor maria = new Leitor("Maria ");
        Leitor pedro = new Leitor("Pedro ");
        Leitor ana = new Leitor("Ana ");
         
        System.out.println(">>> INCRIÇÕES DOS LEITORES <<<");

        site.registrarObservador(joao, "política");
        site.registrarObservador(joao, "tecnologia");

        site.registrarObservador(maria, "esportes");
        site.registrarObservador(maria, "política");

        site.registrarObservador(pedro, "tecnologia");

        site.registrarObservador(ana, "esportes");
        site.registrarObservador(ana, "política");
        site.registrarObservador(ana, "tecnologia");

        System.out.println("\n ===> PUBLICANDO NOTÍCIAS <===");

        site.publicarNoticia("Novo ministro da economia é anunciado pelo governo", "política");
        site.publicarNoticia("Time local vence campeonato estadual", "esportes");
        site.publicarNoticia("Nova inteligência artificial revoluciona mercado", "tecnologia");
        site.publicarNoticia("Eleições municipais têm recorde de votandes", "política");
    }
}