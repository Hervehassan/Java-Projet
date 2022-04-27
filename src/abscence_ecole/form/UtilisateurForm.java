package abscence_ecole.form;

import abscence_ecole.classe.Utilisateur;
import abscence_ecole.gestion.gestionUtil;
import javax.swing.JOptionPane;

public class UtilisateurForm extends javax.swing.JFrame {

    public UtilisateurForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomUt = new javax.swing.JTextField();
        txtMdp = new javax.swing.JTextField();
        txtCoMdp = new javax.swing.JTextField();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel12 = new javax.swing.JLabel();
        btnAnnul1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbRetour = new javax.swing.JLabel();
        kbtnAjout = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Linux Libertine O", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nom");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 90, 45, 33);

        jLabel3.setFont(new java.awt.Font("Linux Libertine O", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Mot de passe");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 160, 143, 33);

        jLabel4.setFont(new java.awt.Font("Linux Libertine O", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Confirm mot de passe");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 230, 163, 33);

        txtNomUt.setBackground(new java.awt.Color(158, 161, 166));
        jPanel1.add(txtNomUt);
        txtNomUt.setBounds(40, 120, 320, 34);

        txtMdp.setBackground(new java.awt.Color(158, 161, 166));
        jPanel1.add(txtMdp);
        txtMdp.setBounds(40, 190, 320, 34);

        txtCoMdp.setBackground(new java.awt.Color(158, 161, 166));
        jPanel1.add(txtCoMdp);
        txtCoMdp.setBounds(40, 270, 320, 34);

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 51, 0));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 0, 204));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/logo.jpg"))); // NOI18N

        btnAnnul1.setBackground(new java.awt.Color(255, 255, 255));
        btnAnnul1.setForeground(new java.awt.Color(255, 0, 0));
        btnAnnul1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/Cancel icon.jpg"))); // NOI18N
        btnAnnul1.setBorder(null);
        btnAnnul1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnul1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Nimbus Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DREAMSCHOLL");

        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/facebook_48px.png"))); // NOI18N

        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/twitter_48px.png"))); // NOI18N

        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abscence_ecole/form/facebook_messenger_24px.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAnnul1))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel63)
                        .addGap(27, 27, 27)))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addComponent(btnAnnul1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64)
                            .addComponent(jLabel63))
                        .addContainerGap())))
        );

        jPanel1.add(kGradientPanel1);
        kGradientPanel1.setBounds(410, 0, 250, 430);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Utilisateur");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 350, 70);

        lbRetour.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbRetour.setForeground(new java.awt.Color(0, 0, 0));
        lbRetour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRetour.setText("Retour au login");
        lbRetour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRetourMouseClicked(evt);
            }
        });
        jPanel1.add(lbRetour);
        lbRetour.setBounds(210, 370, 150, 32);

        kbtnAjout.setText("Ajouter");
        kbtnAjout.setFont(new java.awt.Font("Linux Libertine Display O", 1, 18)); // NOI18N
        kbtnAjout.setkEndColor(new java.awt.Color(255, 0, 255));
        kbtnAjout.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kbtnAjout.setkStartColor(new java.awt.Color(0, 0, 153));
        kbtnAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbtnAjoutActionPerformed(evt);
            }
        });
        jPanel1.add(kbtnAjout);
        kbtnAjout.setBounds(230, 320, 130, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(657, 424));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Effacer() {
        txtNomUt.setText(" ");
        txtMdp.setText(" ");
        txtCoMdp.setText(" ");
        txtNomUt.requestFocus();

    }
    private void lbRetourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRetourMouseClicked
        UtilisateurForm.super.dispose();
        login lg = new login();
        lg.setVisible(true);
    }//GEN-LAST:event_lbRetourMouseClicked

    private void btnAnnul1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnul1ActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnAnnul1ActionPerformed

    private void kbtnAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbtnAjoutActionPerformed
        String nom = txtNomUt.getText();
        String mdp = txtMdp.getText();
        String confirm = txtCoMdp.getText();
        if (nom.equals("") || mdp.equals("") || confirm.equals("")) {
            JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
            txtNomUt.requestFocus();
        } else {
            try {
                Utilisateur ut = new Utilisateur(nom, mdp, confirm);
                gestionUtil geUt = new gestionUtil();
                if (confirm.equals(mdp)) {
                    geUt.insert(ut);
                    JOptionPane.showMessageDialog(null, "Utilisateur ajout avec succès");
                    Effacer();
                } else {
                    JOptionPane.showMessageDialog(null, "Confrimation mot de passe incorrect");
                    txtCoMdp.setText(" ");
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_kbtnAjoutActionPerformed

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
            java.util.logging.Logger.getLogger(UtilisateurForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UtilisateurForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UtilisateurForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UtilisateurForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UtilisateurForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnul1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KButton kbtnAjout;
    private javax.swing.JLabel lbRetour;
    private javax.swing.JTextField txtCoMdp;
    private javax.swing.JTextField txtMdp;
    private javax.swing.JTextField txtNomUt;
    // End of variables declaration//GEN-END:variables
}
