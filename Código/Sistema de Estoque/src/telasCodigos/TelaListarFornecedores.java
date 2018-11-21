/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telasCodigos;

import javax.swing.JOptionPane;
import sistemaDeEstoque.Dados;
import sistemaDeEstoque.Fornecedor;
import sistemaDeEstoque.ModeloTabelaFornecedor;

/**
 * Classe que representa a tela de Listar os Fornecedores.
 * @author Kook Ho
 */
public class TelaListarFornecedores extends javax.swing.JFrame {

    /**
     * Cria uma nova tela de Listar Fornecedores.
     */
    public TelaListarFornecedores() {
        initComponents();
    }

    /**
     * Método chamado internamente pelo construtor para incializar a tela.
     * Os conteúdos são sempre gerados pelo editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btNewForn = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setText("Fornecedores Cadastrados");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel2.setText("Clique duas vezes para exibir informações.");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 10)); // NOI18N
        jLabel3.setText("Não encontrou o fornecedor?");

        btNewForn.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btNewForn.setText("Cadastrar Fornecedor");
        btNewForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewFornActionPerformed(evt);
            }
        });

        btVoltar.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btVoltar.setText("Voltar ao Menu");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btNewForn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btVoltar)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNewForn)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(btVoltar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private Fornecedor forn = new Fornecedor(0);
    
    /**
     * Botão que discarta a tela de listar fornecedores e incializa uma nova tela de Cadastrar Fornecedor.
     * @param evt - Variável de evento.
     */
    private void btNewFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewFornActionPerformed
        TelaListarFornecedores.this.dispose();
        new CadastrarFornecedor().setVisible(true);
    }//GEN-LAST:event_btNewFornActionPerformed

    /**
     * Botão que discarta a tela de listar fornecedores e incializa uma nova Tela Inicial.
     * @param evt - Variável de evento.
     */
    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        Dados.serializarProduto();
        Dados.serializarRelatorio();
        Dados.serializarFornecedor();
        TelaListarFornecedores.this.dispose();
        new TelaInicial().setVisible(true);
    }//GEN-LAST:event_btVoltarActionPerformed

    /**
     * @deprecated Método utilizado anteriormente para executar uma ação quando o usuário
     * clicasse duas vezes em um item da tabela.
     * @param evt - Variável de evento.
     */
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * Evento que ocorre quando a janela é aberta.
     * Define o modelo da tabela como definido na classe ModeloTabelaFornecedor.
     * @param evt - Variável de evento.
     */
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTable1.setModel(new ModeloTabelaFornecedor(Dados.Forn));
    }//GEN-LAST:event_formWindowOpened

    /**
     * @deprecated Evento anteriormente usado para quando a janela fosse fechada.
     * Substuido pelo evento formWindowClosing(java.awt.event.WindowEvent evt).
     * @param evt - Variável de evento.
     */
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    /**
     * Evento que ocorre quando o usuário tenta fechar a janela.
     * Exibe uma janela de aviso que pede confirmação para fechar a tela.
     * Caso seja confirmada, o sistema é encerrado e perde todas as alterações.
     * Caso não seja confirmada, a janela não é fechada e o sistema continua funcionando.
     * @param evt - Variável de evento.
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int a = JOptionPane.showConfirmDialog(null, "Se fechar agora perderá todas as alterações. Deseja continuar?", "Aviso!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(a == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing
    
    
    
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
            java.util.logging.Logger.getLogger(TelaListarFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListarFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListarFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListarFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListarFornecedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNewForn;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
