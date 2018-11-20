/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telasCodigos;

import javax.swing.JOptionPane;
import sistemaDeEstoque.Dados;

/**
 * Classe que representa a tela inicial com as informações.
 * @author LuluTeam
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Esse construtor gera a janela e recupera os dados anteriormante serializados.
     */
    public TelaInicial() {
        initComponents();
        Dados.deserializarProdutos();
        Dados.deserializarFornecedor();
        Dados.deserializarRelatorio();
    }
    
    /**
     * Construtor que gera uma nova tela inicial.
     * @param a - Parâmetro usado para diferenciar este construtor do construtor padrão.
     */
    public TelaInicial(int a){
        initComponents();
    }

    /**
     * Método chamado internamente pelo construtor para inicializar a form.
     * Os conteúdos são sempre gerados automaticamente pelo editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCadNovoProd = new javax.swing.JButton();
        btListarProds = new javax.swing.JButton();
        btRelatorios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btCadastrarFornecedor = new javax.swing.JButton();
        btListarForn = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu1 = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        btCadNovoProd.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btCadNovoProd.setText("Cadastrar Novo Produto");
        btCadNovoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadNovoProdActionPerformed(evt);
            }
        });

        btListarProds.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btListarProds.setText("Listar Produtos");
        btListarProds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarProdsActionPerformed(evt);
            }
        });

        btRelatorios.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btRelatorios.setText("Registros de Movimentação");
        btRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatoriosActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jButton1.setText("i");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Storage");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("EX");

        btCadastrarFornecedor.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btCadastrarFornecedor.setText("Cadastrar Novo Fornecedor");
        btCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarFornecedorActionPerformed(evt);
            }
        });

        btListarForn.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btListarForn.setText("Listar Fornecedores");
        btListarForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarFornActionPerformed(evt);
            }
        });

        btExit.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btExit.setText("Sair do Sistema");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        Menu1.setText("Informações");

        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        Menu1.add(menuSobre);

        jMenuBar1.add(Menu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btListarProds, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadNovoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btListarForn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(332, 332, 332))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btCadNovoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCadastrarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btListarProds, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btListarForn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Botão que discarta a tela inicial e inicializa uma nova tela de Cadastrar Produto.
     * @param evt - Variável de evento.
     */
    private void btCadNovoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadNovoProdActionPerformed
        TelaInicial.this.setVisible(false);
        new CadastrarProduto().setVisible(true);
    }//GEN-LAST:event_btCadNovoProdActionPerformed

    
    /**
     * Botão que discarta a tela incial e inicializa uma nova tela de Sobre.
     * @param evt - Variável de evento.
     */
    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        new Sobre().setVisible(true);
    }//GEN-LAST:event_menuSobreActionPerformed

    /**
     * Botão que discarta a tela incial e inicializa uma nova tela de Listar Relatórios.
     * @param evt - Variável de evento.
     */
    private void btRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatoriosActionPerformed
        TelaInicial.this.dispose();
        new TelaListarRelat().setVisible(true);
    }//GEN-LAST:event_btRelatoriosActionPerformed

    
    /**
     * Botão que discarta a tela incial e inicializa uma nova tela de Listar Produtos.
     * @param evt - Variável de evento.
     */
    private void btListarProdsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarProdsActionPerformed
        TelaInicial.this.setVisible(false);
        new TelaListarProdutos().setVisible(true);
    }//GEN-LAST:event_btListarProdsActionPerformed

    /**
     * Botão que exibe as informações sobre os botões da tela inicial.
     * @param evt - Variável de evento.
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "Cadastrar Novo Produto - Cadastra um novo produto ainda não presente no estoque atual.\n\n" + 
                "Cadastrar Novo Fornecedor - Cadastra um novo fornecedor ainda não presente no sistema.\n\n" + 
                "Listar Produtos - Mostra uma lista com os produtos atualmente cadastrados e permite a alteração de suas informações.\n\n" +
                "Listar Fornecedor - Mostra uma lista com os fornecedores atualmente cadastrados e suas respectivas informações.\n\n" +
                "Registros de Movimentação - Mostra uma lista com as informações sobre as movimentações realizadas, seja entrada ou saída.\n\n");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Botão que discarta a tela incial e inicializa uma nova tela de Cadastrar Fornecedor.
     * @param evt - Variável de evento.
     */
    private void btCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarFornecedorActionPerformed
        TelaInicial.this.setVisible(false);
        new CadastrarFornecedor().setVisible(true);
    }//GEN-LAST:event_btCadastrarFornecedorActionPerformed

    /**
     * Botão que discarta a tela incial e inicializa uma nova tela de Listar Fornecdores.
     * @param evt - Variável de evento.
     */
    private void btListarFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarFornActionPerformed
        TelaInicial.this.setVisible(false);
        new TelaListarFornecedores().setVisible(true);
    }//GEN-LAST:event_btListarFornActionPerformed

    /**
     * Botão que serializa os dados do sistema e depois encerra o sistema.
     * @param evt - Variável de evento.
     */
    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        Dados.serializarFornecedor();
        Dados.serializarProduto();
        Dados.serializarRelatorio();
        System.exit(0);
    }//GEN-LAST:event_btExitActionPerformed

    /**
     * Evento que ocorre ao fechar a tela. O sistema irá serializar os dados alterados
     * durante sua execução, e então será encerrado.
     * @param evt - Variável de evento.
     */
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Dados.serializarFornecedor();
        Dados.serializarProduto();
        Dados.serializarRelatorio();
    }//GEN-LAST:event_formWindowClosed

    /**
     * Método principal da classe que executa e inicializa a tela.
     * @param args - Argumentos passados pela linha de comando.
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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu1;
    private javax.swing.JButton btCadNovoProd;
    private javax.swing.JButton btCadastrarFornecedor;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btListarForn;
    private javax.swing.JButton btListarProds;
    private javax.swing.JButton btRelatorios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuSobre;
    // End of variables declaration//GEN-END:variables
}
