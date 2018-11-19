/*
    *@author LuluTeam
*/
package sistemaDeEstoque;

import java.io.Serializable;

/**
 * Classe usada para guardar os dados de uma movimentação de produtos para o estoque.
 *      Essa classe extende a classe abstrata Relatorio.
 *      Ele possui o seguintes atributos:
 *      - fornecedor (String): nome do fornecedor ddaquela movimentação.
 *      fornecedor - nome do fornecedor daquele produto.
 * @author LuluTeam
 */
public class Entrada extends Relatorio implements Serializable{

    private String fornecedor;
    /**
     * Construtor da classe. Ele recebe os dados do objeto Produto para para preencher os dados do objeto Entrada.
     * Esta classe usa o construtor da superclasse Relatorio inserir os dados.
     * @param novo Produto - objeto usado para receber os dados do produto;
     * @param tipo String - tipo daquele produto (higiene, alimento ou medicamento);
     * @param descricao String - descrição da movimentação de entrada;
     * @param qnt Integer - quantidade da entrada daquele produto;
     */
    
    public Entrada(Produto novo, String tipo, Integer qnt, String descricao) {
        super(novo, tipo, qnt, descricao);
    }

    
    /**
     * O método imprime na tela as informações do objeto relatório, 
     * ele faz um overriding do método gerarRelatorio da superclasse Relatorio,
     * para imprimir parte das informações.
     * @param produto Produto - parâmetro para receber os dados.
     */
    @Override
    public void gerarRelatorio(Produto produto){
        super.gerarRelatorio(produto);
        System.out.println("Quantidade do produto inserido: " + this.getQuantidade());
    }
    
    /**
     * Esse método retorna o nome do fonecedor.
     * @return String - retorna o nome do fornecedor.
     */
    public String getFornecedor(){
        return fornecedor;
    }
    
    /**
     * Esse método recebe o novo nome pelo parâmetro para mudar o nome do fornecedor.
     * @param entrada String - muda o nome do fornecedor.
     */
    public void setFornecedor(String entrada){
        this.fornecedor = entrada.toUpperCase();
    }

    /**
     * Esse método retorna o tipo da moviemntação.
     * @return String - tipo da movimentação.
     */
    public String getTipo(){
        return ("Entrada");
    }
}
