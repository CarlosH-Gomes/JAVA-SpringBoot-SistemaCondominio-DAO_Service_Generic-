/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadApartamento.view;

/**
 *
 * @author Carlos
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        menuMorador = new javax.swing.JMenu();
        miCadastraMorador = new javax.swing.JMenuItem();
        menuContasMorador = new javax.swing.JMenu();
        mContasMorador = new javax.swing.JMenuItem();
        mConsutaContasMorador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuMorador.setText("Morador");

        miCadastraMorador.setText("Cadastro morador");
        miCadastraMorador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                miCadastraMoradorMousePressed(evt);
            }
        });
        miCadastraMorador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastraMoradorActionPerformed(evt);
            }
        });
        menuMorador.add(miCadastraMorador);

        jMenuBar2.add(menuMorador);

        menuContasMorador.setText("Contas Morador");

        mContasMorador.setText("Cadastro Conta");
        mContasMorador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mContasMoradorMousePressed(evt);
            }
        });
        mContasMorador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mContasMoradorActionPerformed(evt);
            }
        });
        menuContasMorador.add(mContasMorador);

        mConsutaContasMorador.setText("Consulta Contas Morador");
        mConsutaContasMorador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mConsutaContasMoradorMousePressed(evt);
            }
        });
        mConsutaContasMorador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConsutaContasMoradorActionPerformed(evt);
            }
        });
        menuContasMorador.add(mConsutaContasMorador);

        jMenuBar2.add(menuContasMorador);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadastraMoradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastraMoradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miCadastraMoradorActionPerformed

    private void miCadastraMoradorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miCadastraMoradorMousePressed
            CadastroMoradorView cm = new CadastroMoradorView();
            cm.setVisible(true);
    }//GEN-LAST:event_miCadastraMoradorMousePressed

    private void mContasMoradorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mContasMoradorMousePressed
           ContasMoradorView cm = new ContasMoradorView();
           cm.setVisible(true);
    }//GEN-LAST:event_mContasMoradorMousePressed

    private void mContasMoradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mContasMoradorActionPerformed
        
    }//GEN-LAST:event_mContasMoradorActionPerformed

    private void mConsutaContasMoradorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mConsutaContasMoradorMousePressed
        VisualizarContasMoradorView cm = new VisualizarContasMoradorView();
           cm.setVisible(true);
    }//GEN-LAST:event_mConsutaContasMoradorMousePressed

    private void mConsutaContasMoradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConsutaContasMoradorActionPerformed
     
    }//GEN-LAST:event_mConsutaContasMoradorActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem mConsutaContasMorador;
    private javax.swing.JMenuItem mContasMorador;
    private javax.swing.JMenu menuContasMorador;
    private javax.swing.JMenu menuMorador;
    private javax.swing.JMenuItem miCadastraMorador;
    // End of variables declaration//GEN-END:variables
}
