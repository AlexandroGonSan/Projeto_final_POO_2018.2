/**Classe que será o modelo para os objetos do tipo Produto
 * @author LuluTeam
 */
package sistema.de.estoque;
import java.util.Date;
import java.util.Scanner;
        
public class Produto {
    Integer ID; // ok
    Date validade = new Date(); //ok
    Integer lote; //ok
    int quantidade; //ok
    int quantidadeMinima; //ok
    String nome; //ok
    double preco; //ok
    String categoria; //ok
    
    Scanner scanf = new Scanner(System.in);
    
    public Produto(){
        this.cadastrarProduto();
    }
    
    /**Método para cadastrar as informações quando o produto for inserido.
     * Como é um cadastro, todas as informações são inseridas agora.
     */
    
    public void cadastrarProduto(){
        
        System.out.println("Digite o ID do produto");
        this.ID = scanf.nextInt();
        
        System.out.println("Digite o dia de validade");
        this.validade.setDate(scanf.nextInt());
        
        System.out.println("Digite o mês de validade");
        this.validade.setMonth(scanf.nextInt());
        
        System.out.println("Digite o ano de validade");
        this.validade.setYear(scanf.nextInt());
        
        System.out.println("Digite o lote do produto");
        this.lote = scanf.nextInt();
        
        do{
        System.out.println("Digite a quantidade que será cadastrada");
        this.quantidade = scanf.nextInt();
        }while(this.quantidade < 0);
        
        System.out.println("Digite o nome do produto:");
        this.nome = scanf.nextLine();
        
        do{
        System.out.println("Digite o preço do produto");
        this.preco = scanf.nextDouble();
        }while(this.preco <= 0);
        
        do{
        System.out.println("Digite a quantidade mínima");
        this.quantidadeMinima = scanf.nextInt();
        }while(this.quantidadeMinima < 0);
        
        do{
            System.out.println("Digite o tipo a ser selecionado (higiene, alimento ou medicamento): ");
            this.categoria = scanf.next();
        }while(this.setCategoria(this.categoria)); //analisa se a resposta se encontra nos padrões
        
        if (this.quantidadeMinima > this.quantidade){
            System.out.println("Quantidade abaixo do mínimo!");
        }
    }
    
    /**A função recebe o nome da categoria e valida caso esteja nas categorias.
     * @param valor String - recebe o nome da categoria.
     * @return boolean - retorna true caso o argumento valor seja uma das categorias.
     */
    public boolean setCategoria(String valor){
        String aux = valor.toUpperCase();
        if(aux.equals("HIGIENE")){
            this.categoria = "Higiene";
            return true;
        }
        if(aux.equals("ALIMENTO")){
            this.categoria = "Alimento";
            return true;
        }
        if(aux.equals("MEDICAMENTO")){
            this.categoria = "Medicamento";
            return true;
        }
        return false;
    }
    
    public void alterarProduto(){
        
    }
    
    /**Retorna a quantidade do produto no estoque.
     * @return int - valor da quantidade do produto.
     */
    public int getQuantidade(){
        return this.quantidade;
    }
}
