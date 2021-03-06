/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telasCodigos;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import sistemaDeEstoque.Dados;
import sistemaDeEstoque.Entrada;
import sistemaDeEstoque.ModeloTabelaProduto;
import sistemaDeEstoque.Produto;
import sistemaDeEstoque.Saida;

/**
 * Classe que representa a tela de exibir os produtos listados e a de editar as informações.
 * @author Kook Ho
 */
public class TelaListarProdutos extends javax.swing.JFrame {

    /**
     * Cria uma nova tela de Listar Produtos.
     * 
     */
    public TelaListarProdutos() {
        initComponents();
        jSplitPane1.resetToPreferredSizes();
        jSplitPane1.setEnabled(false);
        checaEstoque();
    }
    
    /**
     * Método chamado internamente pelo construtor para incializar a tela.
     * Os conteúdos são sempre gerados pelo editor.
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btCadNew = new javax.swing.JButton();
        btVoltarLista = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btPopular = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btAtualizar = new javax.swing.JButton();
        btReporRetirar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btAlterarProd = new javax.swing.JButton();
        btRepor = new javax.swing.JButton();
        btRetirar = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        labelPreco = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbQntA = new javax.swing.JLabel();
        lbQntMin = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfNomeAlt = new javax.swing.JTextField();
        tfPrecoAlt = new javax.swing.JTextField();
        tfQntMAlt = new javax.swing.JTextField();
        lbVal = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbLote = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ckRepor = new javax.swing.JCheckBox();
        ckRetirar = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfRepor = new javax.swing.JTextField();
        tfRetirar = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();
        lbCat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jSplitPane1.setLastDividerLocation(420);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 410));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        btCadNew.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        btCadNew.setText("Cadastrar Novo Produto");
        btCadNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadNewActionPerformed(evt);
            }
        });

        btVoltarLista.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        btVoltarLista.setText("Voltar ao Menu Inicial");
        btVoltarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarListaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setText("Produtos Atualmente Cadastrados");

        btPopular.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btPopular.setText("Alterar");
        btPopular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPopularActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Bahnschrift", 1, 10)); // NOI18N
        jLabel16.setText("Selecione o produto e aperte o botão da operação desejada");

        btAtualizar.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        btAtualizar.setText("Atualizar planilha");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btReporRetirar.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btReporRetirar.setText("Repor/Retirar");
        btReporRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReporRetirarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 10)); // NOI18N
        jLabel6.setText("Não encontrou o produto?");

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 10)); // NOI18N
        jLabel9.setText("O produto não foi alterado!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btVoltarLista)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btAtualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btCadNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btPopular, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btReporRetirar)
                                .addGap(25, 25, 25)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btReporRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPopular, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadNew)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtualizar)
                    .addComponent(jLabel9))
                .addGap(29, 29, 29)
                .addComponent(btVoltarLista)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 410));

        btAlterarProd.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        btAlterarProd.setText("Alterar Produto");
        btAlterarProd.setEnabled(false);
        btAlterarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarProdActionPerformed(evt);
            }
        });

        btRepor.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        btRepor.setText("Repor estoque");
        btRepor.setEnabled(false);
        btRepor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReporActionPerformed(evt);
            }
        });

        btRetirar.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        btRetirar.setText("Retirar do estoque");
        btRetirar.setEnabled(false);
        btRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetirarActionPerformed(evt);
            }
        });

        lbNome.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lbNome.setText("Nome:");

        labelPreco.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        labelPreco.setText("Preço:");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel4.setText("Validade:");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel5.setText("Qnt Atual:");

        lbQntA.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lbQntA.setText("-Qnt Atual-");

        lbQntMin.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lbQntMin.setText("Qnt Mínima:");

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel8.setText("ID:");

        tfNomeAlt.setEnabled(false);

        tfPrecoAlt.setEnabled(false);

        tfQntMAlt.setEnabled(false);

        lbVal.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lbVal.setText("-Validade-");

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel10.setText("Categoria:");

        lbLote.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lbLote.setText("-Lote-");

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel12.setText("Lote:");

        ckRepor.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        ckRepor.setText("Repor estoque");
        ckRepor.setEnabled(false);
        ckRepor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckReporActionPerformed(evt);
            }
        });

        ckRetirar.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        ckRetirar.setText("Retirar do estoque");
        ckRetirar.setEnabled(false);
        ckRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckRetirarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel13.setText("Qnt:");

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel14.setText("Qnt:");

        tfRepor.setEnabled(false);

        tfRetirar.setEnabled(false);

        lbID.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lbID.setText("-ID-");

        lbCat.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        lbCat.setText("-Categoria-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNomeAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbID))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btRepor)
                            .addComponent(ckRepor)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfRepor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ckRetirar)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btRetirar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelPreco)
                            .addComponent(jLabel5)
                            .addComponent(lbQntMin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tfPrecoAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbQntA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tfQntMAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbVal)
                            .addComponent(lbCat)
                            .addComponent(lbLote))))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(btAlterarProd)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNomeAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(lbID))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbQntA)
                    .addComponent(jLabel4)
                    .addComponent(lbVal))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPreco)
                    .addComponent(jLabel12)
                    .addComponent(lbLote)
                    .addComponent(tfPrecoAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQntMin)
                    .addComponent(tfQntMAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(lbCat))
                .addGap(18, 18, 18)
                .addComponent(btAlterarProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckRepor)
                    .addComponent(ckRetirar))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(tfRepor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRepor)
                    .addComponent(btRetirar))
                .addGap(46, 46, 46))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private Produto selecionado = new Produto(0);
    
    private void checaEstoque(){
       ArrayList<Produto> temp = new ArrayList<Produto>();
        for(Produto prod : Dados.dados){
            if(prod.getQuantidade() < prod.getQuantidadeMinima()){
                temp.add(prod);
            }
        }
       if(temp.size() > 0){
        String concat = "Produtos abaixo da quantidade mínima:\n";
        for(Produto prod : temp){
            concat = concat.concat(prod.getNome() + "\n");
        }
        
        JOptionPane.showMessageDialog(null, concat);
       }
    }
    
    /**
     * Método que reseta os campos para seu estado padrão.
     * 
     */
    private void resetaCampos(){
        this.tfNomeAlt.setText("");
        this.tfPrecoAlt.setText("");
        this.tfQntMAlt.setText("");
        this.lbID.setText("-ID-");
        this.lbCat.setText("-Categoria-");
        this.lbQntA.setText("-Qnt Atual-");
        this.lbLote.setText("-Lote-");
        this.lbVal.setText("-Validade-");
        
        this.tfNomeAlt.setEnabled(false);
        this.tfPrecoAlt.setEnabled(false);
        this.tfQntMAlt.setEnabled(false);
        
    }
    
