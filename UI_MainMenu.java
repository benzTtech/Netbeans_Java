package test;

public class UI_MainMenu extends javax.swing.JFrame {
    public UI_MainMenu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bm = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        akun = new javax.swing.JMenuItem();
        br = new javax.swing.JMenuItem();
        sp = new javax.swing.JMenuItem();
        pn = new javax.swing.JMenuItem();
        kt = new javax.swing.JMenuItem();
        bM = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel1.setText("HALO");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel2.setText("Dr.Strange");

        bm.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        bm.setText("Barang Masuk");
        bm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton2.setText("Persediaan");

        jButton3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton3.setText("Barang Keluar");

        jButton4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton4.setText("Pembelian");

        jButton5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton5.setText("Retur Persediaan");

        jButton6.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jButton6.setText("Logout");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2))
                                .addComponent(bm, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(348, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bm)
                    .addComponent(jButton3))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(34, 34, 34)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        jMenu1.setText("Master");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        akun.setText("Akun");
        akun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akunActionPerformed(evt);
            }
        });
        jMenu1.add(akun);

        br.setText("Barang");
        br.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brActionPerformed(evt);
            }
        });
        jMenu1.add(br);

        sp.setText("Supplier");
        sp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spActionPerformed(evt);
            }
        });
        jMenu1.add(sp);

        pn.setText("Pengguna");
        pn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnActionPerformed(evt);
            }
        });
        jMenu1.add(pn);

        kt.setText("Kategori");
        jMenu1.add(kt);

        jMenuBar1.add(jMenu1);

        bM.setText("Transaksi");

        jMenuItem1.setText("Barang Masuk");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        bM.add(jMenuItem1);

        jMenuItem2.setText("Pembelian");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        bM.add(jMenuItem2);

        jMenuItem3.setText("Barang Keluar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        bM.add(jMenuItem3);

        jMenuItem4.setText("Persediaan");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        bM.add(jMenuItem4);

        jMenuItem5.setText("Retur Persediaan");
        bM.add(jMenuItem5);

        jMenuBar1.add(bM);

        jMenu3.setText("Laporan");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Logout");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void akunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akunActionPerformed
        // TODO add your handling code here:
        new UI_DataAccount().setVisible(true);
    }//GEN-LAST:event_akunActionPerformed

    private void bmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmActionPerformed
        // TODO add your handling code here:
        new UI_DataBarangMasuk().setVisible(true);
    }//GEN-LAST:event_bmActionPerformed

    private void brActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brActionPerformed
        // TODO add your handling code here:
        new UI_DataBarang().setVisible(true);
    }//GEN-LAST:event_brActionPerformed

    private void spActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spActionPerformed
        // TODO add your handling code here:
        new UI_Supplier().setVisible(true);
    }//GEN-LAST:event_spActionPerformed

    private void pnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnActionPerformed
        // TODO add your handling code here:
        new UI_DataPengguna().setVisible(true);
    }//GEN-LAST:event_pnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new UI_DataBarangMasuk().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new UI_FormPembelian().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        new UI_DataBarangKeluar().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        new UI_DataPersediaan().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_MainMenu().setVisible(true);
            }});}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem akun;
    private javax.swing.JMenu bM;
    private javax.swing.JButton bm;
    private javax.swing.JMenuItem br;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem kt;
    private javax.swing.JMenuItem pn;
    private javax.swing.JMenuItem sp;
    // End of variables declaration//GEN-END:variables
}
