package app;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.table.*;

public class Employees extends javax.swing.JFrame {

    Connect query = new Connect();
    DefaultTableModel t;
    public Employees() {
        initComponents();
        ArrayList<String> employees = query.select(
                                            new String[]{"FirstName", "LastName"}, 
                                            "Employees");
        for (int i = 0; i < employees.size(); i++) {
            jComboBox1.addItem(String.join(" ", employees.get(i).split("---")));
        }
        
        t = (DefaultTableModel) jTable1.getModel();
        ArrayList<String> customers = query.select(
                    new String[]{"CustomerId","FirstName", "LastName", "City", "Country", "Email"}, 
                                "Customers");
        for (int i = 0; i < customers.size(); i++) {
            String[] row = customers.get(i).split("---");
            t.addRow(new Object[]{
                                  row[0],
                                  row[1],
                                  row[2],
                                  row[3],
                                  row[4],
                                  row[5]
                    });
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        parisFilter = new javax.swing.JButton();
        berlinFilter = new javax.swing.JButton();
        pragueFilter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Търси");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Код", "Име", "Фамилия", "Град", "Държава", "Имейл"
            }
        ));
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Изчисти");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        parisFilter.setBackground(new java.awt.Color(153, 204, 255));
        parisFilter.setText("Париж");
        parisFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parisFilterActionPerformed(evt);
            }
        });

        berlinFilter.setBackground(new java.awt.Color(153, 204, 255));
        berlinFilter.setText("Берлин");
        berlinFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berlinFilterActionPerformed(evt);
            }
        });

        pragueFilter.setBackground(new java.awt.Color(153, 204, 255));
        pragueFilter.setText("Прага");
        pragueFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pragueFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(parisFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(berlinFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pragueFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(parisFilter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(berlinFilter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pragueFilter)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = jTextField1.getText();
        jComboBox1.removeAllItems();
        
        ArrayList<String> employees = query.selectWhere(
                                            new String[]{"FirstName", "LastName"}, 
                                            new int[]{0, 1},
                                            new String[]{name, name},
                                            "Employees");
        for (int i = 0; i < employees.size(); i++) {
            jComboBox1.addItem(String.join(" ", employees.get(i).split("---")));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        t.setRowCount(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void parisFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parisFilterActionPerformed
        t.setRowCount(0);
        ArrayList<String> customers = query.selectWhere(
                    new String[]{"CustomerId","FirstName", "LastName", "City", "Country", "Email"},
                    new int[]{3},
                    new String[]{"Paris"},
                    "Customers");
        for (int i = 0; i < customers.size(); i++) {
            String[] row = customers.get(i).split("---");
            t.addRow(new Object[]{
                                  row[0],
                                  row[1],
                                  row[2],
                                  row[3],
                                  row[4],
                                  row[5]
                    });
        }
    }//GEN-LAST:event_parisFilterActionPerformed

    private void berlinFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berlinFilterActionPerformed
        t.setRowCount(0);
        ArrayList<String> customers = query.selectWhere(
                    new String[]{"CustomerId","FirstName", "LastName", "City", "Country", "Email"},
                    new int[]{3},
                    new String[]{"Berlin"},
                    "Customers");
        for (int i = 0; i < customers.size(); i++) {
            String[] row = customers.get(i).split("---");
            t.addRow(new Object[]{
                                  row[0],
                                  row[1],
                                  row[2],
                                  row[3],
                                  row[4],
                                  row[5]
                    });
        }
    }//GEN-LAST:event_berlinFilterActionPerformed

    private void pragueFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pragueFilterActionPerformed
        t.setRowCount(0);
        ArrayList<String> customers = query.selectWhere(
                    new String[]{"CustomerId","FirstName", "LastName", "City", "Country", "Email"},
                    new int[]{3},
                    new String[]{"Prague"},
                    "Customers");
        for (int i = 0; i < customers.size(); i++) {
            String[] row = customers.get(i).split("---");
            t.addRow(new Object[]{
                                  row[0],
                                  row[1],
                                  row[2],
                                  row[3],
                                  row[4],
                                  row[5]
                    });
        }
    }//GEN-LAST:event_pragueFilterActionPerformed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        int code=evt.getKeyCode();
        if(code==KeyEvent.VK_DELETE){
            int selection = jTable1.getSelectedRow();
            t.removeRow(selection);
        }
    }//GEN-LAST:event_jTable1KeyReleased

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
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton berlinFilter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton parisFilter;
    private javax.swing.JButton pragueFilter;
    // End of variables declaration//GEN-END:variables
}
