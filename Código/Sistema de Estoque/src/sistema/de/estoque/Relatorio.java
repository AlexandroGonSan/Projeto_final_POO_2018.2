/*
@author LuluTeam
 */
package sistema.de.estoque;
import java.util.Date;

public abstract class Relatorio {
    int quantidade;
    Date dataES;
    Produto produto;
    Integer protocolo;
    static int quantidadeProtocolo;
    
    /*Método para gerar relatório com todas as informações do produto*/
    public void gerarRelatorio(){
        System.out.println("Produto: " + this.produto);
        System.out.println("Número do protocolo: " + this.protocolo.intValue());
    }
    
    public String getDataES(){
        return this.dataES.getDate() + "/" + this.dataES.getMonth() + "/" + this.dataES.getYear();
    }
}
