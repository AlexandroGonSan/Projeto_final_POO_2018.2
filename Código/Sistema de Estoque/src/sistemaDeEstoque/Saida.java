package sistemaDeEstoque;
import java.io.Serializable;

/**
 * Classe do relatório gerado assim que há saída de produtos do estoque.
 * @author LuluTeam
 */

public class Saida extends Relatorio implements Serializable{
    /**
     * Construtor da classe. Ele recebe os dados do objeto Produto para para preencher os dados do objeto Saida.
     * Ele usa o construtor da superclasse Relatorio para inserir os dados.
     * @param novo Saida - objeto usado para receberos dados.
     */
    public Saida(Produto novo, String tipo, Integer qnt, String descricao){
        super(novo, tipo, qnt, descricao);
    }
    
    /**
     * Método que gera o relatório armazenado no objeto.
     */
    @Override
    public void gerarRelatorio(Produto produto){
        super.gerarRelatorio(produto);
        System.out.println("Quantidade do produto retirado: " + this.quantidade);
        //System.out.println("Data da retirada:" + this.getDataES());
    }
}
