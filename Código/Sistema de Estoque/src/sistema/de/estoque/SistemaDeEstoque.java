/**Sistema onde conterá a função main do programa
 * @author LuluTeam
 */

package sistema.de.estoque;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeEstoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*List<Produto> produtos = new ArrayList<>();
        List<Fornecedor> fornecedores = new ArrayList<>();
        List<Relatorio> relatorios = new ArrayList<>();*/
        Produto produto = new Produto();
        produto.cadastrarProduto();
        //produto.setCategoria("Higiene");
        
        
    }

    
}
