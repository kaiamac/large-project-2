/*
 * Kaia Mac
 * Culminating project
 * 2018-2019
 */

/**
 *
 * @author kamac8665
 */
public class Page1 extends javax.swing.JFrame {

    /**
     * Creates new form Page1
     */
    
    public Page1() {
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

        jComboBox1 = new javax.swing.JComboBox();
        compoundedInterest = new javax.swing.JButton();
        simpleInterest = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BackgroundPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        infoLabel1 = new javax.swing.JLabel();
        infoLabel2 = new javax.swing.JLabel();
        infoLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        futureValueButton = new javax.swing.JButton();
        howMuchShouldBecompounded = new javax.swing.JButton();
        HowMuchToBeInvestedNow = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        compoundedInterest.setText("Compounded Interest");

        simpleInterest.setText("Simple Interest");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BackgroundPanel.setBackground(new java.awt.Color(204, 255, 255));

        titleLabel.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        titleLabel.setText("Financing Applications");

        infoLabel1.setText("The following program will answer some questions you may have on ");

        infoLabel2.setText("your investment/financial plans. Press the button according to what you");

        infoLabel3.setText("are trying to calculate and find out.");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Coumpounded Interest:");

        futureValueButton.setBackground(new java.awt.Color(204, 204, 255));
        futureValueButton.setText("Future Value");
        futureValueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                futureValueButtonActionPerformed(evt);
            }
        });

        howMuchShouldBecompounded.setBackground(new java.awt.Color(204, 204, 255));
        howMuchShouldBecompounded.setText("How much to regularly pay to achieve a future goal");
        howMuchShouldBecompounded.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                howMuchShouldBecompoundedActionPerformed(evt);
            }
        });

        HowMuchToBeInvestedNow.setBackground(new java.awt.Color(204, 204, 255));
        HowMuchToBeInvestedNow.setText("How much to invest now in full to achieve a future goal");
        HowMuchToBeInvestedNow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HowMuchToBeInvestedNowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addComponent(infoLabel1)
                    .addComponent(infoLabel2)
                    .addComponent(infoLabel3)
                    .addComponent(jLabel1)
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(howMuchShouldBecompounded)
                            .addComponent(futureValueButton)
                            .addComponent(HowMuchToBeInvestedNow))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoLabel3)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(futureValueButton)
                .addGap(18, 18, 18)
                .addComponent(howMuchShouldBecompounded)
                .addGap(18, 18, 18)
                .addComponent(HowMuchToBeInvestedNow)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void futureValueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_futureValueButtonActionPerformed
        //this code programs the project to switch from page 1 to page 2
        this.setVisible(false);
        Page2 t = new Page2();
        t.setVisible(true); 
    }//GEN-LAST:event_futureValueButtonActionPerformed

    private void howMuchShouldBecompoundedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_howMuchShouldBecompoundedActionPerformed
        //this code programs the project to switch from page 1 to page 3
        this.setVisible(false);
        Page3 q = new Page3();
        q.setVisible(true); 
    }//GEN-LAST:event_howMuchShouldBecompoundedActionPerformed

    private void HowMuchToBeInvestedNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HowMuchToBeInvestedNowActionPerformed
        //this code programs the project to switch from page 1 to page 4
        this.setVisible(false);
        Page4 m = new Page4();
        m.setVisible(true); 
    }//GEN-LAST:event_HowMuchToBeInvestedNowActionPerformed

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
            java.util.logging.Logger.getLogger(Page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JButton HowMuchToBeInvestedNow;
    private javax.swing.JButton compoundedInterest;
    private javax.swing.JButton futureValueButton;
    private javax.swing.JButton howMuchShouldBecompounded;
    private javax.swing.JLabel infoLabel1;
    private javax.swing.JLabel infoLabel2;
    private javax.swing.JLabel infoLabel3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton simpleInterest;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
