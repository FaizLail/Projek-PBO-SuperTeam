/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu;

/**
 *
 * @author mizuru
 */
public class ApotekMenu extends javax.swing.JFrame {

    /**
     * Creates new form ApotekMenu
     */
    public ApotekMenu() {
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

        PesanObat = new javax.swing.JButton();
        CekBMI = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ApotekSederhana = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Utama");
        setBackground(new java.awt.Color(255, 102, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 0, 255));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setName("LatarUtama"); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(200, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PesanObat.setBackground(new java.awt.Color(153, 204, 255));
        PesanObat.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        PesanObat.setText("Pesan Obat");
        PesanObat.setAlignmentY(0.0F);
        PesanObat.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PesanObat.setMaximumSize(new java.awt.Dimension(70, 30));
        PesanObat.setMinimumSize(new java.awt.Dimension(70, 30));
        PesanObat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesanObatMouseClicked(evt);
            }
        });
        PesanObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesanObatActionPerformed(evt);
            }
        });
        getContentPane().add(PesanObat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 160, 50));

        CekBMI.setBackground(new java.awt.Color(153, 204, 255));
        CekBMI.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        CekBMI.setText("Cek BMI");
        CekBMI.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CekBMI.setMaximumSize(new java.awt.Dimension(70, 30));
        CekBMI.setMinimumSize(new java.awt.Dimension(70, 30));
        CekBMI.setPreferredSize(new java.awt.Dimension(70, 23));
        getContentPane().add(CekBMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 160, 50));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMaximumSize(new java.awt.Dimension(510, 51));
        jPanel2.setMinimumSize(new java.awt.Dimension(510, 51));

        ApotekSederhana.setBackground(new java.awt.Color(102, 153, 255));
        ApotekSederhana.setFont(new java.awt.Font("Kalimati", 1, 24)); // NOI18N
        ApotekSederhana.setForeground(new java.awt.Color(0, 0, 0));
        ApotekSederhana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ApotekSederhana.setText("APOTEK SEDERHANA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(ApotekSederhana, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(ApotekSederhana, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PesanObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesanObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesanObatActionPerformed

    private void PesanObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesanObatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PesanObatMouseClicked

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
            java.util.logging.Logger.getLogger(ApotekMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApotekMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApotekMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApotekMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApotekMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApotekSederhana;
    private javax.swing.JButton CekBMI;
    private javax.swing.JButton PesanObat;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
