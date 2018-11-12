/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaDeEstoque;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Administrador
 */
public class ModeloTabelaProduto extends AbstractTableModel {

    private ArrayList linhas = null;
    private String[] colunas = {"ID", "Nome", "Quantidade"};

    public ModeloTabelaProduto(ArrayList dados) {
        setLinhas(dados);
    }

    public String[] getColunas() {
        return colunas;
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setColunas(String[] strings) {
        colunas = strings;
    }

    public void setLinhas(ArrayList list) {
        linhas = list;
    }

    //Retorna o numero de colunas no modelo
    //@see javax.swing.table.TableModel#getColumnCount()
    public int getColumnCount() {
        return getColunas().length;
    }

    //Retorna o numero de linhas existentes no modelo
    //@see javax.swing.table.TableModel#getRowCount()
    public int getRowCount() {
        return getLinhas().size();
    }

    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    //Obtem o valor na linha e coluna
    //@see javax.swing.table.TableModel#getValueAt(int, int)

    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto prod = Dados.dados.get(rowIndex);
        //Produto prod = (Produto) linhas.get(rowIndex);
        /*Player p = new Player();
        p.setSourceLocation(musica.getCaminho());*/
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
