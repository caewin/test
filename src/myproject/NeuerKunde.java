/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author 123
 */
public class NeuerKunde extends javax.swing.JFrame {

    /**
     * Creates new form NeuerKunde
     */
    public NeuerKunde() {
        initComponents();
       
        button.addActionListener(e -> {getInput();});
    }
    
    public void getInput()
    {
        String vorname = F_Vorname.getText();
       
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
        F_Nachname = new javax.swing.JTextField();
        F_Firma = new javax.swing.JTextField();
        F_Vorname = new javax.swing.JTextField();
        F_Adresse = new javax.swing.JTextField();
        F_Email = new javax.swing.JTextField();
        F_Ort = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 150, 240));

        F_Nachname.setBackground(new java.awt.Color(100, 200, 255));
        F_Nachname.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        F_Nachname.setForeground(new java.awt.Color(255, 255, 255));
        F_Nachname.setText("Nachname");
        F_Nachname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_NachnameActionPerformed(evt);
            }
        });

        F_Firma.setBackground(new java.awt.Color(100, 200, 255));
        F_Firma.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        F_Firma.setForeground(new java.awt.Color(255, 255, 255));
        F_Firma.setText("Firma");
        F_Firma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_FirmaActionPerformed(evt);
            }
        });

        F_Vorname.setBackground(new java.awt.Color(100, 200, 255));
        F_Vorname.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        F_Vorname.setForeground(new java.awt.Color(255, 255, 255));
        F_Vorname.setText("Vorname");
        F_Vorname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_VornameActionPerformed(evt);
            }
        });

        F_Adresse.setBackground(new java.awt.Color(100, 200, 255));
        F_Adresse.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        F_Adresse.setForeground(new java.awt.Color(255, 255, 255));
        F_Adresse.setText("Straße Hausnummer");
        F_Adresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_AdresseActionPerformed(evt);
            }
        });

        F_Email.setBackground(new java.awt.Color(100, 200, 255));
        F_Email.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        F_Email.setForeground(new java.awt.Color(255, 255, 255));
        F_Email.setText("Email");
        F_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_EmailActionPerformed(evt);
            }
        });

        F_Ort.setBackground(new java.awt.Color(100, 200, 255));
        F_Ort.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        F_Ort.setForeground(new java.awt.Color(255, 255, 255));
        F_Ort.setText("PLZ Ort");
        F_Ort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_OrtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NEUER KUNDE");

        button.setBackground(new java.awt.Color(100, 200, 255));
        button.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Anlegen");
        button.setBorder(null);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(F_Firma, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(F_Vorname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(F_Adresse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(F_Email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(F_Ort, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(F_Nachname, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(F_Firma, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(F_Nachname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F_Vorname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(F_Adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(F_Ort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(F_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void F_NachnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_NachnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_NachnameActionPerformed

    private void F_FirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_FirmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_FirmaActionPerformed

    private void F_VornameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_VornameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_VornameActionPerformed

    private void F_AdresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_AdresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_AdresseActionPerformed

    private void F_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_EmailActionPerformed

    private void F_OrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_OrtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_OrtActionPerformed

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
            java.util.logging.Logger.getLogger(NeuerKunde.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NeuerKunde.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NeuerKunde.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NeuerKunde.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NeuerKunde().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField F_Adresse;
    private javax.swing.JTextField F_Email;
    private javax.swing.JTextField F_Firma;
    private javax.swing.JTextField F_Nachname;
    private javax.swing.JTextField F_Ort;
    private javax.swing.JTextField F_Vorname;
    private javax.swing.JButton button;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
