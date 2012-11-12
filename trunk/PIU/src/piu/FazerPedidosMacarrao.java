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
public class FazerPedidosMacarrao extends javax.swing.JFrame {

    /**
     * Creates new form FazerPedidosMacarrao
     */
    public FazerPedidosMacarrao() {
        initComponents();
        im.setIcon(imagem);
        text_Preco.setEditable(false);
        text_Preco.setText(preco+"");
        text_Preco.setText(preco*mult+"");
    }
        float preco = (float) 49.99;
        float precoi = (float) 49.99;
        int mult = 0;
        ImageIcon imagem = new ImageIcon("src/Imagens/italiano.jpg");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_FazerPedidos = new javax.swing.JLabel();
        button_Inicio = new javax.swing.JButton();
        button_Contato = new javax.swing.JButton();
        button_FazerLogin = new javax.swing.JButton();
        button_Cardapio = new javax.swing.JButton();
        macarrao = new javax.swing.JLabel();
        im = new javax.swing.JLabel();
        label_Descricao3 = new javax.swing.JLabel();
        label_Descricao = new javax.swing.JLabel();
        label_Descricao2 = new javax.swing.JLabel();
        button_FecharCompra = new javax.swing.JButton();
        button_AddPedido = new javax.swing.JButton();
        label_Preco = new javax.swing.JLabel();
        text_Preco = new javax.swing.JTextField();
        sp = new javax.swing.JSpinner();
        label_Qtd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_FazerPedidos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_FazerPedidos.setText("Fazer Pedidos");

        button_Inicio.setText("Inicio");
        button_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_InicioActionPerformed(evt);
            }
        });

        button_Contato.setText("Contato");
        button_Contato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ContatoActionPerformed(evt);
            }
        });

        button_FazerLogin.setText("Fazer Login");
        button_FazerLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_FazerLoginActionPerformed(evt);
            }
        });

        button_Cardapio.setText("Cardápio");
        button_Cardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CardapioActionPerformed(evt);
            }
        });

        macarrao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        macarrao.setText("Macarrão");

        label_Descricao3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Descricao3.setText("verde e molho à moda da casa ");

        label_Descricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Descricao.setText("Descrição: Macarrão, bacon,");

        label_Descricao2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Descricao2.setText("cenoura, frango desfiado, milho,");

        button_FecharCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_FecharCompra.setText("Fechar Compra");
        button_FecharCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_FecharCompraActionPerformed(evt);
            }
        });

        button_AddPedido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_AddPedido.setText("Add Pedido");
        button_AddPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_AddPedidoActionPerformed(evt);
            }
        });

        label_Preco.setText("Preço:");

        sp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spStateChanged(evt);
            }
        });

        label_Qtd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Qtd.setText("Qtd.:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(label_FazerPedidos)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(button_Inicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_Cardapio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_FazerLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_Contato))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(macarrao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(im))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Descricao2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(label_Descricao))
                            .addComponent(label_Descricao3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button_AddPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_FecharCompra))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(label_Qtd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(label_Preco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_FazerPedidos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Inicio)
                    .addComponent(button_Cardapio)
                    .addComponent(button_FazerLogin)
                    .addComponent(button_Contato))
                .addGap(18, 18, 18)
                .addComponent(macarrao)
                .addGap(18, 18, 18)
                .addComponent(im)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Qtd)
                    .addComponent(label_Preco)
                    .addComponent(text_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_Descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Descricao2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Descricao3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_AddPedido)
                    .addComponent(button_FecharCompra))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_InicioActionPerformed
        new ComidaEmCasaAPP().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_button_InicioActionPerformed

    private void button_CardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CardapioActionPerformed
        new Pratos().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_button_CardapioActionPerformed

    private void button_ContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ContatoActionPerformed
        new Contato().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_button_ContatoActionPerformed

    private void spStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spStateChanged
        mult = (int) sp.getValue();
        preco = mult*precoi;
        text_Preco.setText(preco+"");        // TODO add your handling code here:
    }//GEN-LAST:event_spStateChanged

    private void button_AddPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_AddPedidoActionPerformed
    Pedido p = new Pedido();
        p.quant = mult;
        p.valor = preco*mult;
        p.prato = macarrao.getText();
        Informacoes.pedidos.add(p);
        
        new PedidoAdicionado().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_button_AddPedidoActionPerformed

    private void button_FazerLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_FazerLoginActionPerformed
        new FazerLogin().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_button_FazerLoginActionPerformed

    private void button_FecharCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_FecharCompraActionPerformed
        new FazerLogin().setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_button_FecharCompraActionPerformed

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
            java.util.logging.Logger.getLogger(FazerPedidosMacarrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FazerPedidosMacarrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FazerPedidosMacarrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FazerPedidosMacarrao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FazerPedidosMacarrao().setVisible(true);
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
    private javax.swing.JLabel im;
    private javax.swing.JLabel label_Descricao;
    private javax.swing.JLabel label_Descricao2;
    private javax.swing.JLabel label_Descricao3;
    private javax.swing.JLabel label_FazerPedidos;
    private javax.swing.JLabel label_Preco;
    private javax.swing.JLabel label_Qtd;
    private javax.swing.JLabel macarrao;
    private javax.swing.JSpinner sp;
    private javax.swing.JTextField text_Preco;
    // End of variables declaration//GEN-END:variables
}
