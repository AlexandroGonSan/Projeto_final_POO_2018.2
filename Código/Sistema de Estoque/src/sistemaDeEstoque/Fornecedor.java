/*

 */
package sistemaDeEstoque;

import java.io.Serializable;
import java.util.Scanner;

/**
 * A classe representa um fornecedor e possui os atributos:
 *  - nome (String): nome do fornecedor;
 *  - CNPJ (String): CNPJ do fornecedor devendo conter 14 dígitos;
 *  - produtoFornecido (String): nome do produto fornecido;
 * @author Linhares Filho
 */
public class Fornecedor implements Serializable{
    String nome;
    String CNPJ;
    String produtoFornecido;
    private String alterar;
    
    transient Scanner scanf = new Scanner(System.in);
    
    Fornecedor(){
        this.cadastrarFornecedor();
    }
    
    /**
     * O construtors recebe os parâmetros para inserir nos atributos.
     * @param razao String - recebe a razão social do fornecedor;
     * @param prodForn String - recebe o produto que ele fornece;
     * @param CNPJ String - possui 14 dígitos e é o CNPJ do fornecedor.
     */
    public Fornecedor(String razao, String prodForn, String CNPJ){
        this.nome = razao;
        this.produtoFornecido = prodForn;
        this.CNPJ = CNPJ;
    }
    
    /**
     * O método é usado para o usuário cadastar os dados do fornecedor.
     */
    public void cadastrarFornecedor(){
        System.out.print("Insira o nome do fornecedor: ");
        this.nome = scanf.nextLine();
        this.nome = this.nome.toUpperCase();
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

    /**
     * Esse método é usado para alterar o nome ou CNPJ do fornecedor.
     */
    public void alterarFornecedor(){
        System.out.println("O que deseja alterar do fornecedor? Nome ou CNPJ?");
        this.alterar = scanf.nextLine();
        this.alterar = this.alterar.toUpperCase();
        if("NOME".equals(alterar)){
            System.out.println("Digite o novo Nome: ");
            this.nome = scanf.nextLine();
        }else if("CNPJ".equals(alterar)){
        do{
            System.out.print("Insira o CNPJ do fornecedor digitando somente os 14 dígitos: ");
            this.CNPJ = scanf.nextLine();
            if(this.CNPJ.length() < 14){
                System.out.println("Número menor que 14 dígitos");
            } else if (this.CNPJ.length() > 14){
                System.out.println("Número maior que 14 dígitos");
            }
        }while(this.CNPJ.length() != 14);
                     
        }
    }
    
    
}
  
