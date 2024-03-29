/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piu;

import classes.Informacoes;
import classes.Pedido;
import javax.swing.ImageIcon;

/**
 *
 * @author Dalay
 */
public class FazerPedido extends javax.swing.JFrame {

    /**
     * Creates new form FazerPedido
     */
    public FazerPedido() {
        initComponents();
        text_Preco.setEditable(false);
        text_Preco.setText(preco*mult+"");
        prato.setText(Informacoes.prato.nome);
        descricao.setText(Informacoes.prato.descricao);
        descricao.setEditable(false);
    }
        float preco = Float.parseFloat(Informacoes.prato.valor);
        float precoi = Float.parseFloat(Informacoes.prato.valor);
        int mult = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_FazerLogin = new javax.swing.JButton();
        button_Inicio = new javax.swing.JButton();
        button_Cardapio = new javax.swing.JButton();
        label_FazerPedidos = new javax.swing.JLabel();
        button_Contato = new javax.swing.JButton();
        button_AddPedido = new javax.swing.JButton();
        button_FecharCompra = new javax.swing.JButton();
        text_Preco = new javax.swing.JTextField();
        label_Preco = new javax.swing.JLabel();
        sp = new javax.swing.JSpinner();
        label_Qtd = new javax.swing.JLabel();
        prato = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button_FazerLogin.setText("Fazer Login");
        button_FazerLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_FazerLoginActionPerformed(evt);
            }
        });

        button_Inicio.setText("Inicio");
        button_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_InicioActionPerformed(evt);
            }
        });

        button_Cardapio.setText("Cardápio");
        button_Cardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CardapioActionPerformed(evt);
            }
        });

        label_FazerPedidos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_FazerPedidos.setText("Fazer Pedidos");

        button_Contato.setText("Contato");
        button_Contato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ContatoActionPerformed(evt);
            }
        });

        button_AddPedido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_AddPedido.setText("Add Pedido");
        button_AddPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_AddPedidoActionPerformed(evt);
            }
        });

        button_FecharCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_FecharCompra.setText("Fechar Compra");
        button_FecharCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_FecharCompraActionPerformed(evt);
            }
        });

        label_Preco.setText("Preço:");

        sp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spStateChanged(evt);
            }
        });

        label_Qtd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Qtd.setText("Quantos pratos ?");

        prato.setText("Prato");

        descricao.setColumns(20);
        descricao.setRows(5);
        jScrollPane1.setViewportView(descricao);

        jLabel2.setText("Descrição:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button_AddPedido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_FecharCompra))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button_Inicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_Cardapio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_FazerLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_Contato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(label_Qtd)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(label_Preco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text_Preco))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(label_FazerPedidos)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(prato)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_FazerPedidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Inicio)
                    .addComponent(button_Cardapio)
                    .addComponent(button_FazerLogin)
                    .addComponent(button_Contato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Qtd)
                    .addComponent(label_Preco)
                    .addComponent(text_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_AddPedido)
                    .addComponent(button_FecharCompra))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_FazerLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_FazerLoginActionPerformed
        new FazerLogin().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_button_FazerLoginActionPerformed

    private void button_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_InicioActionPerformed
        new ComidaEmCasaAPP().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_button_InicioActionPerformed

    private void button_CardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CardapioActionPerformed
        new PratosNovo().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_button_CardapioActionPerformed

    private void button_ContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ContatoActionPerformed
        new Contato().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_button_ContatoActionPerformed

    private void button_AddPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AddPedidoActionPerformed
        Pedido p = new Pedido();
        p.quant = mult;
        p.valor = preco*mult;
        p.prato = prato.getText();
        Informacoes.pedidos.add(p);

        new PedidoAdicionado().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_button_AddPedidoActionPerformed

    private void button_FecharCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_FecharCompraActionPerformed
        new FazerLogin().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_button_FecharCompraActionPerformed

    private void spStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spStateChanged
        mult = (int) sp.getValue();
        preco = mult*precoi;
        text_Preco.setText(preco+"");       // TODO add your handling code here:
    }//GEN-LAST:event_spStateChanged

    /**
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
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FazerPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FazerPedido().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_AddPedido;
    private javax.swing.JButton button_Cardapio;
    private javax.swing.JButton button_Contato;
    private javax.swing.JButton button_FazerLogin;
    private javax.swing.JButton button_FecharCompra;
    private javax.swing.JButton button_Inicio;
    private javax.swing.JTextArea descricao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_FazerPedidos;
    private javax.swing.JLabel label_Preco;
    private javax.swing.JLabel label_Qtd;
    private javax.swing.JLabel prato;
    private javax.swing.JSpinner sp;
    private javax.swing.JTextField text_Preco;
    // End of variables declaration//GEN-END:variables
}
