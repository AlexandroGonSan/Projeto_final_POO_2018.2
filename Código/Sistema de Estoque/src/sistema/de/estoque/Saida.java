/*

 */
package sistema.de.estoque;

/**
 *
 * @author Luigi Muller
 */
public class Saida extends Relatorio {
    String destino;
    @Override
    public void gerarRelatorio(){
        super.gerarRelatorio();
        System.out.println("Quantidade do produto retirado: " + this.quantidade);
        System.out.println("Data da retirada:" + this.getDataES());
    }
}
