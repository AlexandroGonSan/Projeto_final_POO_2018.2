/**Sistema onde conterá a função main do programa
 * @author LuluTeam
 */

package sistema.de.estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaDeEstoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Produto> produtos = new ArrayList<>();
        List<Fornecedor> fornecedores = new ArrayList<>();
        List<Relatorio> relatorios = new ArrayList<>();
        
        int opcao = 0;
        int intAux;
        String strAux;
        List<Produto> listAux = new ArrayList<>(); //lista auxiliar para ajudar na busca
        
        Scanner scanf = new Scanner(System.in);
        
        while(opcao != 10){
            System.out.println("O que deseja fazer ?\nDigite o número da opção desejada:");
            System.out.println("1 - Cadastrar novo Produtos ao estoque");
            System.out.println("2 - Repor estoque de produto"); //adicionar uma quantidade de um produto no estoque
            System.out.println("3 - Retirar do estoque produto"); //remover uma quantidade de um procuto no estoque
            //System.out.println("2 - Remover Produtos do estoque"); //acho que não precisamos dessa opção no momento
            System.out.println("4 - Gerar Relatório das alterações no estoque");
            //acho que precisamos no momento uma opção para mostrar só um relatório, depois adicionamos mais opções
            System.out.println("5 - Adicionar fornecedor ao sistema");
            System.out.println("6 - Exibir produtos");
            System.out.println("10 - Sair do programa");
            
            opcao = scanf.nextInt();
            scanf.nextLine();//isso corrige o erro de pular a próxima inserção
            
            switch (opcao){
                case 1:
                    produtos.add(new Produto());
                    break;
                case 2:
                    System.out.println("Insira o nome ou parte dele: ");
                    strAux = scanf.nextLine();
                    strAux = strAux.toUpperCase();
                    for(Produto prod : produtos){//busca pelo item na lista
                        if(prod.nome.contains(strAux)){//analisa se o nome contêm uma parte de strAux
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
                            System.out.println(cont + ": " + listAux.get(cont).ID + "," + listAux.get(cont).nome);
                            //exibe uma lista dos itens contendo esse nome mostrando a ID e o nome
                        }
                        do{
                            System.out.println("Selecione qual produto deseja alterar: ");
                            intAux = scanf.nextInt();
                        }while(intAux < 0 || intAux > listAux.size());
                        //espera receber o valor válido
                        int quantidade;
                        do{
                            System.out.println("Insira a quantidade a inserir: ");
                            quantidade = scanf.nextInt();
                        }while(quantidade <= 0);
                        //espera receber valor válido
                        listAux.get(intAux).reporQuantia(quantidade);
                        //TODO falta fazer a seleção do item e inserir a quantidade
                    }
                    System.out.println("Retornando ao menu principal");
                    break;
                case 3:
                    System.out.println("Insira o nome ou parte dele: ");
                    strAux = scanf.nextLine();
                    strAux = strAux.toUpperCase();
                    for(Produto prod : produtos){//busca pelo item na lista
                        if(prod.nome.contains(strAux)){//analisa se o nome contêm uma parte de strAux
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
                            System.out.println(cont + ": " + listAux.get(cont).ID + "," + listAux.get(cont).nome);
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
                        }while(quantidade <= 0);
                        //espera receber valor válido
                        listAux.get(intAux).retirarQuantia(quantidade);
                        //TODO falta fazer a seleção do item e inserir a quantidade
                    }
                    System.out.println("Retornando ao menu principal");
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    for(Produto prod : produtos){
                        System.out.print(prod.nome + ", Cat: " + prod.categoria + ", ID: " + prod.ID + ", lote: " + prod.lote);
                        System.out.print("Preço: " + prod.preco + "Quant: " + prod.quantidade + "Quant min: " + prod.quantidadeMinima);
                        System.out.println("" + prod.getValidade());
                    }
                    break;
                case 10:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Opção inválida, retornando ao memu principal");
            }  
        }      
    }
}
