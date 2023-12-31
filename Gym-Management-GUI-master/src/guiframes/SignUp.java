/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guiframes;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import databaseConnection.DatabaseConnection;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 * @author Lenovo
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
    }

    private void clear() {
        txtuser.setText("");
        txtpass.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        signupbutton = new javax.swing.JButton();
        resetbutton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        showpassword = new javax.swing.JCheckBox();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/10601033ed.png"))); // NOI18N

        jLabel2.setText("Korisničko ime:");

        jLabel3.setText("Vaša lozinka:");

        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassKeyPressed(evt);
            }
        });

        signupbutton.setText("Napravi nalog");
        signupbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupbuttonMouseClicked(evt);
            }
        });

        resetbutton.setText("Obriši polja");
        resetbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetbuttonMouseClicked(evt);
            }
        });

        backbutton.setText("Nazad");
        backbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbuttonMouseClicked(evt);
            }
        });

        exitbutton.setText("Izlaz");
        exitbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbuttonMouseClicked(evt);
            }
        });

        showpassword.setText("Prikaži lozinku");
        showpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpasswordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(showpassword)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(txtuser, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                                                .addComponent(txtpass)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(backbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(signupbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(resetbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                                        .addComponent(exitbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(19, 19, 19)
                                                .addComponent(showpassword)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(resetbutton)
                                                        .addComponent(signupbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(exitbutton)
                                                        .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbuttonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitbuttonMouseClicked

    private void resetbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetbuttonMouseClicked
        // TODO add your handling code here:
        txtuser.setText("");
        txtpass.setText("");
    }//GEN-LAST:event_resetbuttonMouseClicked

    private void backbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonMouseClicked
        // TODO add your handling code here:
        StartMenu sm = new StartMenu();
        sm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backbuttonMouseClicked

    private void signupbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupbuttonMouseClicked
        // TODO add your handling code here:
        UIManager.put("OptionPane.okButtonText", "U redu");

        if (txtpass.getText().isEmpty() || txtuser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Popunite sva polja",
                    "",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                String query = "INSERT INTO logintable (username, password) VALUES (?, ?)";
                PreparedStatement pst = DatabaseConnection.getConnection().prepareStatement(query);

                pst.setString(1, txtuser.getText());
                pst.setString(2, txtpass.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,
                        "Nalog uspešno napravljen",
                        "",
                        JOptionPane.INFORMATION_MESSAGE);
                clear();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this,
                        e + " Neuspešno pravljenje naloga",
                        "",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_signupbuttonMouseClicked

    private void showpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpasswordMouseClicked
        // TODO add your handling code here:
        if (showpassword.isSelected()) {
            txtpass.setEchoChar((char) 0);
        } else {
            txtpass.setEchoChar('*');
        }
    }//GEN-LAST:event_showpasswordMouseClicked

    private void txtpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            UIManager.put("OptionPane.okButtonText", "U redu");

            if (txtpass.getText().isEmpty() || txtuser.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Popunite sva polja",
                        "",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    String query = "INSERT INTO logintable (username, password) VALUES (?, ?)";
                    PreparedStatement pst = DatabaseConnection.getConnection().prepareStatement(query);

                    pst.setString(1, txtuser.getText());
                    pst.setString(2, txtpass.getText());

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this,
                            "Nalog uspešno napravljen",
                            "",
                            JOptionPane.INFORMATION_MESSAGE);
                    clear();

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this,
                            e + " Neuspešno pravljenje naloga",
                            "",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_txtpassKeyPressed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel(new FlatMaterialLighterIJTheme());
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JButton exitbutton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton resetbutton;
    private javax.swing.JCheckBox showpassword;
    private javax.swing.JButton signupbutton;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
