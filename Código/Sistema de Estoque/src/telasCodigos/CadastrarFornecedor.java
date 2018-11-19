/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telasCodigos;

import java.awt.Color;
import javax.swing.JOptionPane;
import sistemaDeEstoque.Dados;
import sistemaDeEstoque.Fornecedor;

/**
 * Classe que representa a tela de cadastrar fornecedor.
 * Ela possui os seguintes atributos:
 *      - btCadFornecedor (JButton): representa o botão 'Cadastrar';
 *      - btCancelar (JButton):  representa o botão 'Cancelar';
 *      - btLimpar (JButton):  representa o botão 'Limpar';
 *      - jLabelTitulo (Jlabel): título 'Cadastrar Novo Fornecedor';
 *      - jlCNPJ (JLabel): título 'CNPJ';
 *      - jlProdForn (JLabel): título 'Produto Fornecido';
 *      - jlRazaoSocial (JLabel): título 'Razão Social';
 *      - tfCNPJ (JTextField): campo de preenchimento do CNPJ;
 *      - tfProdForn (JTextField): campo de preenchimento do Produto Fornecido;
 *      - tfRazaoSoc (JTextField): campo de preenchimento da razão social;
 * @author Kook Ho
 */
public class CadastrarFornecedor extends javax.swing.JFrame {

    private String temp;
    
    /**
     * Esse construtor cria e inicia a tela de cadastrar o fornecedor.
     */
    public CadastrarFornecedor() {
        initComponents();
    }
    
    /**
     * Esse método valida o CNPJ presente no campo de cadastrar CNPJ. 
     * @return boolean - retorna true caso seja valido ou false caso não seja.
     */
    private boolean checaCNPJ(){
        jlCNPJ.setForeground(Color.black);
        temp = tfCNPJ.getText();
        try{
            int preco = Integer.parseInt(temp.substring(0, 7));
            preco = Integer.parseInt(temp.substring(7));
            if(this.temp.length() != 14){
                jlCNPJ.setForeground(Color.red);
                return false;
            }
            
            return true;
        }catch(NumberFormatException e){
            jlCNPJ.setForeground(Color.red);
            
            return false;
        }catch(IndexOutOfBoundsException e){
            jlCNPJ.setForeground(Color.red);
            
            return false;
        }
    }
    /**
     * Esse método retorna true caso nenhum dos campos de preencher texto esteja vazio. 
     * Caso algum deles estejam vazios, a cor do campo fica vermelho e o método retorna false.
     * @return 
     */
    private boolean checaCamposVazios(){
        if(this.tfRazaoSoc.getText().equals("") || this.tfCNPJ.getText().equals("") || this.tfProdForn.getText().equals("")){
           if(this.tfRazaoSoc.getText().equals("")){
               jlRazaoSocial.setForeground(Color.red);
           }else{
               jlRazaoSocial.setForeground(Color.black);
           }
           if(this.tfProdForn.getText().equals("")){
               jlProdForn.setForeground(Color.red);
           }else{
               jlProdForn.setForeground(Color.black);
           }
           if(this.tfCNPJ.getText().equals("")){
               jlCNPJ.setForeground(Color.red);
           }else{
               jlCNPJ.setForeground(Color.black);
           }
            return false; 
        }
        else{
            jlCNPJ.setForeground(Color.black);
            jlProdForn.setForeground(Color.black);
            jlRazaoSocial.setForeground(Color.black);
            
            return true;
        }
    }
    /**
     * Esse método esvazia os campos de preencher texto.
     */
    private void limpaCampos(){
        this.tfRazaoSoc.setText("");
        this.tfProdForn.setText("");
        this.tfCNPJ.setText("");
    }
    /**
     * Esse método é chamado pelo construtor para inicializar a janela e preencher com os campos necessários.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        btCadFornecedor = new javax.swing.JButton();
        jlRazaoSocial = new javax.swing.JLabel();
        jlCNPJ = new javax.swing.JLabel();
        jlProdForn = new javax.swing.JLabel();
        tfRazaoSoc = new javax.swing.JTextField();
        tfCNPJ = new javax.swing.JTextField();
        tfProdForn = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabelTitulo.setText("Cadastrar Novo Fornecedor");

        btCadFornecedor.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btCadFornecedor.setText("Cadastrar");
        btCadFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadFornecedorActionPerformed(evt);
            }
        });

        jlRazaoSocial.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jlRazaoSocial.setText("Razão Social:");

        jlCNPJ.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jlCNPJ.setText("CNPJ:");

        jlProdForn.setFont(new java.awt.Font("Bahnschrift", 1, 11)); // NOI18N
        jlProdForn.setText("Produto fornecido:");

        btLimpar.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        btCancelar.setText("Voltar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jlRazaoSocial))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlProdForn)
                                    .addComponent(jlCNPJ))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfRazaoSoc, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(tfProdForn)
                            .addComponent(tfCNPJ)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btCadFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelTitulo)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRazaoSocial)
                    .addComponent(tfRazaoSoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCNPJ)
                    .addComponent(tfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlProdForn)
                    .addComponent(tfProdForn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadFornecedor)
                    .addComponent(btLimpar)
                    .addComponent(btCancelar))
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Esse método é executado quando o botão de 'Cadastrar' é apertado. Ele salva os dados em uma instância Fonecedor.
     * @param evt ActionEvent - variável do evento.
     */
    private void btCadFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadFornecedorActionPerformed
        if(checaCamposVazios()){
            if(checaCNPJ()){
                Dados.Forn.add(
                new Fornecedor(
                        tfRazaoSoc.getText(),
                        tfProdForn.getText(),
                        tfCNPJ.getText()  
                 ));
                Dados.serializarFornecedor();
                JOptionPane.showMessageDialog(null, "Fornecedor Cadastrado com Sucesso!");
                System.out.println(Dados.Forn);
                limpaCampos();
            }else{
                JOptionPane.showMessageDialog(null, "CNPJ está incorreto!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Campo Vazio!");
        }
    }//GEN-LAST:event_btCadFornecedorActionPerformed
    /**
     * Esse método é executado quando o botão de 'Limpar' é apertado. Ele esvazia os campos de preencher texto.
     * @param evt ActionEvent - variável do evento.
     */
    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_btLimparActionPerformed

    /**
     * Esse método cancela o cadastro e volta para o menu principal.
     * @param evt ActionEvent - variável do evento.
     */
    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        CadastrarFornecedor.this.dispose();
        new TelaInicial().setVisible(true);
    }//GEN-LAST:event_btCancelarActionPerformed

    /**
     * @deprecated Esse método foi trocado por formWindowClosing(java.awt.event.WindowEvent evt).
     * Ela é ativada quando é fechado a janela.
     * @param evt ActionEvent - variável do evento.
     */
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed
    /**
     * Ela é ativada quando se tenta fechar a janela, 
     * quando é ativado ele pergunta se realmente deseja fechar a janela e caso pressione o botão sim, ele fecha a janela, caso não, a janela é mantida.
     * @param evt ActionEvent - variável do evento.
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int a = JOptionPane.showConfirmDialog(null, "Se fechar agora perderá todas as alterações. Deseja continuar?", "Aviso!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if(a == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * Esse método cria e mostra a janela na tela.
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(CadastrarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadFornecedor;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jlCNPJ;
    private javax.swing.JLabel jlProdForn;
    private javax.swing.JLabel jlRazaoSocial;
    private javax.swing.JTextField tfCNPJ;
    private javax.swing.JTextField tfProdForn;
    private javax.swing.JTextField tfRazaoSoc;
    // End of variables declaration//GEN-END:variables
}
