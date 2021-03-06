package sistemaDeEstoque;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Classe usada para controlar os dados da interface com o usuário.
 * Ela possui os seguintes atributos:
 * @author LuluTeam 
 */
public class Dados implements Serializable {

    /**
     * IDdado é o atributo para controlar o ID dos produtos.
     */
    public static int IDdado = 1;

    /**
     * IDForn é o atributo para controlar o ID dos fornecedores.
     */
    public static int IDForn = 1;
    
    /**
     * IDRela é o atributo para controlar o ID do relatórios.
     */
    public static int IDRela = 1;

    /**
     * ArrayList dados é onde os dados dos produtos são armazenados.
     */
    public static ArrayList<Produto> dados = new ArrayList<Produto>();
    /**
     * ArrayList Forn é onde os dados dos fornecedores são armazenados.
     */
    public static ArrayList<Fornecedor> Forn = new ArrayList<Fornecedor>();
    
    /**
     * ArrayList relatorios é onde os dados dos relatorios são armazenados.
     */
    public static ArrayList<Relatorio> relatorios  = new ArrayList<Relatorio>();
    
    /**
     * O método busca pelo arquivo que contém os dados dos produtos salvos anteriormente 
     * e carrega para o programa, caso o arquivo não exista, ele exibe um aviso de erro no terminal.
     */
    public static void deserializarProdutos(){
        Dados.IDdado = 1;
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
        Dados.IDdado += Dados.dados.size();
    }

    /**
     * Esse método serializa os dados dos produtos em um arquivo e em caso de erro, ele emite no terminal o erro.
     */
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
    
    /**
     * O método busca pelo arquivo que contém os dados dos fornecedores salvos anteriormente 
     * e carrega para o programa, caso o arquivo não exista, ele exibe um aviso de erro no terminal.
     */
    public static void deserializarFornecedor(){
        Dados.IDForn = 1;
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
        Dados.IDForn += Dados.Forn.size();
    }
    
    /**
     * Esse método serializa os dados dos fornecedores em um arquivo e em caso de erro, ele emite no terminal o erro.
     */
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
    
    /**
     * O método busca pelo arquivo que contém os dados dos relatorios salvos anteriormente 
     * e carrega para o programa, caso o arquivo não exista, ele exibe um aviso de erro no terminal.
     */
    public static void deserializarRelatorio(){
        Dados.IDRela = 1;
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
        Dados.IDRela += Dados.relatorios.size();
    }
    
    /**
     * Esse método serializa os relatórios em um arquivo e em caso de erro, ele emite no terminal o erro.
     */
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
            System.out.println("ERROR! não foi possível serializar os relatórios! " + e.getMessage());
        }
    }
}
