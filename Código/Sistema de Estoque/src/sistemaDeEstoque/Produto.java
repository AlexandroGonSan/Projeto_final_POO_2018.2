/**Classe que será o modelo para os objetos do tipo Produto
 * @author LuluTeam
 */
package sistemaDeEstoque;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

        
/**
 * Classe usada para representar o produto armazenado no estoque.
 */

public class Produto implements Serializable{
    static Integer qntID = 1;
    Integer ID;  
    Date validade = new Date(); 
    String lote; 
    private int quantidade = 0; 
    private int quantidadeMinima; 
    private String nome; 
    private double preco; 
    private String categoria;
    
    transient Scanner scanf = new Scanner(System.in);
    //private SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
      
    
    /**Método para cadastrar as informações quando o produto for inserido.
     * Como é um cadastro, todas as informações são inseridas agora.
     */
    
    /**
     * Construtor que recebe nos argumentos as informações a serem inseridas nos atributos do objeto.
     * @param ID Integer - ID do produto;
     * @param lote String - lote do produto;
     * @param quantidade int - quantidade do produto;
     * @param quantidadeMinima int - quatidade mínima aceitável do produto no estoque;
     * @param nome String - nome do produto;
     * @param preco double - preço do produto;
     * @param categoria String - categoria do produto;
     * @param day String - dia de validade do produto;
     * @param month String - mês de validade do produto que será subtraído por 1;
     * @param year String - ano de validade do produto que será subtraído por 1900;
     */
    public Produto(Integer ID, String lote, int quantidade, int quantidadeMinima, String nome, double preco, String categoria, String day, String month, String year) {
        
        this.ID = ID;
        this.lote = lote;
        this.quantidade = quantidade;
        this.quantidadeMinima = quantidadeMinima;
        this.setNome(nome);
        this.preco = preco;
        this.setCategoria(categoria);
        this.validade.setDate(Integer.parseInt(day));
        this.validade.setMonth(Integer.parseInt(month)-1);
        this.validade.setYear(Integer.parseInt(year)-1900);
        
    }
    
    public Produto(int a) {
    }

    public Produto() {
        this.cadastrarProduto();
    }

    /**
     * Método para o usuário cadastrar as informações do produto.
     */
    
    public void cadastrarProduto() {
        System.out.print("Digite o nome do produto: ");
        this.setNome(scanf.nextLine());
        this.ID = Produto.qntID++;
        
        System.out.print("Insira a data de validade no formato MM/DD/AAAA: ");
        this.validade = new Date(scanf.nextLine());
        
        System.out.print("Digite o lote do produto: ");
        this.lote = scanf.nextLine();
        
        do{
            System.out.print("Digite a quantidade mínima tolerável: ");
            this.quantidadeMinima = scanf.nextInt();
        }while(this.quantidadeMinima < 0);
        
        do{
            System.out.print("Digite a quantidade que será cadastrada: ");
            this.quantidade = scanf.nextInt();
        }while(this.quantidade < 0);

        do{
            System.out.print("Digite o preço do produto (use vírgula para separar a parte inteira): ");
            this.preco = scanf.nextDouble();
            scanf.nextLine();
        }while(this.preco <= 0);
        
        String strAux;
        do{
            System.out.print("Digite o tipo a ser selecionado (Higiene, Alimento ou Medicamento): ");
            strAux = scanf.nextLine();
        }while(this.setCategoria(strAux) == false); 
        
        if (this.quantidadeMinima > this.quantidade){
            System.out.println("Quantidade abaixo do mínimo!");
        }
        System.out.println("");
    }
    
    /**
     * Método de retorno da categoria do produto.
     * @return String - categoria do produto.
     */
    public String getCategoria() {
        return categoria;
    }
    
    /**
     * A função recebe o nome da categoria e valida caso esteja nas categorias.
     * @param valor String - recebe o nome da categoria.
     * @return boolean - retorna true caso o argumento valor seja uma das categorias.
     */
    public boolean setCategoria(String valor){
        String aux = valor.toUpperCase();
        switch (aux) {
            case "HIGIENE":
                this.categoria = "HIGIENE";
                return true;
            case "ALIMENTO":
                this.categoria = "ALIMENTO";
                return true;
            case "MEDICAMENTO":
                this.categoria = "MEDICAMENTO";
                return true;
            default:
                break;
        }
        return false;
    }
    
