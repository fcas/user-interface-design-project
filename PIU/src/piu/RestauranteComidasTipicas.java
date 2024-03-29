/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piu;

import javax.swing.ImageIcon;

/**
 *
 * @author felipe
 */
public class RestauranteComidasTipicas extends javax.swing.JFrame {

    /**
     * Creates new form RestauranteComidasTipicas2
     */
    public RestauranteComidasTipicas() {
        initComponents();
        
        im_restaurante.setIcon(imagem);
    }
    
    ImageIcon imagem = new ImageIcon("src/Imagens/RESTAURANTE.png");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        button_Cardapio = new javax.swing.JButton();
        button_Inicio = new javax.swing.JButton();
        button_FazerLogin = new javax.swing.JButton();
        button_Contato = new javax.swing.JButton();
        im_restaurante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Restaurante Comidas Típicas");

        button_Cardapio.setText("Cardápio");
        button_Cardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CardapioActionPerformed(evt);
            }
        });

        button_Inicio.setText("Inicio");
        button_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_InicioActionPerformed(evt);
            }
        });

        button_FazerLogin.setText("Fazer Login");
        button_FazerLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_FazerLoginActionPerformed(evt);
            }
        });

        button_Contato.setText("Contato");
        button_Contato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ContatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(im_restaurante))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(button_Inicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_Cardapio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_FazerLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_Contato)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Inicio)
                    .addComponent(button_Cardapio)
                    .addComponent(button_FazerLogin)
                    .addComponent(button_Contato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(im_restaurante)
                .addGap(201, 201, 201))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_InicioActionPerformed
        new ComidaEmCasaAPP().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_button_InicioActionPerformed

    private void button_CardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CardapioActionPerformed
        new PratosNovo().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_button_CardapioActionPerformed

    private void button_FazerLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_FazerLoginActionPerformed
        new FazerLogin().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_button_FazerLoginActionPerformed

    private void button_ContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ContatoActionPerformed
        new Contato().setVisible(true);
        this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_button_ContatoActionPerformed

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
            java.util.logging.Logger.getLogger(RestauranteComidasTipicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RestauranteComidasTipicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RestauranteComidasTipicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RestauranteComidasTipicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RestauranteComidasTipicas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Cardapio;
    private javax.swing.JButton button_Contato;
    private javax.swing.JButton button_FazerLogin;
    private javax.swing.JButton button_Inicio;
    private javax.swing.JLabel im_restaurante;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
