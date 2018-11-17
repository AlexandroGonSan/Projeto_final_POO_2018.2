/*
    *@author LuluTeam
 */
package sistemaDeEstoque;

import java.io.Serializable;
import java.util.Scanner;

/**
 * A classe representa um fornecedor e possui os atributos:
 *  - nome (String): nome do fornecedor;
 *  - CNPJ (String): CNPJ do fornecedor devendo conter 14 dígitos;
 *  - produtoFornecido (String): nome do produto fornecido;
 *  - alterar (String): a informação a ser alterada pelo usuário;
 * @author LuluTeam
 */
public class Fornecedor implements Serializable{
    private String nome;
    private String CNPJ;
    private String produtoFornecido;
    //private String alterar;
    
    public Fornecedor(int a){
    }
    
    Fornecedor(){
        this.cadastrarFornecedor();
    }
    
    /**
     * O construtor recebe os parâmetros para inserir nos atributos.
     * @param razao String - recebe a razão social do fornecedor;
     * @param prodForn String - recebe o produto que ele fornece;
     * @param CNPJ String - possui 14 dígitos e é o CNPJ do fornecedor.
     */
    public Fornecedor(String razao, String prodForn, String CNPJ){
        this.setNome(razao);
        this.setProdutoFornecido(prodForn);
        this.setCNPJ(CNPJ);
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String entrada) {
        this.nome = entrada.toUpperCase();
    }

    public String getProdutoFornecido() {
        return produtoFornecido;
    }
    
    public void setProdutoFornecido(String entrada) {
        this.produtoFornecido = entrada.toUpperCase();
    }
    
    public String getCNPJ(){
        return this.CNPJ;
    }
    
    public boolean setCNPJ(String entrada){
        try{
            int aux = Integer.parseInt(entrada);
            if (aux >= 0 && entrada.length() == 14){
                this.CNPJ = entrada;
                return true;
            } else {
                return false;
            }
        } catch(NumberFormatException e) {
            return false;
        }
    }
    /**
     * O método é usado para o usuário cadastar os dados do fornecedor.
     */
    public void cadastrarFornecedor(){
        Scanner scanf = new Scanner(System.in);
        System.out.print("Insira o nome do fornecedor: ");
        this.setNome(scanf.nextLine());
        do{
            System.out.print("Insira o CNPJ do fornecedor digitando somente os 14 dígitos: ");
        }while( this.setCNPJ(scanf.nextLine()) );
        System.out.print("Insira o produto do fornecedor: ");
        this.setProdutoFornecido(scanf.nextLine());
    }

    /**
     * Esse método é usado para alterar o nome ou CNPJ do fornecedor.
     */
    public void alterarFornecedor(){
        String alterar;
        Scanner scanf = new Scanner(System.in);
        System.out.println("O que deseja alterar do fornecedor? Nome ou CNPJ?");
        alterar = scanf.nextLine();
        alterar = alterar.toUpperCase();
        if("NOME".equals(alterar)){
            System.out.println("Digite o novo Nome: ");
            this.nome = scanf.nextLine();
        }else if("CNPJ".equals(alterar)){
            do{
                System.out.print("Insira o CNPJ do fornecedor digitando somente os 14 dígitos: ");
            }while( this.setCNPJ(scanf.nextLine()) );
        }
    }
}
  
