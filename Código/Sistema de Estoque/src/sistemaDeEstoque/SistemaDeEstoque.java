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
      
//        List<Produto> produtos = new ArrayList<>();
//        List<Fornecedor> fornecedores = new ArrayList<>();
//        List<Relatorio> relatorios = new ArrayList<>();
        
        int opcao = 0;
        int intAux;
        String strAux;
        List<Produto> listAux = new ArrayList<>(); 
   
        
        Scanner scanf = new Scanner(System.in);
        
        /**
         * Estrutura do while para opcao da entrada da tela.  
         */
        
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
       
            /**
             * Tratação de error try catch para pegar error da digitação da opcao 
             */
            try{
                opcao = scanf.nextInt();
                scanf.nextLine();
            }
            catch(Exception ex){
                System.out.println("Error, o valor digitado precisa ser um número.\n" );
                break;
                }
           
          /**
           * Switch case para opcao de instrução  
           */
          
            switch (opcao){
                case 1:
                    /**
                     * Deserialização dos objetos na classe produto
                     * Metódo try catch pra tratar error em caso arquivo não abrir
                     */
                    try {
                 
                     FileInputStream arquivoLeitura = new FileInputStream ("TesteProduto.txt");
                     ObjectInputStream objLeitura =  new ObjectInputStream(arquivoLeitura);
                     Dados.dados = (ArrayList<Produto>) objLeitura.readObject();
                     objLeitura.close();
                     arquivoLeitura.close();
                     }
 
                    catch(Exception e) {
                            System.out.println("ERROR! não foi possível abrir o arquivo! " + e.getMessage());
                    }
                    
                    /**
                     * Deserialização dos objetos na classe relatorio 
                     * Metódo try catch pra tratar error em caso arquivo não abrir
                     */
                    try {
                     FileInputStream arquivoLeitura = new FileInputStream ("Relatorios.txt");
                     ObjectInputStream objLeitura =  new ObjectInputStream(arquivoLeitura);
                     Dados.relatorios = (ArrayList<Relatorio>) objLeitura.readObject();
                     objLeitura.close();
                     arquivoLeitura.close();
                     }
 
                    catch(Exception e) {
                            System.out.println("ERROR! não foi possível abrir o arquivo! " + e.getMessage());
                    }
                    
                    
                    System.out.println("ADICIONAR PRODUTO:");
                    Dados.dados.add(new Produto());
                    Relatorio relatorioNovo = new Entrada(Dados.dados.get(Dados.dados.size()-1), "Entrada", 10, "Cadastro");
                    Dados.relatorios.add(relatorioNovo);
                    
                     /**
                     * serialização dos objetos na classe produto 
                     * Metódo try catch pra tratar error em caso arquivo não abrir
                     */
                    try {
                        FileOutputStream arquivoGrav = new FileOutputStream("TesteProduto.txt"); 
                        ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
                        objGravar.writeObject(Dados.dados);
                        objGravar.flush(); 
                        objGravar.close();
                        arquivoGrav.flush();
                        arquivoGrav.close();
                        System.out.println("Cadastro realizado com sucesso!");
                    } 
                    catch(IOException e) {
                        System.out.println("ERROR! não foi possível abrir o arquivo! " + e.getMessage());
                    }
                    
                    /**
                     * serialização dos objetos na classe relatorio 
                     * Metódo try catch pra tratar error em caso arquivo não abrir
                     */
                    try {
                        FileOutputStream arquivoGrav = new FileOutputStream("Relatorios.txt"); 
                        ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
                        objGravar.writeObject(Dados.relatorios);
                        objGravar.flush(); 
                        objGravar.close();
                        arquivoGrav.flush();
                        arquivoGrav.close();
                    } 
                    catch(IOException e) {
                        System.out.println("ERROR! não foi possível abrir o arquivo! " + e.getMessage());
                    }
                    break;    
                    
                    
                case 2:
                    /**
                     * Deserialização dos objetos na classe produto
                     * Metódo try catch pra tratar error em caso arquivo não abrir
                     */
                    try {
                 
                     FileInputStream arquivoLeitura = new FileInputStream ("TesteProduto.txt");
                     ObjectInputStream objLeitura =  new ObjectInputStream(arquivoLeitura);
                     Dados.dados = (ArrayList<Produto>) objLeitura.readObject();
                     objLeitura.close();
                     arquivoLeitura.close();
                     }
 
                    catch(Exception e) {
                            System.out.println("ERROR! não foi possível abrir o arquivo! " + e.getMessage());
                    }
                    /**
                     * Deserialização dos objetos na classe relatorio
                     * Metódo try catch pra tratar error em caso arquivo não abrir
                     */
                    try {
                 
                     FileInputStream arquivoLeitura = new FileInputStream ("Relatorios.txt");
                     ObjectInputStream objLeitura =  new ObjectInputStream(arquivoLeitura);
                     Dados.relatorios = (ArrayList<Relatorio>) objLeitura.readObject();
                     objLeitura.close();
                     arquivoLeitura.close();
                     }
 
                    catch(Exception e) {
                            System.out.println("ERROR! não foi possível abrir o arquivo! " + e.getMessage());
                    }
                 /**
                  * Alteração de estoque do produto. 
                  * 
                  */
                    System.out.println("Insira o nome ou parte dele: ");
                    strAux = scanf.nextLine();
                    strAux = strAux.toUpperCase();
                    for(Produto prod : Dados.dados){
                        if(prod.getNome().contains(strAux)){
                            listAux.add(prod);
                        }
                    }
                    if(listAux.isEmpty()){
                        System.out.println("Produto não cadastrado");
                        System.out.println("Digite 1 para cadastrá-lo ou outra tecla para sair da opção e pressione ENTER:");
                        strAux = scanf.nextLine();
                        if(strAux.equals("1")){
                            Dados.dados.add(new Produto());
                        } else {
                            System.out.println("Retornando ao menu principal");
                            break;
                        }
                    } else {
                        System.out.println("Selecione o produto");
                        for(int cont = 0; cont < listAux.size(); cont++){
                            System.out.println("Item: " + cont + " Nome: " + listAux.get(cont).getNome() + ", ID: " + listAux.get(cont).ID);
                           
                        }
                        do{
                            System.out.println("Selecione qual item deseja alterar: ");
                            intAux = scanf.nextInt();
                        }while(intAux < 0 || intAux > listAux.size());
          
                        int quantidade;
                        do{
                            System.out.println("Insira a quantidade a inserir: ");
                            quantidade = scanf.nextInt();
                        }while(quantidade <= 0 );
                        listAux.get(intAux).reporQuantia(quantidade);
                        Relatorio relatorioNovo2 = new Entrada(listAux.get(intAux), "repor", 10, "Reposiçao");
                        relatorioNovo2.setQuantidade(quantidade);
                        Dados.relatorios.add(relatorioNovo2);
                        System.out.println("");
                        System.out.println("Relatório da operação efetuada:");
                        Dados.relatorios.get(Dados.relatorios.size()-1).gerarRelatorio(listAux.get(intAux));                                                
                    }
                    /**
                     * serialização dos objetos na classe produto 
                     * Metódo try catch pra tratar error em caso arquivo não abrir
                     */
                    try {
                        FileOutputStream arquivoGrav = new FileOutputStream("TesteProduto.txt"); 
                        ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
                        objGravar.writeObject(Dados.dados);
                        objGravar.flush(); 
                        objGravar.close();
                        arquivoGrav.flush();
                        arquivoGrav.close();
                    } 
                    catch(IOException e) {
                        System.out.println("ERROR! não foi possível abrir o arquivo! " + e.getMessage());
                    }
                    /**
                     * serialização dos objetos na classe relatorio 
                     * Metódo try catch pra tratar error em caso arquivo não abrir
                     */
                    try {
                        FileOutputStream arquivoGrav = new FileOutputStream("Relatorios.txt"); 
                        ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
                        objGravar.writeObject(Dados.relatorios);
                        objGravar.flush(); 
                        objGravar.close();
                        arquivoGrav.flush();
                        arquivoGrav.close();
                    } 
                    catch(IOException e) {
                        System.out.println("ERROR! não foi possível abrir o arquivo! " + e.getMessage());
                    }
                    
                    System.out.println("Retornando ao menu principal");
                    break;
                case 3:
                    /**
                     * Deserialização dos objetos na classe produto
                     * Metódo try catch pra tratar error em caso arquivo não abrir
                     */
                    try {
                 
                     FileInputStream arquivoLeitura = new FileInputStream ("TesteProduto.txt");
                     ObjectInputStream objLeitura =  new ObjectInputStream(arquivoLeitura);
                     Dados.dados = (ArrayList<Produto>) objLeitura.readObject();
                     objLeitura.close();
                     arquivoLeitura.close();
                     }
 
                    catch(Exception e) {
                            System.out.println("ERROR! não foi possível abrir o arquivo! " + e.getMessage());
                    }
                    /**
                     * Deserialização dos objetos na classe relatorio
                     * Metódo try catch pra tratar error em caso arquivo não abrir
                     */
                    try {
                 
                     FileInputStream arquivoLeitura = new FileInputStream ("Relatorios.txt");
                     ObjectInputStream objLeitura =  new ObjectInputStream(arquivoLeitura);
                     Dados.relatorios = (ArrayList<Relatorio>) objLeitura.readObject();
                     objLeitura.close();
                     arquivoLeitura.close();
                     }
 
                    catch(Exception e) {
                            System.out.println("ERROR! não foi possível abrir o arquivo! " + e.getMessage());
                    }
                    
                    System.out.println("Insira o nome ou parte dele: ");
                    strAux = scanf.nextLine();
                    strAux = strAux.toUpperCase();
                    for(Produto prod : Dados.dados){
                        if(prod.getNome().contains(strAux)){
                            listAux.add(prod);
                        }
                    }
                    if(listAux.isEmpty()){
                        System.out.println("Produto não cadastrado");
                        System.out.println("Digite 1 para cadastrá-lo ou outra tecla para sair da opção e pressione ENTER:");
                        strAux = scanf.nextLine();
                        if(strAux.equals("1")){
                            Dados.dados.add(new Produto());
                        } else {
                            System.out.println("Retornando ao menu principal");
                            break;
                        }
                    } else {
                        System.out.println("Selecione o produto");
                        for(int cont = 0; cont < listAux.size(); cont++){
                            System.out.println("Item: " + cont + " Nome: " + listAux.get(cont).getNome() + ", ID: " + listAux.get(cont).ID);
                            
                        }
                        do{
                            System.out.println("Selecione qual produto deseja alterar: ");
                            intAux = scanf.nextInt();
                        }while(intAux < 0 || intAux > listAux.size());
             
                        int quantidade;
                        do{
                            System.out.println("Insira a quantidade a retirar: ");
                            quantidade = scanf.nextInt();
                        }while( quantidade <= 0 || quantidade > listAux.get(intAux).getQuantidade());
                      
                        listAux.get(intAux).retirarQuantia(quantidade);
                   
                        Relatorio relatorioNovo3 = new Saida(listAux.get(intAux), "saida", 10, "Retirada");
                        relatorioNovo3.setQuantidade(quantidade);
                        Dados.relatorios.add(relatorioNovo3);
                        System.out.println("");
                        System.out.println("Relatório da operação efetuada:");
                        Dados.relatorios.get(Dados.relatorios.size()-1).gerarRelatorio(listAux.get(intAux));
                        System.out.println(""); 
                    }
                    /**
                     * serialização dos objetos na classe produto
                     * Metódo try catch pra tratar error em caso arquivo não abrir
                     */
                    try {
                        FileOutputStream arquivoGrav = new FileOutputStream("TesteProduto.txt"); 
                        ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
                        objGravar.writeObject(Dados.dados);
                        objGravar.flush(); 
                        objGravar.close();
                        arquivoGrav.flush();
                        arquivoGrav.close();
                        System.out.println("Cadastro realizado com sucesso!");
                    } 
                    catch(IOException e) {
                        System.out.println("ERROR! não foi possível abrir o arquivo! " + e.getMessage());
                    }
                    /**
                     * serialização dos objetos na classe relatorio
                     * Metódo try catch pra tratar error em caso arquivo não abrir
                     */
                    try {
                        FileOutputStream arquivoGrav = new FileOutputStream("Relatorios.txt"); 
                        ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
                        objGravar.writeObject(Dados.relatorios);
                        objGravar.flush(); 
                        objGravar.close();
                        arquivoGrav.flush();
                        arquivoGrav.close();
                    } 
                    catch(IOException e) {
                        System.out.println("ERROR! não foi possível abrir o arquivo! " + e.getMessage());
                    }
                    
                    System.out.println("Retornando ao menu principal");
                    break;
                case 4:
                    /**
                     * Deserialização dos objetos na classe relatorio
                     * Metódo try catch pra tratar error em caso arquivo não abrir
                     */
                    try {
                 
                     FileInputStream arquivoLeitura = new FileInputStream ("Relatorios.txt");
                     ObjectInputStream objLeitura =  new ObjectInputStream(arquivoLeitura);
                     Dados.relatorios = (ArrayList<Relatorio>) objLeitura.readObject();
                     objLeitura.close();
                     arquivoLeitura.close();
                     }
 
                    catch(Exception e) {
                            System.out.println("ERROR! não foi possível abrir o arquivo! " + e.getMessage());
                    }
                    
                    System.out.println(""); 
                    System.out.println("Gerando Relatórios...");
                    System.out.println("");
                    System.out.println("Relatórios de Entrada no estoque:");
                    for(int i = 0 ; i <= Dados.relatorios.size()-1; i++){
            
                        if(Dados.relatorios.get(i) instanceof Entrada){
 //                           Dados.relatorios.get(i).gerarRelatorio();
                        }
                    }
                    
                    System.out.println("");
                    System.out.println("Relatórios de Saída no estoque:");
                    for(int i = 0 ; i <= Dados.relatorios.size()-1; i++){
                        
                        if(Dados.relatorios.get(i) instanceof Saida){
  //                          Dados.relatorios.get(i).gerarRelatorio();
                        }
                    }

                    break;
                case 5:
                    /**
                     * Deserialização dos objetos na classe Fornecedor
                     * Metódo try catch pra tratar error em caso arquivo não abrir
                     */
                    try {
                 
                     FileInputStream arquivoLeitura = new FileInputStream ("TesteFornecedor.txt");
                     ObjectInputStream objLeitura =  new ObjectInputStream(arquivoLeitura);
                     Dados.Forn = (ArrayList<Fornecedor>) objLeitura.readObject();
                     objLeitura.close();
                     arquivoLeitura.close();
                    }
                    catch(Exception e) {
                            System.out.println("ERROR! não foi possível abrir o arquivo! " + e.getMessage());
                    }
                    
                    System.out.println("ADICIONAR FORNECEDOR");
                    Dados.Forn.add(new Fornecedor());
                    
                    /**
                     * serialização dos objetos na classe Fronecedores
                     * Metódo try catch pra tratar error em caso arquivo não abrir
                     */
                    try {
 
                        FileOutputStream arquivoGrav = new FileOutputStream("TesteFornecedor.txt");
                        ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
                        objGravar.writeObject(Dados.Forn);
                        objGravar.flush();
                        objGravar.close();
                        arquivoGrav.flush();
                        arquivoGrav.close();
 
                        System.out.println("Objeto gravado com sucesso!");
                    }
 
                    catch(Exception e) {
                        System.out.println("ERROR! não foi possível abrir o arquivo! " + e.getMessage());
                    }
 
                    break;
                    
                case 6:
                     /**
                     * Deserialização dos objetos na classe Produto
                     * Metódo try catch pra tratar error em caso arquivo não abrir
                     * Abrir informação sobre produto serializado
                     */
                    try {
             
                     FileInputStream arquivoLeitura = new FileInputStream ("TesteProduto.txt");
                     ObjectInputStream objLeitura =  new ObjectInputStream(arquivoLeitura);
                     Dados.dados = (ArrayList<Produto>) objLeitura.readObject();
                     objLeitura.close();
                     arquivoLeitura.close();
                        for(Produto prod : Dados.dados){
                            System.out.print("\n"+prod.getNome() + ", Cat: " + prod.getCategoria() + ", ID: " + prod.ID + ", lote: " + prod.lote);
                            System.out.print(", Preço: " + prod.getPreco() + ", Quant: " + prod.getQuantidade() + ", Quant min: " + prod.getQuantidadeMinima());
                            System.out.println(", Data de Validade: " + prod.getValidade());
                            System.out.println("");
                        }
                     }
 
                    catch(Exception e) {
                            System.out.println("ERROR! não foi possível abrir o arquivo! " + e.getMessage());
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
