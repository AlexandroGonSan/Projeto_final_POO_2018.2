package sistemaDeEstoque;
import java.io.Serializable;
import java.util.Date;

/**
 * Classe abstrata dos Relatorios, de Entrada e Saida.
 * @author LuluTeam
 */

public abstract class Relatorio implements Serializable {
    private int quantidade;
    Date dataES;
    private String produto;
    Integer protocolo;
    static int quantidadeProtocolo = 1;
    private String tipo;
    String descricao;
    
    Relatorio(Produto produto, String tipo, Integer qnt, String descricao){
        this.setProduto(produto.getNome());
        this.setQuantidade(qnt);
        this.dataES = new Date();
        this.protocolo = quantidadeProtocolo++;
        this.setTipo(tipo);
        this.descricao = descricao;
    }

    public Relatorio(int a){
        
    }
    /**
     * Método para gerar relatório com todas as informações do objeto.
     */
    public void gerarRelatorio(Produto produto){
        
        System.out.println("");
        System.out.println("Número do protocolo gerado: 0000" + protocolo);
        System.out.println("Categoria do produto:" + produto.getCategoria());
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Código ID do produto: " + produto.ID);
        System.out.println("Lote do produto: " + produto.lote);
	System.out.println("Data: " + dataES);
        
    }
    public Date getDataES() {
        return dataES;
    }
    public Integer getProtocolo() {
        return protocolo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public boolean setTipo(String valor){
        String aux = valor.toUpperCase();
        switch (aux) {
            case "HIGIENE":
                this.tipo = "HIGIENE";
                return true;
            case "ALIMENTO":
                this.tipo = "ALIMENTO";
                return true;
            case "MEDICAMENTO":
                this.tipo = "MEDICAMENTO";
                return true;
            default:
                break;
        }
        return false;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public boolean setQuantidade(int valor){
        if(valor >= 0){
            this.quantidade = valor;
            return true;
        }
        return false;
    }

    public String getProduto() {
        return produto;
    }
    
    public void setProduto(String entrada){
        this.produto = entrada.toUpperCase();
    }
    
    public String getDescricao() {
        return descricao;
    }
}