    /**
     * Método usado para o usuário alterar uma informação do produto.
     */
    public void alterarProduto(){

        int auxInt;
        
        System.out.print("ALTERAR PRODUTO\n"
                + "Digite qual item vc deseja alterar:\n"
                + "1 para ID\n"
                + "2 para validade\n"
                + "3 para lote\n"
                + "4 para quantidade mínima\n"
                + "5 para nome\n"
                + "6 para preço\n"
                + "7 para categoria\n");
        do{
            System.out.print("Digite uma opção válida: ");
            auxInt = scanf.nextInt();
        }while(auxInt < 1 || 7 < auxInt);
        switch(auxInt){
            case 1:
                System.out.print("Insira o novo ID: ");
                this.ID = scanf.nextInt();
            case 2:
                System.out.print("Insira a nova data no formato MM/DD/AAAA: ");
                this.validade = new Date(scanf.nextLine());
           
            case 3:
                System.out.print("Insira o novo lote: ");
                this.lote = scanf.next();
            case 4:
                System.out.print("Insira a nova quantidade mínima: ");
                this.setQuantidadeMinima(scanf.nextInt());
            case 5:
                System.out.print("Insira o nome: ");
                this.setNome(scanf.nextLine());
            case 6:
                System.out.print("Insira o preço: ");
                this.setPreco(scanf.nextDouble());
            case 7:
                System.out.print("Insira a categoria: ");
                if( this.setCategoria(scanf.next()) ){//retorna true se for uma das categorias
                    System.out.println("A alteração foi feita");
                } else {
                    System.out.println("Categoria incompatível");
                }
        }
    }
    
    /**Retorna a quantidade do produto no estoque.
     * @return int - valor da quantidade do produto.
     */
    public int getQuantidade(){
        return this.quantidade;
    }
    
    /**
     * Método que recebe uma quantia a ser inserida no estoque. 
     * Ele retorna true se o valor é válido (acima de 0) e false caso contrário.
     * @param valor int - quantia a ser inserida no estoque.
     * @return booelan - valor lógico retornado.
     */
    public boolean reporQuantia(int valor){
        if(valor > 0){
            this.quantidade += valor;
            return true;
        }
        return false;
    }
    
    /**
     * Método que retira uma quantia passada no argumento 
     * e retorna true se foi retirado seguindo a lógica de que não pode ser um 
     * valor maior que a quantidade que existe e não pode ser abaixo ou igual a zero 
     * e falso caso não houve a retirada.
     * @param valor int - valor que será retirado do estoque.
     * @return boolean - valor lógico que é retornado.
     */
    public boolean retirarQuantia(int valor){
        if(valor > 0 && valor < this.quantidade){
            this.quantidade -= valor;
            if (this.quantidadeMinima > this.quantidade){//analisa se a quantidade atual é menor que a do mínimo
                System.out.println("Quantidade abaixo do mínimo!");
                System.out.println("Atenção, a quantidade do produto está abaixo do recomendado");
            }
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "\nProduto {" + " ID =  " + ID + ", validade =  " + validade + ", lote =  " + lote + ",\n quantidade =  " + quantidade + 
                ", quantidade Minima =  " + quantidadeMinima + ", nome =  " + nome + ", preco =  " + preco + ", Validade = " + validade+  ", categoria =  " + this.getCategoria() + " \n";
    }
        
    /**
     * Método de retorno da validade do produto no formato DD/MM/AAAA.
     * @return Integer - ID do produto.
     */
    public String getValidade(){
        return this.validade.getDate() + "/" + (this.validade.getMonth()+1) + "/" + (this.validade.getYear()+1900);
    }

    /**
     * Método de retorno do ID do produto.
     * @return Integer - ID do produto.
     */
    public Integer getID() {
        return ID;
    }

    /**
     * Método de retorno do lote do produto.
     * @return String - lote do produto.
     */
    public String getLote() {
        return lote;
    }
    
    /**
     * Método de retorno da quantidade mínima do produto.
     * @return int - quantidade mínima do produto.
     */
    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }
    
    public boolean setQuantidadeMinima(int valor) {
        if(valor > 0){
            this.quantidadeMinima = valor;
            return true;
        }
        return false;
    }
    
    /**
     * Método de retorno da categoria do produto.
     * @return double - preço do produto.
     */
    public double getPreco() {
        return preco;
    }
    
    public boolean setPreco(double preco) {
        if(preco > 0.0){
            this.preco = preco;
            return true;
        }
        return false;
    }
    
    /**
     * Método de retorno do nome do produto.
     * @return String - nome do produto.
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * O método configura o nome para todas as letras maiúsculas.
     * @param texto - nome a ser configurado para maiúsculo.
     */
    public void setNome(String texto){
        this.nome = texto.toUpperCase();
    }
}
