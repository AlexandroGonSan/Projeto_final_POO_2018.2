/*
    *@author LuluTeam
*/
package sistemaDeEstoque;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe usada para controlar os dados da interface.
 *  * @author LuluTeam
 */
public class Dados {

    /**
     *IDdado atributo para controlar o ID do produto
     */
    public static int IDdado = 1;

    /**
     *IDForn atributo para controlar o ID do fornecedor
     */
    public static int IDForn = 1;

    /**
     *Array dados é onde os dados dos produtos são armazenados
     */
    public static ArrayList<Produto> dados = new ArrayList<Produto>();
    public static ArrayList<Produto> dadosSerealizados(){
        try {   
            FileInputStream arquivoLeitura = new FileInputStream ("TesteProduto.txt");
            ObjectInputStream objLeitura =  new ObjectInputStream(arquivoLeitura);
            dados = (ArrayList<Produto>) objLeitura.readObject();
            objLeitura.close();
            arquivoLeitura.close();
        }
        catch(Exception e) {
            System.out.println("ERROR! não foi possível abrir o arquivo! " + e.getMessage());
        }
        return dados;
    } 
    
     
    /**
     *Array Forn é onde os dados dos fornecedores são armazenados
     */
    public static ArrayList<Fornecedor> Forn = new ArrayList<Fornecedor>();
}
