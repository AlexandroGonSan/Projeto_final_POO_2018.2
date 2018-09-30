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
    //String re; //ninguém sabe para o que serve mesmo
    int quantidade; //ok
    String descricao; //ok
    double preco; //ok
    int quantidadeMinima; //ok
    String categoria; //ok
    //static Integer quantidadeProdutos; //ela está agregada no arraylist como o tamanho da mesma
    
    Scanner scanf = new Scanner(System.in);
    
    public Produto(){
        this.cadastrarProduto();
    }
    
    public void cadastrarProduto(){
        
        do{
            System.out.println("Digite 1 para cadastrar produtos de Higiene;");
            System.out.println("Digite 2 para cadastrar produtos Alimentícios;");
            System.out.println("Digite 3 para cadastrar Medicamentos;");
            this.categoria = scanf.next();
        }while (this.equals("1") == false ||
                this.equals("2") == false || 
                this.equals("3") == false); //analisa se a resposta se encontra nos padrões
                
        if("1".equals(this.categoria)){
            this.categoria = "Higiene";
        }
        else if("2".equals(this.categoria)){
            this.categoria = "Alimento";
        }
        else{
            this.categoria = "Medicamento";
        }
        
        System.out.println("Digite o nome do produto:");
        this.descricao = scanf.nextLine();
        
        System.out.println("Digite o preço do produto");
        this.preco = scanf.nextDouble();
        
        System.out.println("Digite a data de validade do produto");
        this.validade.setDate(scanf.nextInt());
        
        System.out.println("Digite o ID do produto");
        this.ID = scanf.nextInt();
        
        System.out.println("Digite o lote do produto");
        this.lote = scanf.nextInt();
        
        System.out.println("Digite a quantidade que será cadastrada");
        this.quantidade = scanf.nextInt();
        
        System.out.println("Digite a quantidade mínima");
        this.quantidadeMinima = scanf.nextInt();
        
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
