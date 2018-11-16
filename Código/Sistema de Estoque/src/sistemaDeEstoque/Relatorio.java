package sistemaDeEstoque;
import java.io.Serializable;
import java.util.Date;

/**
 * Classe abstrata dos Relatorios, de Entrada e Saida.
 * @author LuluTeam
 */

public abstract class Relatorio implements Serializable {
    int quantidade;
    Date dataES;
    String produto;
    Integer protocolo;
    static int quantidadeProtocolo = 1;
    String tipo;
    String descricao;
    
    Relatorio(Produto produto, String tipo,Integer qnt, String descricao){
        this.produto = produto.getNome();
        this.quantidade = qnt;
        this.dataES = new Date();
        
        this.protocolo = quantidadeProtocolo++;
        this.tipo = tipo;
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

    public int getQuantidade() {
        return quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public String getDescricao() {
        return descricao;
    }
    
    
}
