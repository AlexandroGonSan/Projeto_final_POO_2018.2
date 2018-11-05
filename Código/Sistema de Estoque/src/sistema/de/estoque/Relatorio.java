package sistema.de.estoque;
import java.io.Serializable;
import java.util.Date;


public abstract class Relatorio implements Serializable {
    int quantidade;
    Date dataES;
    Produto produto;
    Integer protocolo;
    static int quantidadeProtocolo = 0;
    
    Relatorio(Produto produto){
        this.produto = produto;
        this.quantidade = produto.quantidade;
        this.dataES = new Date();
        quantidadeProtocolo = quantidadeProtocolo + 1; // A cada protocolo gerado soma +1 na variável
        this.protocolo = quantidadeProtocolo;
        
    }

    /**
     * Método para gerar relatório com todas as informações do objeto.
     */
    public void gerarRelatorio(){
     
        System.out.println("");
        System.out.println("Número do protocolo gerado: 0000" + this.protocolo);
        System.out.println("Categoria do produto:" + this.produto.getCategoria());
        System.out.println("Nome do produto: " + this.produto.getNome());

        /*System.out.println("Quantidade do produto: " + this.produto.quantidade);11
            esse println só irá aparecer nos relatorios de entrada e saida
            pois nele vão ser especificados se entrou ou sair produtos do estoque                        
        */
        System.out.println("Código ID do produto: " + this.produto.ID);
        System.out.println("Lote do produto: " + this.produto.lote);
	System.out.println("Data: " + this.dataES);
        
    }
    
    /*public String getDataES(){
        return this.dataES.getDate() + "/" + this.dataES.getMonth() + "/" + this.dataES.getYear();
    }*/
}
