/*
@author LuluTeam
 */
package sistema.de.estoque;
import java.util.Date;

/**
 *
 * @author LuluTeam
 */
public abstract class Relatorio {
    int quantidade;
    Date dataES;
    Produto produto;
    Integer protocolo;
    static int quantidadeProtocolo;
    
    Relatorio(Produto novo){
        this.produto = novo;
        this.protocolo = quantidadeProtocolo;
        quantidadeProtocolo =+ 1; // A cada protocolo gerado soma +1 na variável
    }
    /*Método para gerar relatório com todas as informações do produto*/
    public void gerarRelatorio(){
        System.out.println("Número do protocolo gerado: 0000"+this.protocolo);
        System.out.println("Categoria do produto:" + this.produto.categoria);
        System.out.println("Nome do produto: " + this.produto.nome);
        /*System.out.println("Quantidade do produto: " + this.produto.quantidade);
            esse println só irá aparecer nos relatorios de entrada e saida
            pois nele vão ser especificados se entrou ou sair produtos do estoque                        
        */
        System.out.println("Código ID do produto: " + this.produto.ID);
        System.out.println("Lote do produto: " + this.produto.lote);
        
    }
    
    public String getDataES(){
        return this.dataES.getDate() + "/" + this.dataES.getMonth() + "/" + this.dataES.getYear();
    }
}
