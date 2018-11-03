
/*@author LuluTeam
*/
package sistema.de.estoque;

/**
 * Classe usada para guardar os dados de uma movimentação de produtos para o estoque.
 * Ele extende a classe abstrata Relatorio.
 * @author Linhares Filho
 */
public class Entrada extends Relatorio {
    String fornecedor;

    /**
     * Construtor da classe. Ele recebe os dados do objeto Produto para para preencher os dados do objeto Entrada.
     * Ele usa o construtor da superclasse Relatorio inserir os dados.
     * @param novo Produto - objeto usado para receber os dados.
     */
    public Entrada(Produto novo) {
        super(novo);
    }
    
    /**
     * O método imprime na tela as informações do objeto relatório, 
     * ele usa o método gerarRelatorio da superclasse Relatorio para imprimir parte das informações.
     */
    @Override
    public void gerarRelatorio(){
        super.gerarRelatorio();
        System.out.println("Quantidade do produto inserido: " + this.quantidade);
        //System.out.println("Data da inserção:" + this.getDataES());
    }
}
