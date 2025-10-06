public abstract class Relatorio{
    protected String descricao;

    public String getDescricao(){
        return descricao;
    }

    public abstract void gerar();
}