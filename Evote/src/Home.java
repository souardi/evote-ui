/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sofianeouardi
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        HomePanel = new javax.swing.JPanel();
        evoteimgLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        voteimgLabel1 = new javax.swing.JLabel();
        voteCumulatifButton = new javax.swing.JButton();
        voteimgLabel2 = new javax.swing.JLabel();
        voteMajoritaireButton = new javax.swing.JButton();
        voteimgLabel3 = new javax.swing.JLabel();
        voteQuotientButton = new javax.swing.JButton();
        choisirmodevoteLabel = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/sofianeouardi/Desktop/img/evote-logo.png")); // NOI18N
        jLabel1.setText("q");

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(720, 480));

        HomePanel.setBackground(new java.awt.Color(255, 255, 255));
        HomePanel.setMinimumSize(new java.awt.Dimension(720, 480));

        evoteimgLabel.setIcon(new javax.swing.ImageIcon("/Users/sofianeouardi/Desktop/img/evote-logo.png")); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        voteimgLabel1.setIcon(new javax.swing.ImageIcon("/Users/sofianeouardi/Desktop/img/logo vote comp.png")); // NOI18N

        voteCumulatifButton.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        voteCumulatifButton.setText("Vote cumulatif");
        voteCumulatifButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteCumulatifButtonActionPerformed(evt);
            }
        });

        voteimgLabel2.setIcon(new javax.swing.ImageIcon("/Users/sofianeouardi/Desktop/img/logo vote comp.png")); // NOI18N

        voteMajoritaireButton.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        voteMajoritaireButton.setText("Vote majoritaire à 2 tours");
        voteMajoritaireButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteMajoritaireButtonActionPerformed(evt);
            }
        });

        voteimgLabel3.setIcon(new javax.swing.ImageIcon("/Users/sofianeouardi/Desktop/img/logo vote comp.png")); // NOI18N

        voteQuotientButton.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        voteQuotientButton.setText("Vote par quotient");
        voteQuotientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteQuotientButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(voteCumulatifButton)
                    .addComponent(voteimgLabel1))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(voteimgLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(voteMajoritaireButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(voteimgLabel3)
                        .addGap(8, 8, 8))
                    .addComponent(voteQuotientButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(voteimgLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(voteMajoritaireButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(voteimgLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(voteCumulatifButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(voteimgLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(voteQuotientButton))))
        );

        choisirmodevoteLabel.setBackground(new java.awt.Color(204, 204, 204));
        choisirmodevoteLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        choisirmodevoteLabel.setForeground(new java.awt.Color(102, 102, 102));
        choisirmodevoteLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        choisirmodevoteLabel.setText("Veuillez choisir un mode de vote :");

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addComponent(evoteimgLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(choisirmodevoteLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomePanelLayout.createSequentialGroup()
                .addComponent(evoteimgLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(choisirmodevoteLabel)
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voteCumulatifButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteCumulatifButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voteCumulatifButtonActionPerformed

    private void voteMajoritaireButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteMajoritaireButtonActionPerformed
        // TODO add your handling code here:
        VoteMajoritaireHome voteMajoritaireHome = new VoteMajoritaireHome();
        voteMajoritaireHome.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_voteMajoritaireButtonActionPerformed

    private void voteQuotientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteQuotientButtonActionPerformed
        // TODO add your handling code here:
        VoteParQuotientHome VoteParQuotientHome = new VoteParQuotientHome();
        VoteParQuotientHome.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_voteQuotientButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomePanel;
    private javax.swing.JLabel choisirmodevoteLabel;
    private javax.swing.JLabel evoteimgLabel;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton voteCumulatifButton;
    private javax.swing.JButton voteMajoritaireButton;
    private javax.swing.JButton voteQuotientButton;
    private javax.swing.JLabel voteimgLabel1;
    private javax.swing.JLabel voteimgLabel2;
    private javax.swing.JLabel voteimgLabel3;
    // End of variables declaration//GEN-END:variables
}
