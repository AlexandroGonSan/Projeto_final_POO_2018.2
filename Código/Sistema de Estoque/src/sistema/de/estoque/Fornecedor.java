/*

 */
package sistema.de.estoque;

import java.util.Scanner;


public class Fornecedor {
    String nome;
    String CNPJ;
    String produtoFornecido;
    
    private Scanner scanf = new Scanner(System.in);
    
    Fornecedor(){
        this.cadastrarFornecedor();
    }
    
    public void cadastrarFornecedor(){
        System.out.print("Insira o nome do fornecedor: ");
        this.nome = scanf.nextLine();
        do{
            System.out.print("Insira o CNPJ do fornecedor digitando somente os 14 dígitos: ");
            this.CNPJ = scanf.nextLine();
            if(this.CNPJ.length() < 14){
                System.out.println("Número menor que 14 dígitos");
            } else if (this.CNPJ.length() > 14){
                System.out.println("Número maior que 14 dígitos");
            }
        }while(this.CNPJ.length() != 14);
        System.out.print("Insira o produto do fornecedor: ");
        this.produtoFornecido = scanf.nextLine();
    }
    public void excluirFornecedor(){
        
    }
    public void buscarFornecedor(){
        
    }
    public void alterarFornecedor(){
        
    }
}
