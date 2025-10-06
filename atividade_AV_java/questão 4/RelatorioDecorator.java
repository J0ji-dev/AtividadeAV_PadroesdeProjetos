public abstract class RelatorioDecorator extends Relatorio{
    protected Relatorio relatorioDecorado;
    
    public RelatorioDecorator(Relatorio relatorio){
        this.relatorioDecorado = relatorio;
    }

    @Override
    public String getDescricao(){
        return relatorioDecorado.getDescricao();
    }

    @Override
    public abstract void gerar();
}
