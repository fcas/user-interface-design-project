/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piu;

/**
 *
 * @author Dalay
 */
public class FazerPedidosFeijoada extends javax.swing.JFrame {

    /**
     * Creates new form FazerPedidosFeijoada
     */
    public FazerPedidosFeijoada() {
        initComponents();
        button_Cardapio.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_Contato = new javax.swing.JButton();
        label_FazerPedidos = new javax.swing.JLabel();
        button_Cardapio = new javax.swing.JButton();
        button_Inicio = new javax.swing.JButton();
        button_FazerLogin = new javax.swing.JButton();
        label_Feijoada = new javax.swing.JLabel();
        im_Feijoada = new javax.swing.JLabel();
        label_Qtd = new javax.swing.JLabel();
        spinner_Contador = new javax.swing.JSpinner();
        label_Preco = new javax.swing.JLabel();
        text_Preco = new javax.swing.JTextField();
        button_FecharCompra = new javax.swing.JButton();
        button_AddPedido = new javax.swing.JButton();
        label_Descricao = new javax.swing.JLabel();
        label_Descricao2 = new javax.swing.JLabel();
        label_Descricao3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button_Contato.setText("Contato");

        label_FazerPedidos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_FazerPedidos.setText("Fazer Pedidos");

        button_Cardapio.setText("Cardápio");

        button_Inicio.setText("Inicio");

        button_FazerLogin.setText("Fazer Login");

        label_Feijoada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Feijoada.setText("Feijoada");

        label_Qtd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Qtd.setText("Qtd.:");

        label_Preco.setText("Preço:");

        button_FecharCompra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_FecharCompra.setText("Fechar Compra");

        button_AddPedido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        button_AddPedido.setText("Add Pedido");

        label_Descricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Descricao.setText("Descrição: Feijoada no fogão à lenha,");

        label_Descricao2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Descricao2.setText("arroz branco, bisteca suína, couve, torresmo,");

        label_Descricao3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_Descricao3.setText("farofa, vinagrete e salada à vontade.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(button_Inicio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button_Cardapio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button_FazerLogin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button_Contato))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(72, 72, 72)
                                    .addComponent(label_FazerPedidos)
                                    .addGap(53, 53, 53))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(132, 132, 132)
                            .addComponent(label_Feijoada))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(im_Feijoada)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(label_Descricao))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(label_Qtd)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spinner_Contador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label_Preco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(text_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(button_AddPedido)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button_FecharCompra))
                                .addComponent(label_Descricao2)))))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label_Descricao3)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(label_FazerPedidos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Inicio)
                    .addComponent(button_Cardapio)
                    .addComponent(button_FazerLogin)
                    .addComponent(button_Contato))
                .addGap(18, 18, 18)
                .addComponent(label_Feijoada)
                .addGap(18, 18, 18)
                .addComponent(im_Feijoada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Qtd)
                    .addComponent(label_Preco)
                    .addComponent(text_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinner_Contador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FazerPedidosFeijoada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FazerPedidosFeijoada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FazerPedidosFeijoada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FazerPedidosFeijoada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FazerPedidosFeijoada().setVisible(true);
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
    private javax.swing.JLabel im_Feijoada;
    private javax.swing.JLabel label_Descricao;
    private javax.swing.JLabel label_Descricao2;
    private javax.swing.JLabel label_Descricao3;
    private javax.swing.JLabel label_FazerPedidos;
    private javax.swing.JLabel label_Feijoada;
    private javax.swing.JLabel label_Preco;
    private javax.swing.JLabel label_Qtd;
    private javax.swing.JSpinner spinner_Contador;
    private javax.swing.JTextField text_Preco;
    // End of variables declaration//GEN-END:variables
}
