/*
    *@author LuluTeam
*/
package sistemaDeEstoque;
/**
 * Classe usada para guardar os dados de uma movimentação de produtos para o estoque.
 *      Essa classe extende a classe abstrata Relatorio.
 * @author LuluTeam
 */
public class Entrada extends Relatorio {
    String fornecedor;
    /**
     * Construtor da classe. Ele recebe os dados do objeto Produto para para preencher os dados do objeto Entrada.
     * Esta classe usa o construtor da superclasse Relatorio inserir os dados.
     * @param  novo - objeto usado para receber os dados.
     */
    
    public Entrada(Produto novo) {
        super(novo);
    }
    
    /**
     * O método imprime na tela as informações do objeto relatório, 
     * ele faz um overriding do método gerarRelatorio da superclasse Relatorio,
     * para imprimir parte das informações.
     */
    @Override
    public void gerarRelatorio(){
        super.gerarRelatorio();
        System.out.println("Quantidade do produto inserido: " + this.quantidade);
    }
}
