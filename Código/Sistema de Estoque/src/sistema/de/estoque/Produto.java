/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.de.estoque;
import java.util.Date;
import java.util.Scanner;
        
public class Produto {
    Integer ID; // ok
    Date validade;
    Integer lote; //ok
    String re;
    int quantidade; //ok
    String descricao; 
    double preco; //ok
    int quantidadeMinima; //ok
    String categoria; //ok
    static Integer quantidadeProdutos; //no main
    Scanner scanf = new Scanner(System.in);
    public void cadastrarProduto(){
        System.out.println("Digite 1 para cadastrar produtos de Higiene;");
        System.out.println("Digite 2 para cadastrar produtos Alimentícios;");
        System.out.println("Digite 3 para cadastrar Medicamentos;");
        this.categoria = scanf.next();
        if("1".equals(this.categoria)){
            this.categoria = "Higiene";
        }
        if("2".equals(this.categoria)){
            this.categoria = "Alimento";
        }
        if("3".equals(this.categoria)){
            this.categoria = "Medicamento";
        }
        
        
        System.out.println("Digite o nome do produto:");
        this.descricao = scanf.next();
        
        System.out.println("Digite o preço do produto");
        this.preco = scanf.nextInt();
        
        
        
        
        
        System.out.println("Digite o ID do produto");
        this.ID = scanf.nextInt();
        
        
        System.out.println("Digite o lote do produto");
        this.lote = scanf.nextInt();
        
        
        System.out.println("Digite a quantidade que será cadastrada");
        this.quantidade = scanf.nextInt();
        this.quantidadeMinima = 10;
        if (this.quantidadeMinima > this.quantidade){
            System.out.println("Quantidade abaixo do mínimo!");
        }
   
        
        
        
        
    }
    public void excluirProduto(){
        
    }
    public void alterarProduto(){
        
    }
    public boolean buscarProduto(){
        return true;
    }
    public int mostrarQuantidade(){
        return 1;
    }
}
