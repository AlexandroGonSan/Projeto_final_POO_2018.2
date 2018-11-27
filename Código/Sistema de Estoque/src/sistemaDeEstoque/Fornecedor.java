/*
    *@author LuluTeam
 */
package sistemaDeEstoque;

import java.io.Serializable;
import java.util.Scanner;

/**
 * A classe representa um fornecedor. 
 * Ela possui os atributos:\n
 *  - nome (String): nome do fornecedor;\n
 *  - CNPJ (String): CNPJ do fornecedor devendo conter 14 dígitos;\n
 *  - produtoFornecido (String): nome do produto fornecido;
 * @author LuluTeam
 */
public class Fornecedor implements Serializable{
    private String nome;
    private String CNPJ;
    private String produtoFornecido;
    /**
     * Construtor para intanciar um fornecedor.
     * @param a int - inteiro qualquer.
     */
    public Fornecedor(int a){
    }
    
    /**
     * Construtor para intanciar um fornecedor e cadastrá-lo pelo terminal.
     * 
     */
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
    /**
     * Método que retorna o nome do fornecedor.
     * @return String - nome do fornecedor.
     */
    public String getNome() {
        return nome;
    }
    /**
     * Método que muda o nome do fornecedor.
     * @param entrada String - novo nome do fornecedor.
     */
    public void setNome(String entrada) {
        this.nome = entrada.toUpperCase();
    }
    /**
     * Esse método retorna o nome do produto fornecido.
     * @return String - nome do produto fornecido.
     */
    public String getProdutoFornecido() {
        return produtoFornecido;
    }
    
    /**
     * Esse método muda o nome produto fornecido.
     * @param entrada String - novo nome do produto fornecido.
     */
    public void setProdutoFornecido(String entrada) {
        this.produtoFornecido = entrada.toUpperCase();
    }
    
    /**
     * Esse método retorna o CNPJ do fonecedor.
     * @return String - retorna o CNPJ.
     */
    public String getCNPJ(){
        return this.CNPJ;
    }
    
    /**
     * Esse método muda o CNPJ caso ele seja válido, ou seja, se ele tem somente números e tem 14 dígitos e
     * retorna um valor booleano.
     * @param entrada String - parâmetro com o novo CNPJ.
     * @return boolean - retorna true caso tenha ocorrido a mudança ou false no caso contrário.
     */
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
     * 
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
     * 
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
  
