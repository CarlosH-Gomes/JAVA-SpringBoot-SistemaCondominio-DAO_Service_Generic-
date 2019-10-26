/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cadApartamento.view;

import com.model.ContasMorador;
import com.daoImp.ContasMoradorDAOImp;
import com.servico.ContasMoradorService;
import com.servicoimp.ContasMoradorServiceImp;
import java.util.regex.PatternSyntaxException;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Carlos
 */
public class VisualizarContasMoradorView extends javax.swing.JFrame {

    /**
     * Creates new form VisualizarCadastroContasMoradorView
     */
    public VisualizarContasMoradorView() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTableConta.getModel();
        jTableConta.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPesquisa = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConta = new javax.swing.JTable();
        btn_buscar = new javax.swing.JToggleButton();
        rbCPF = new javax.swing.JRadioButton();
        rbDataVenc = new javax.swing.JRadioButton();
        rbTipoConta = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Pesquisa:");

        jTableConta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "CPF", "Conta", "Valor", "Data Vencimento"
            }
        ));
        jTableConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableContaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConta);

        btn_buscar.setText("Buscar");

        bgPesquisa.add(rbCPF);
        rbCPF.setText("CPF");

        bgPesquisa.add(rbDataVenc);
        rbDataVenc.setText("Data Vencimento");

        bgPesquisa.add(rbTipoConta);
        rbTipoConta.setText("Tipo de conta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbCPF)
                                .addGap(18, 18, 18)
                                .addComponent(rbDataVenc)
                                .addGap(18, 18, 18)
                                .addComponent(rbTipoConta))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscar)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCPF)
                    .addComponent(rbDataVenc)
                    .addComponent(rbTipoConta))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableContaMouseClicked
                                         
        if (jTableConta.getSelectedRow() != -1) {
            ContasMoradorView cm = new ContasMoradorView();
            cm.setVisible(true);
            cm.recebeDados((Integer) jTableConta.getValueAt(jTableConta.getSelectedRow(), 0));
            dispose();
        }
         
    }//GEN-LAST:event_jTableContaMouseClicked


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (opttxtPesquisa>
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
            java.util.logging.Logger.getLogger(VisualizarContasMoradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarContasMoradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarContasMoradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarContasMoradorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizarContasMoradorView().setVisible(true);
            }
        });
    }
    
    

     public void readJTable() {

        DefaultTableModel modelo = (DefaultTableModel) jTableConta.getModel();
        modelo.setNumRows(0);
        ContasMoradorService service = new ContasMoradorServiceImp();
        for (ContasMorador m : service.findAll("ContasMorador")) {
            modelo.addRow(new Object[]{
                m.getCodigo(),
                m.getMoradorCpf(),
                m.getTipoConta(),
                m.getValor(),
                m.getDataVenc()
                
            });

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgPesquisa;
    private javax.swing.JToggleButton btn_buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConta;
    private javax.swing.JRadioButton rbCPF;
    private javax.swing.JRadioButton rbDataVenc;
    private javax.swing.JRadioButton rbTipoConta;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
