/*
    *@author LuluTeam
 */
package sistemaDeEstoque;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 * Classe para controlar as tabelas da interface relacionado a produtos.
 * - linhas (ArrayList): guarda a lista dos produtos;
 * - colunas (String[]): array com o nome das colunas que há na tabela.
 * @author LuluTeam
 */
public class ModeloTabelaProduto extends AbstractTableModel {

    private ArrayList linhas = null;
    private String[] colunas = {"ID", "Nome", "Quantidade"};

    /**
     * O método é usado para definir as informações da tabela na interface.
     * @param dados - é os dados com as informações necessárias sobre o produto(ID, Nome, Quantidade).
     */
    public ModeloTabelaProduto(ArrayList dados) {
        setLinhas(dados);
    }

    /**
     * O método é usado para retornar os dados para as colunas na interface.
     * @return retorna as informações para preencher as colunas.
     */
    public String[] getColunas() {
        return colunas;
    }

    /**
     * O método é usado para retornar os dados para as linhas na interface.
     * @return retorna as informações para preencher as linhas.
     */
    public ArrayList getLinhas() {
        return linhas;
    }

    /**
     * O método configura as colunas da lista dos produtos.
     * @param strings - valor recebido para colocar nas colunas.
     */
    public void setColunas(String[] strings) {
        colunas = strings;
    }

    /**
     * O método configura as linhas da lista dos produtos.
     * @param list - valor recebido para colocar nas linhas.
     */
    private void setLinhas(ArrayList list) {
        linhas = list;
    }

     /**
     * O método retorna o número de colunas no modelo.
     * @return o número de colunas no modelo para a interface.
     * @see javax.swing.table.TableModel#getColumnCount()
     */
   
    @Override
    public int getColumnCount() {
        return getColunas().length;
    }
    
    /**
     * O método retorna o número de linhas existentes no modelo.
     * @return o número de linhas no modelo para a interface.
     * @see javax.swing.table.TableModel#getRowCount()
     */
    
    @Override
    public int getRowCount() {
        return getLinhas().size();
    }
    /**
     * Esse método retorna o nome da coluna.
     * @param columnIndex int - índice da coluna.
     * @return String - nome da coluna.
     */
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    /**
     * O método obtem o valor na linha e coluna.
     * @param rowIndex - linha onde está o produto;
     * @param columnIndex -  coluna onde está o produto;
     * @return o produto já que não foi selecionado nada na interface.
     * //@see javax.swing.table.TableModel#getValueAt(int, int).
    */
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto prod = Dados.dados.get(rowIndex);
        
        if (columnIndex != -1) {
            switch (columnIndex) {
                case 0:
                    return prod.getID();
                case 1:
                    return prod.getNome();
                case 2:
                    return prod.getQuantidade();
            }
        } else {
            return prod;
        }
        return null;
    }
}
