/**Sistema onde conterá a função main do programa
 * @author LuluTeam
 */

package sistemaDeEstoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
/**
 * Classe principal do sistema, onde ocorre o gerenciamento das classes,
 * para o funcionamento do sistema.
 * @author LuluTeam
 */
public class SistemaDeEstoque implements Serializable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        List<Produto> produtos = new ArrayList<>();
        List<Fornecedor> fornecedores = new ArrayList<>();
        List<Relatorio> relatorios = new ArrayList<>();
        
        int opcao = 0;
        int intAux;
        String strAux;
        List<Produto> listAux = new ArrayList<>(); 
   
        
        Scanner scanf = new Scanner(System.in);
        
        while(opcao != 10){
            System.out.println("O que deseja fazer ?\nDigite o número da opção desejada:");
            System.out.println("1 - Cadastrar novo Produtos ao estoque");
            System.out.println("2 - Repor estoque de produto"); 
            System.out.println("3 - Retirar quantia do produto do estoque"); 
            System.out.println("4 - Gerar Relatório das alterações no estoque");
            System.out.println("5 - Adicionar fornecedor ao sistema");
            System.out.println("6 - Exibir produtos");
            System.out.println("10 - Sair do programa");
            System.out.print("Digite a opção: ");
       
                try{
                    opcao = scanf.nextInt();
                    scanf.nextLine();
                }
                catch(Exception ex){
                    System.out.println("Error, o valor digitado precisa ser um número.\n" );
                    break;
                }
           
          
            switch (opcao){
                case 1:
                    System.out.println("ADICIONAR PRODUTO");
                    produtos.add(new Produto());
                    
                    Entrada relatorioNovo = new Entrada(produtos.get(produtos.size()-1));
          
                    relatorios.add(relatorioNovo);
                    try {
                     FileOutputStream arquivoGrav = new FileOutputStream("TesteProduto.txt"); 
                     ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
 
                    objGravar.writeObject(produtos);
                    objGravar.flush();
                    objGravar.close();
                    arquivoGrav.flush();
                    arquivoGrav.close();
 
                    System.out.println("Cadastro realizado com sucesso!");
                    } 
                    catch(IOException e) {
                        e.printStackTrace();
                    }
 
                   // System.out.println("Recuperando objeto: ");
     
                  try {
                     //Carrega o arquivo
                     FileInputStream arquivoLeitura = new FileInputStream ("TesteProduto.txt");
                     //Classe responsavel por recuperar os objetos do arquivo
 
                     ObjectInputStream objLeitura =  new ObjectInputStream(arquivoLeitura);
                     //System.out.println(objLeitura.readObject());
                     objLeitura.close();
                     arquivoLeitura.close();
                        }
 
                    catch(IOException e) {
                        e.printStackTrace();
                    }
                    break;    
                    
                    
                case 2:
                 
                    System.out.println("Insira o nome ou parte dele: ");
                    strAux = scanf.nextLine();
                    strAux = strAux.toUpperCase();
                    for(Produto prod : produtos){//busca pelo item na lista
                        if(prod.getNome().contains(strAux)){//analisa se o nome contêm uma parte de strAux
                            listAux.add(prod);
                        }
                    }
                    if(listAux.isEmpty()){//retorna True se não há produtos com esse nome
                        System.out.println("Produto não cadastrado");
                        System.out.println("Digite 1 para cadastrá-lo ou outra tecla para sair da opção e pressione ENTER:");
                        strAux = scanf.nextLine();
                        if(strAux.equals("1")){//adiciona ele na lista de produtos
                            produtos.add(new Produto());
                        } else {//vai pro menu principal
                            System.out.println("Retornando ao menu principal");
                            break;
                        }
                    } else {//mostra os produtos selecionados
                        System.out.println("Selecione o produto");
                        for(int cont = 0; cont < listAux.size(); cont++){
                            System.out.println("Item: " + cont + " Nome: " + listAux.get(cont).getNome() + ", ID: " + listAux.get(cont).ID);
                            //exibe uma lista dos itens contendo esse nome mostrando a ID e o nome
                        }
                        do{
                            System.out.println("Selecione qual item deseja alterar: ");
                            intAux = scanf.nextInt();
                        }while(intAux < 0 || intAux > listAux.size());
                        //espera receber o valor válido
                        int quantidade;
                        do{
                            System.out.println("Insira a quantidade a inserir: ");
                            quantidade = scanf.nextInt();
                        }while(quantidade <= 0 );
                        listAux.get(intAux).reporQuantia(quantidade);
                        Entrada relatorioNovo2 = new Entrada(listAux.get(intAux));
                        relatorioNovo2.quantidade = quantidade;
                        relatorios.add(relatorioNovo2);
                        System.out.println("");
                        System.out.println("Relatório da operação efetuada:");
                        relatorios.get(relatorios.size()-1).gerarRelatorio(); // Gerar relatório sempre do ultimo adicionado
                                                                              //ou seja da ultima operação realizada que foi a de add;              
                    }
                    System.out.println("Retornando ao menu principal");
                    break;
                case 3:
                    try {
                     //Carrega o arquivo
                     FileInputStream arquivoLeitura = new FileInputStream ("TesteProduto.txt");
                     //Classe responsavel por recuperar os objetos do arquivo
 
                     ObjectInputStream objLeitura =  new ObjectInputStream(arquivoLeitura);
                     //System.out.println(objLeitura.readObject());
                     objLeitura.close();
                     arquivoLeitura.close();
                     }
 
                    catch(Exception e) {
                            e.printStackTrace();
                    }
                    
                    System.out.println("Insira o nome ou parte dele: ");
                    strAux = scanf.nextLine();
                    strAux = strAux.toUpperCase();
                    for(Produto prod : produtos){//busca pelo item na lista
                        if(prod.getNome().contains(strAux)){//analisa se o nome contêm uma parte de strAux
                            listAux.add(prod);
                        }
                    }
                    if(listAux.isEmpty()){//retorna True se não há produtos com esse nome
                        System.out.println("Produto não cadastrado");
                        System.out.println("Digite 1 para cadastrá-lo ou outra tecla para sair da opção e pressione ENTER:");
                        strAux = scanf.nextLine();
                        if(strAux.equals("1")){//adiciona ele na lista de produtos
                            produtos.add(new Produto());
                        } else {//vai pro menu principal
                            System.out.println("Retornando ao menu principal");
                            break;
                        }
                    } else {//mostra os produtos selecionados
                        System.out.println("Selecione o produto");
                        for(int cont = 0; cont < listAux.size(); cont++){
                            System.out.println("Item: " + cont + " Nome: " + listAux.get(cont).getNome() + ", ID: " + listAux.get(cont).ID);
                            //exibe uma lista dos itens contendo esse nome mostrando a ID e o nome
                        }
                        do{
                            System.out.println("Selecione qual produto deseja alterar: ");
                            intAux = scanf.nextInt();
                        }while(intAux < 0 || intAux > listAux.size());
                        //espera receber o valor válido
                        int quantidade;
                        do{
                            System.out.println("Insira a quantidade a retirar: ");
                            quantidade = scanf.nextInt();
                        }while( quantidade <= 0 || quantidade > listAux.get(intAux).quantidade);
                        //implementar uma funçao que checa <=0 ou > que o estoque atual
                        //espera receber valor válido
                        listAux.get(intAux).retirarQuantia(quantidade);
                        //TODO falta fazer a seleção do item e inserir a quantidade
                        Saida relatorioNovo3 = new Saida(listAux.get(intAux));
                        relatorioNovo3.quantidade = quantidade;
                        relatorios.add(relatorioNovo3);
                        System.out.println("");
                        System.out.println("Relatório da operação efetuada:");
                        relatorios.get(relatorios.size()-1).gerarRelatorio();
                        System.out.println(""); //pulando linha para ficar bonitinho;
                    }
                    
                    System.out.println("Retornando ao menu principal");
                    break;
                case 4:
                    //GERAR RELATORIO
                    System.out.println(""); //pulando uma linha para ficar bonitinho;
                    System.out.println("Gerando Relatórios...");
                    System.out.println("");// Pulando uma linha para ficar bonitinho;
                    System.out.println("Relatórios de Entrada no estoque:");
                    for(int i = 0 ; i <= relatorios.size()-1; i++){
            
                        if(relatorios.get(i) instanceof Entrada){
                            relatorios.get(i).gerarRelatorio();
                        }
                    }
                    
                    System.out.println("");
                    System.out.println("Relatórios de Saída no estoque:");
                    for(int i = 0 ; i <= relatorios.size()-1; i++){
                        
                        if(relatorios.get(i) instanceof Saida){
                            relatorios.get(i).gerarRelatorio();
                        }
                    }
                    
                    
                    break;
                case 5:
                    //ADICIONAR FORNECEDOR
                    System.out.println("ADICIONAR FORNECEDOR");
                    fornecedores.add(new Fornecedor());
                     try {
 
                     //Gera o arquivo para armazenar o objeto
                     FileOutputStream arquivoGrav = new FileOutputStream("TesteFornecedor.txt");
 
                     //Classe responsavel por inserir os objetos
                     ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
 
                     //Grava o objeto fornecedores no arquivo
                    objGravar.writeObject(fornecedores);
                    objGravar.flush();
                    objGravar.close();
                    arquivoGrav.flush();
                    arquivoGrav.close();
 
                    System.out.println("Objeto gravado com sucesso!");
                             }
 
                    catch(Exception e) {
                     e.printStackTrace();
                    }
 
                    System.out.println("Recuperando objeto: ");
 
                    
                    try {
                     //Carrega o arquivo
                     FileInputStream arquivoLeitura = new FileInputStream ("TesteFornecedor.txt");
                     //Classe responsavel por recuperar os objetos do arquivo
 
                     ObjectInputStream objLeitura =  new ObjectInputStream(arquivoLeitura);
                     System.out.println(objLeitura.readObject());
                     objLeitura.close();
                     arquivoLeitura.close();
                        }
 
                    catch(Exception e) {
                        e.printStackTrace();
                    }
 
                    break;
                    
                case 6:
                    //MOSTRAR PRODUTOS
                     try {
                     //Carrega o arquivo
                     FileInputStream arquivoLeitura = new FileInputStream ("TesteProduto.txt");
                     //Classe responsavel por recuperar os objetos do arquivo
 
                     ObjectInputStream objLeitura =  new ObjectInputStream(arquivoLeitura);
                     System.out.println(objLeitura.readObject());
                     objLeitura.close();
                     arquivoLeitura.close();
                        }
 
                    catch(Exception e) {
                            e.printStackTrace();
                    }
                     
                   for(Produto prod : produtos){
                        System.out.print(prod.getNome() + ", Cat: " + prod.getCategoria() + ", ID: " + prod.ID + ", lote: " + prod.lote);
                        System.out.print(", Preço: " + prod.preco + ", Quant: " + prod.quantidade + ", Quant min: " + prod.quantidadeMinima);
                        System.out.println(", Data de Validade: " + prod.getValidade());
                        System.out.println("");
                    }
                    break;
                     
                case 10:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Opção inválida, retornando ao menu principal");
            }
            listAux.clear();
        }      
    }
}
