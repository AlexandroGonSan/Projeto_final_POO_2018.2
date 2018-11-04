/**Classe que será o modelo para os objetos do tipo Produto
 * @author LuluTeam
 */
package sistema.de.estoque;
import java.util.Date;
import java.util.Scanner;
        
/**
 * Classe usada para representar o produto armazenado no estoque.
 */
public class Produto{
    static Integer qntID = 1;
    Integer ID;  // ok
    Date validade = new Date(); //ok
    String lote; //ok
    int quantidade = 0; //ok
    int quantidadeMinima; //ok
    String nome; //ok
    double preco; //ok
    String categoria; //ok
    
    private Scanner scanf = new Scanner(System.in);
    
    /**Método para cadastrar as informações quando o produto for inserido.
     * Como é um cadastro, todas as informações são inseridas agora.
     */
    public Produto(){
        this.cadastrarProduto();
    }
    
    /**
     * Construtor que recebe nos argumentos as informações a serem inseridas nos atributos do objeto.
     * @param ID Integer - ID do produto;
     * @param lote String - lote do produto;
     * @param quantidade int - quantidade do produto;
     * @param quantidadeMinima int - quatidade mínima aceitável do produto no estoque;
     * @param nome String - nome do produto;
     * @param preco double - preço do produto;
     * @param categoria String - categoria do produto;
     */
    public Produto(Integer ID, String lote, int quantidade, int quantidadeMinima, String nome, double preco, String categoria) {
        
        this.ID = ID;
        this.lote = lote;
        this.quantidade = quantidade;
        this.quantidadeMinima = quantidadeMinima;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    /**
     * Método para o usuário cadastrar as informações do produto.
     */
    public void cadastrarProduto() {
        System.out.println("Digite o nome do produto:");
        this.nome = scanf.nextLine();
        this.nome = this.nome.toUpperCase();
        this.ID = this.qntID++;
       /* System.out.println("Digite o ID do produto:");
        this.ID = scanf.nextInt();*/
        
        System.out.println("Digite o dia de validade:");
        this.validade.setDate(scanf.nextInt());
        
        System.out.println("Digite o mês de validade:");
        this.validade.setMonth(scanf.nextInt());
        
        System.out.println("Digite o ano de validade:");
        this.validade.setYear(scanf.nextInt());
        scanf.nextLine();//isso corrige o erro de pular a próxima inserção
        
        System.out.println("Digite o lote do produto:");
        this.lote = scanf.nextLine();
        
        do{
            System.out.println("Digite a quantidade mínima tolerável:");
            this.quantidadeMinima = scanf.nextInt();
        }while(this.quantidadeMinima < 0);
        
        do{
            System.out.println("Digite a quantidade que será cadastrada:");
            this.quantidade = scanf.nextInt();
        }while(this.quantidade < 0);

        do{
            System.out.println("Digite o preço do produto (use vírgula para separar a parte inteira):");
            this.preco = scanf.nextDouble();
        }while(this.preco <= 0);
        
        do{
            System.out.println("Digite o tipo a ser selecionado (higiene, alimento ou medicamento): ");
            this.categoria = scanf.next();
        }while(this.setCategoria(this.categoria) == false); //analisa se a resposta se encontra nos padrões
        
        if (this.quantidadeMinima > this.quantidade){
            System.out.println("Quantidade abaixo do mínimo!");
        }
        System.out.println();
    }
    
    /**A função recebe o nome da categoria e valida caso esteja nas categorias.
     * @param valor String - recebe o nome da categoria.
     * @return boolean - retorna true caso o argumento valor seja uma das categorias.
     */
    public boolean setCategoria(String valor){
        String aux = valor.toUpperCase();
        if(aux.equals("HIGIENE")){
            this.categoria = "HIGIENE";
            return true;
        }
        if(aux.equals("ALIMENTO")){
            this.categoria = "ALIMENTO";
            return true;
        }
        if(aux.equals("MEDICAMENTO")){
            this.categoria = "MEDICAMENTO";
            return true;
        }
        return false;
    }
    
    /**
     * Método usado para o usuário alterar uma informação do produto.
     */
    public void alterarProduto(){
        //seria bacana se pudéssemos colocar senha para alterar
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
            System.out.println("Digite uma opção válida: ");
            auxInt = scanf.nextInt();
        }while(auxInt < 1 || 7 < auxInt);
        switch(auxInt){
            case 1:
                System.out.print("Insira o novo ID: ");
                this.ID = scanf.nextInt();
            case 2:
                System.out.print("Insira o novo dia da validade: ");
                this.validade.setDate(scanf.nextInt());
                System.out.print("Insira o novo mês da validade: ");
                this.validade.setMonth(scanf.nextInt());
                System.out.print("Insira o novo ano da validade: ");
                this.validade.setYear(scanf.nextInt());
            case 3:
                System.out.print("Insira o novo lote: ");
                this.lote = scanf.next();
            case 4:
                System.out.print("Insira a nova quantidade mínima: ");
                this.quantidadeMinima = scanf.nextInt();
            case 5:
                System.out.print("Insira o nome: ");
                this.nome = scanf.nextLine();
            case 6:
                System.out.print("Insira o preço: ");
                this.preco = scanf.nextDouble();
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
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Produto{" + "ID =  " + ID + ", validade =  " + validade + ", lote =  " + lote + ",\n quantidade =  " + quantidade + 
                ", quantidade Minima =  " + quantidadeMinima + ", nome =  " + nome + ", preco =  " + preco + ", categoria =  " + categoria + '}';
    }
        
    /**
     * Método de retorno da validade do produto no formato DD/MM/AAAA.
     * @return Integer - ID do produto.
     */
    public String getValidade(){
        return this.validade.getDate() + "/" + this.validade.getMonth() + "/" + this.validade.getYear();
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

    /**
     * Método de retorno do nome do produto.
     * @return String - nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método de retorno da categoria do produto.
     * @return double - preço do produto.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Método de retorno da categoria do produto.
     * @return String - categoria do produto.
     */
    public String getCategoria() {
        return categoria;
    }
    
}