    /**
     * Método que checa se os campos estão corretamente preenchidos.
     * @return Boolean - true caso estejam todos corretos, false caso contrário.
     */
    private Boolean checaCamposAlterar(){
        lbQntMin.setForeground(Color.black);
        labelPreco.setForeground(Color.black);
        lbNome.setForeground(Color.black);
        
        if(tfNomeAlt.getText().equals("") || tfPrecoAlt.getText().equals("") || tfQntMAlt.getText().equals("")){
            if(tfNomeAlt.getText().equals("")){
                lbNome.setForeground(Color.red);
            }else{
                lbNome.setForeground(Color.black);
            }
            
            if(tfPrecoAlt.getText().equals("")){
                labelPreco.setForeground(Color.red);
            }else{
                labelPreco.setForeground(Color.black);
            }
            
            if(tfQntMAlt.getText().equals("")){
                lbQntMin.setForeground(Color.red);
            }else{
                lbQntMin.setForeground(Color.black);
            }
            JOptionPane.showMessageDialog(null, "Existem campos vazios!");

            return false;
        }else{

            
            try{
                double testP = Double.parseDouble(tfPrecoAlt.getText());
            }catch(NumberFormatException e){
                labelPreco.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, "Preço inválido!");
                return false;
            }
            
            try{
                int testQ = Integer.parseInt(tfQntMAlt.getText());
            }catch(NumberFormatException e){
                lbQntMin.setForeground(Color.red);
                JOptionPane.showMessageDialog(null, "Quantidade inválida!");
                return false;
            }
            
            return true;
        }
    }
          
    /**
     * Botão que discarta a tela de listar produtos e inicializa uma nova tela de Cadastrar Produto.
     * @param evt - Variável de evento.
     */
    private void btCadNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadNewActionPerformed
        Dados.serializarProduto();
        Dados.serializarRelatorio();
        Dados.serializarFornecedor();
        TelaListarProdutos.this.setVisible(false);
        new CadastrarProduto().setVisible(true);
    }//GEN-LAST:event_btCadNewActionPerformed

    /**
     * Botão de voltar ao menu inicial.
     * Descarta a tela de Listar produtos e inicializa uma nova Tela Inicial.
     * @param evt - Variável de evento.
     */
    private void btVoltarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarListaActionPerformed
        Dados.serializarProduto();
        Dados.serializarRelatorio();
        Dados.serializarFornecedor();
        TelaListarProdutos.this.dispose();  
    }//GEN-LAST:event_btVoltarListaActionPerformed

    /**
     * Botão que altera os dados do produto selecionado.
     * Primeiramente faz a checagem dos campos. Caso todos sejam válidos, eles serão alterados
     * no produto selecionado. Caso haja algum inválido, será exibida uma mensagem de erro.
     * @param evt - Variável de evento.
     */
    private void btAlterarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarProdActionPerformed
        if(checaCamposAlterar()){
            selecionado.setNome((String)tfNomeAlt.getText());
            selecionado.setPreco(Double.parseDouble(tfPrecoAlt.getText()));
            selecionado.setQuantidadeMinima(Integer.parseInt(tfQntMAlt.getText()));
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!");
            resetaCampos();        
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível alterar o produto!");
        }
    }//GEN-LAST:event_btAlterarProdActionPerformed

    /**
     * Evento que ocorre quanto a janela é aberta.
     * Define o modelo da tabela da maneira como está definida na classe ModeloTabelaProduto.
     * @param evt - Variável de evento.
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTable1.setModel(new ModeloTabelaProduto(Dados.dados));
    }//GEN-LAST:event_formWindowOpened

    /**
     * Evento usado para quando o usuário clicasse duas vezes na tabela.
     * Exibe as informações do produto.
     * @param evt - Variável de evento.
     */
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() >= 2){
            JOptionPane.showMessageDialog(null, jTable1.getModel().getValueAt(jTable1.getSelectedRow(), -1));
        }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * Botão de Repor quantia ao estoque.
     * Primeiramente cehca se a caixa de seleção de Repor Estoque está habilitada, depois 
     * checa se a quantia a ser Reposta é válida.
     * Caso ambos as checagens derem positivas,a quantia será reposta ao estoque, será gerado
     * uma movimentação de entrada e será exibida uma mensagem de adição com sucesso.
     * Caso alguma das checagens dê negativo, será exibida uma mensagem com o respectivo erro.
     * @param  evt - Variável de evento.
     */
    private void btReporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReporActionPerformed
        if(ckRepor.isSelected() == true){
            if(tfRepor.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Valor inválido!");
            }else{
                try{
                    int testRepor = Integer.parseInt(tfRepor.getText());
                    selecionado.reporQuantia(Integer.parseInt(tfRepor.getText()));
                    Dados.relatorios.add(
                                new Entrada(
                                        selecionado,
                                        "Entrada",
                                        Integer.parseInt(tfRepor.getText()),
                                        "Adição ao estoque."
                                )
                    );
                    JOptionPane.showMessageDialog(null, "Quantia reposta com sucesso!");
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Valor inválido!");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione [Repor estoque] para realizar a operação.");
        }
        
        resetaCampos();
    }//GEN-LAST:event_btReporActionPerformed

    /**
     * Botão utilizado para preencher os campos a serem alterados.
     * Pega o produto selecionado pelo usuário, habilita todos os campos de alteração do produto,
     * desabilita as opçoes de repor/retirar e preenche os campos alteráveis com os dados do produto selecionado.
     * Caso nenhum produto seja selecionado, será exibida uma mensagem de erro.
     * @param evt 
     */
    private void btPopularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPopularActionPerformed
      try{ 
        int linha = jTable1.getSelectedRow();
        int select = (Integer)jTable1.getModel().getValueAt(linha, 0);
        
        for(Produto prod : Dados.dados){
            if(prod.getID() == select){
                selecionado = prod;
            }
        }
        
        this.tfNomeAlt.setEnabled(true);
        this.tfPrecoAlt.setEnabled(true);
        this.tfQntMAlt.setEnabled(true);
        this.btAlterarProd.setEnabled(true);
        this.ckRepor.setEnabled(false);
        this.ckRetirar.setEnabled(false);
        this.btRepor.setEnabled(false);
        this.btRetirar.setEnabled(false);
        
        this.tfNomeAlt.setText(selecionado.getNome());
        this.tfQntMAlt.setText(Integer.toString(selecionado.getQuantidadeMinima()));
        this.tfPrecoAlt.setText(Double.toString(selecionado.getPreco()));
        
        this.lbID.setText(Integer.toString(selecionado.getID()));
        this.lbLote.setText(selecionado.getLote());
        this.lbVal.setText(selecionado.getValidade());
        this.lbQntA.setText(Integer.toString(selecionado.getQuantidade()));
        this.lbCat.setText(selecionado.getCategoria());
      }catch(ArrayIndexOutOfBoundsException e){
          JOptionPane.showMessageDialog(null, "Nenhum produto selecionado!");
      }      
    }//GEN-LAST:event_btPopularActionPerformed

    /**
     * Botão de Retirar quantia do estoque.
     * Primeiramente cehca se a caixa de seleção de retirar do estoque está habilitada, depois 
     * checa se a quantia a ser retirada é válida.
     * Caso ambos as checagens derem positivas,a quantia será retirada do estoque, será gerado
     * uma movimentação de saída e será exibida uma mensagem de retirada com sucesso.
     * Caso alguma das checagens dê negativo, será exibida uma mensagem com o respectivo erro.
     * @param evt - Variável de evento.
     */
    private void btRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetirarActionPerformed
       if(ckRetirar.isSelected() == true){
            if(tfRetirar.getText().equals("")){
                JOptionPane.showMessageDialog(null, "valor inválido!");
            }else{
                try{
                    int testRepor = Integer.parseInt(tfRetirar.getText());
                    selecionado.retirarQuantia(Integer.parseInt(tfRetirar.getText()));
                        Dados.relatorios.add(
                            new Saida(
                                selecionado,
                                "Saída",
                                Integer.parseInt(tfRetirar.getText()),
                                "Retirado do estoque."
                            )
                        );
                        JOptionPane.showMessageDialog(null, "Quantia retirada com sucesso!");
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Valor inválido!");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione [Retirar do estoque] para realizar a operação.");
        }
        
        resetaCampos();
    }//GEN-LAST:event_btRetirarActionPerformed

    /**
     * Botão para atualizar a lista dos produtos.
     * Descarta a tela de Listar Produtos atual e inicializa outra.
     * @param evt - Variável de evento.
     */
    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        Dados.serializarProduto();
        Dados.serializarRelatorio();
        Dados.serializarFornecedor();
        TelaListarProdutos.this.setVisible(false);
        new TelaListarProdutos().setVisible(true);
    }//GEN-LAST:event_btAtualizarActionPerformed

    /**
     * Evento relativo ao marque/desmarque da caixa de seleção da opção de Repor Estoque.
     * Caso seja marcada, a caixa de seleção de Retirar do Estoque será desmarcada, o campo de texto
     * de Retirar Estoque será desabilitada, e o campo de texto da opção Repor Estoque será habilitada.
     * Caso seja desmarcada, o campo de texto da opção Repor Estoque será desabilitada.
     * @param evt - Variável de evento.
     */
    private void ckReporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckReporActionPerformed
        if(ckRepor.isSelected()){
            tfRepor.setEnabled(true);
            tfRetirar.setEnabled(false);
            ckRetirar.setSelected(false);
        }else{
            tfRepor.setEnabled(false);
        }
    }//GEN-LAST:event_ckReporActionPerformed

    /**
     * Evento relativo ao marque/desmarque da caixa de seleção da opção de Retirar do Estoque.
     * Caso seja marcada, a caixa de seleção de Repor Estoque será desmarcada, o campo de texto
     * de Repor Estoque será desabilitada, e o campo de texto da opção Retirar do Estoque será habilitada.
     * Caso seja desmarcada, o campo de texto da opção Retirar do Estoque será desabilitada.
     * @param evt - Variável de evento.
     */
    private void ckRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckRetirarActionPerformed
        if(ckRetirar.isSelected()){
            tfRetirar.setEnabled(true);
            tfRepor.setEnabled(false);
            ckRepor.setSelected(false);
        }else{
            tfRetirar.setEnabled(false);
        }
    }//GEN-LAST:event_ckRetirarActionPerformed

    /**
     * Botão que pega o produto selecionado pelo usuário e disponibiliza as opções 
     * de repor e retirar quantias desse produto.
     * @param evt - Variável de evento.
     */
    private void btReporRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReporRetirarActionPerformed

       try{ 
        int linha = jTable1.getSelectedRow();
        int select = (Integer)jTable1.getModel().getValueAt(linha, 0);
        
        for(Produto prod : Dados.dados){
            if(prod.getID() == select){
                selecionado = prod;
            }
        }
        this.ckRepor.setEnabled(true);
        this.ckRetirar.setEnabled(true);
        this.btRepor.setEnabled(true);
        this.btRetirar.setEnabled(true);
        
        this.tfNomeAlt.setEnabled(false);
        this.tfQntMAlt.setEnabled(false);
        this.tfPrecoAlt.setEnabled(false);
        this.btAlterarProd.setEnabled(false);
        
       }catch(ArrayIndexOutOfBoundsException e){
          JOptionPane.showMessageDialog(null, "Nenhum produto selecionado!");
      } 
    }//GEN-LAST:event_btReporRetirarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        new TelaInicial(0).setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    /**
     * Método principal da classe que executa e inicializa a tela.
     * @param args - Argumentos da linha de comando.
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListarProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarProd;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCadNew;
    private javax.swing.JButton btPopular;
    private javax.swing.JButton btRepor;
    private javax.swing.JButton btReporRetirar;
    private javax.swing.JButton btRetirar;
    private javax.swing.JButton btVoltarLista;
    private javax.swing.JCheckBox ckRepor;
    private javax.swing.JCheckBox ckRetirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel lbCat;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbLote;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbQntA;
    private javax.swing.JLabel lbQntMin;
    private javax.swing.JLabel lbVal;
    private javax.swing.JTextField tfNomeAlt;
    private javax.swing.JTextField tfPrecoAlt;
    private javax.swing.JTextField tfQntMAlt;
    private javax.swing.JTextField tfRepor;
    private javax.swing.JTextField tfRetirar;
    // End of variables declaration//GEN-END:variables
}
