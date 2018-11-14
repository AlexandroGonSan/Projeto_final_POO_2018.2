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
     
    /**
     *Array Forn é onde os dados dos fornecedores são armazenados
     */
    public static ArrayList<Fornecedor> Forn = new ArrayList<Fornecedor>();
}
