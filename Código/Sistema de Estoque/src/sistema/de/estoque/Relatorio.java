/*
@author LuluTeam
 */
package sistema.de.estoque;
import java.util.Date;

public abstract class Relatorio {
    int quantidade;
    Date dataES; //acho melhor a gente parar de usar a classe DATE e deixar só String mesmo
    Produto produto;
    Integer protocolo;
    static int quantidadeProtocolo;
    
    /*Método para gerar relatório com todas as informações do produto*/
    public void gerarRelatorio(){
        System.out.println("Produto: "+this.produto);
        System.out.println("Quantidade do produto: "+this.quantidade);
        System.out.println("Número do protocolo: "+this.protocolo);
        //System.out.println("");
    }
}
