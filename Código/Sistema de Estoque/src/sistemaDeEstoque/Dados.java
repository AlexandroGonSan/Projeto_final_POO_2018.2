/*
    *@author LuluTeam
*/
package sistemaDeEstoque;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Classe usada para controlar os dados da interface.
 *  * @author LuluTeam
 */
public class Dados implements Serializable {

    /**
     *IDdado atributo para controlar o ID do produto
     */
    public static int IDdado = 1;

    /**
     *IDForn atributo para controlar o ID do fornecedor
     */
    public static int IDForn = 1;
    
    public static int IDRela = 1;

    /**
     *Array dados é onde os dados dos produtos são armazenados
     */
    public static ArrayList<Produto> dados = new ArrayList<Produto>();
    /**
     *Array Forn é onde os dados dos fornecedores são armazenados
     */
    public static ArrayList<Fornecedor> Forn = new ArrayList<Fornecedor>();
    
    //
    public static ArrayList<Relatorio> relatorios  = new ArrayList<Relatorio>();
    
    public static void deserializarProdutos(){
        try
        {
            FileInputStream arquivoLeitura = new FileInputStream ("TesteProduto.txt");
            ObjectInputStream objLeitura =  new ObjectInputStream(arquivoLeitura);
            Dados.dados = (ArrayList<Produto>) objLeitura.readObject();
            objLeitura.close();
            arquivoLeitura.close();
        }
        catch(Exception e) {
            System.out.println("ERROR! não foi possível abrir o arquivo! " + e.getMessage());
        }
    }
    public static void serializarProduto(){
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
    }
    
    public static void deserializarFornecedor(){
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
    }
    
    public static void serializarFornecedor(){
        try {
            FileOutputStream arquivoGrav = new FileOutputStream("TesteFornecedor.txt");
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
            objGravar.writeObject(Dados.Forn);
            objGravar.flush();
            objGravar.close();
            arquivoGrav.flush();
            arquivoGrav.close();
        } 
        catch(Exception e) {
            System.out.println("ERROR! não foi possível abrir o arquivo! " + e.getMessage());
        }
    }
    
    public static void deserializarRelatorio(){
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
    }
    
    public static void serializarRelatorio(){
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
    }
}
