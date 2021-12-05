package menu;

public class Flue extends javax.swing.JFrame {

    /**
     * Creates new form Flue
     */
    public Flue() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jumlahInput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hargaBayar = new javax.swing.JTextField();
        Ok = new javax.swing.JButton();
        backMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Flue");
        setMinimumSize(new java.awt.Dimension(500, 300));
        setPreferredSize(new java.awt.Dimension(500, 300));
        setSize(new java.awt.Dimension(500, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 50));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Obat FLUE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        jLabel2.setText("Jumlah");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 251, 500, 10));

        jLabel3.setText("Jumlah yang dibayarkan");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 269, -1, -1));

        jumlahInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahInputActionPerformed(evt);
            }
        });
        getContentPane().add(jumlahInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 80, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/GAMBAR/obatflue.jpeg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 74, 220, 116));

        hargaBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaBayarActionPerformed(evt);
            }
        });
        getContentPane().add(hargaBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 267, 292, -1));

        Ok.setText("Ok");
        Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkActionPerformed(evt);
            }
        });
        getContentPane().add(Ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 60, 20));

        backMenu.setText("Menu");
        backMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMenuActionPerformed(evt);
            }
        });
        getContentPane().add(backMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jumlahInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahInputActionPerformed
        
    }//GEN-LAST:event_jumlahInputActionPerformed

    private void OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkActionPerformed
        
    }//GEN-LAST:event_OkActionPerformed

    private void hargaBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaBayarActionPerformed
        
    }//GEN-LAST:event_hargaBayarActionPerformed

    private void backMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMenuActionPerformed
        ApotekMenu cek = new ApotekMenu();
        cek.setVisible(true);
        dispose();
    }//GEN-LAST:event_backMenuActionPerformed


    public void flue() {
        new Flue().setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ok;
    private javax.swing.JButton backMenu;
    private javax.swing.JTextField hargaBayar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jumlahInput;
    // End of variables declaration//GEN-END:variables
}
