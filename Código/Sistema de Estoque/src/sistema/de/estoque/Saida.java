/*

 */
package sistema.de.estoque;

/**
 *
 * @author Luigi Muller
 */
public class Saida extends Relatorio {
    String destino;
    //@Override
    
    /**
     * Construtor da classe. Ele recebe os dados do objeto Produto para para preencher os dados do objeto Saida.
     * Ele usa o construtor da superclasse Relatorio inserir os dados.
     * @param novo Saida - objeto usado para receberos dados.
     */
    public Saida(Produto novo){
        super(novo);
    }
    
    /**
     * Método que gera o relatório armazenado no objeto.
     */
    @Override
    public void gerarRelatorio(){
        super.gerarRelatorio();
        System.out.println("Quantidade do produto retirado: " + this.quantidade);
        //System.out.println("Data da retirada:" + this.getDataES());
    }
}
