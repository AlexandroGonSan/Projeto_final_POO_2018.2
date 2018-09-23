/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.estoque;
import java.util.Date;
/**
 *
 * @author Luigi Muller
 */
public abstract class Relatorio {
    int quantidade;
    Date dataES;
    Produto produto;
    Integer protocolo;
    int quantidadeProtocolo;
    
    public void gerarRelatorio(){
        
    }
}
