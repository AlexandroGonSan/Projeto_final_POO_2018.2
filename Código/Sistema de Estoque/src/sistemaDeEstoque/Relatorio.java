package sistemaDeEstoque;
import java.io.Serializable;
import java.util.Date;

/**
 * Classe abstrata dos Relatorios, de Entrada e Saida.
 * Ele possui o seguintes atributos:\n
 *      - qntID (Integer): variável que guarda a quantidade de Produtos;\n
 *      - quantidade (int): quantidade de produtos que aconteceram nessa movimentação;\n
 *      - dataES (Date): data que aconteceu aquela movimentação;\n
 *      - produto (String): nome do produto;\n
 *      - protocolo (Integer): identificador único daquele protocolo;\n
 *      - tipo (String): tipo do produto;\n
 *      - descricao (String): descrição da movimentação;
 */

public abstract class Relatorio implements Serializable {
    private int quantidade;
    Date dataES;
    private String produto;
    Integer protocolo;
    private String tipo;
    String descricao;
    
    /**
     * Esse construtor instancia um objeto Produto usando os parâmetros.
     * @param produto Produto - parâmetro com os dados;
     * @param tipo String - tipo da movimentação;
     * @param qnt Integer - quantidade da movimentação;
     * @param descricao String - descrição da movimentação.
     */
    Relatorio(Produto produto, String tipo, Integer qnt, String descricao){
        this.setProduto(produto.getNome());
        this.setQuantidade(qnt);
        this.dataES = new Date();
        this.protocolo = Dados.IDRela++;
        this.setTipo(tipo);
        this.descricao = descricao;
    }

    /**
     * Esse construtor instancia um objeto Relatorio. 
     * @param a int - valor qualquer.
     */
    public Relatorio(int a){
        
    }
    /**
     * Método para gerar relatório com todas as informações do objeto.
     * @param produto Produto - parâmetro com os dados para gerar os dados.
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

    /**
     * Esse método retorna a data.
     * @return Date - retorna a data da movimentação.
     */
    public Date getDataES() {
        return dataES;
    }

    /**
     * Esse método retorna o protocolo.
     * @return Integer - protocolo.
     */
    public Integer getProtocolo() {
        return protocolo;
    }

    /**
     * Retorna o tipo da movimentação (ENTRADA ou SAÍDA).
     * @return String - tipo da movimentação no relatório.
     */
    public String getTipo(){
        return this.tipo;
    }

    /**
     * Esse método muda o tipo da movimentação que está no relatório.
     * @param valor String - novo nome.
     * @return boolean - retorna true caso tenha sido alterado o tipo de movimentação.
     */
    public boolean setTipo(String valor){
        String aux = valor.toUpperCase();
        switch (aux) {
            case "ENTRADA":
                this.tipo = "ENTRADA";
                return true;
            case "SAÍDA":
                this.tipo = "SAÍDA";
                return true;
            default:
                break;
        }
        return false;
    }
    
    /**
     * Esse método retorna a quantidade.
     * @return int - retorna a quantidade.
     */
    public int getQuantidade() {
        return quantidade;
    }
    
    /**
     * Esse método altera a quantidade.
     * @param valor int - parâmetro com o novo valor.
     * @return boolean - retorna true caso a quantidade tenha sido mudado ou false caso contrário.
     */
    public boolean setQuantidade(int valor){
        if(valor >= 0){
            this.quantidade = valor;
            return true;
        }
        return false;
    }

    /**
     * Esse método retorna o nome do produto.
     * @return String - nome do produto.
     */
    public String getProduto() {
        return produto;
    }
    
    /**
     * Esse método muda o nome do produto do relatório.
     * @param entrada String - novo valor de entrada.
     */
    public void setProduto(String entrada){
        this.produto = entrada.toUpperCase();
    }
    
    /**
     * Esse método retorna a descrição do produto.
     * @return String - descrição do relatório.
     */
    public String getDescricao() {
        return descricao;
    }
}
