/**Sistema onde conterá a função main do programa
 * @author LuluTeam
 */

package sistema.de.estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaDeEstoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*List<Produto> produtos = new ArrayList<>();
        List<Fornecedor> fornecedores = new ArrayList<>();
        List<Relatorio> relatorios = new ArrayList<>();*/
        //produto.cadastrarProduto();
        //produto.setCategoria("Higiene");
        int opcao;
        Scanner scanf = new Scanner(System.in);
        System.out.println("O que deseja fazer ? Digite o número da opção desejada:");
        System.out.println("1 - Adicionar Produtos ao estoque");
        System.out.println("2 - Remover Produtos do estoque");
        System.out.println("3 - Gerar Relatório das ultimas alterações no estoque");
        System.out.println("4 - Gerar Relatório APENAS das ultimas entradas");
        System.out.println("5 - Gerar Relatório APENAS das ultimas saídas");
        opcao = scanf.nextInt();
        switch case (opcao){
            case 1:
                
            case 2:
            
            case 3:
            
            case 4:
            
            case 5:
        }
                
                
                
         Produto produto = new Produto();
        
        
    }

    
}
