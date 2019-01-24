/*
 * Kaia Mac
 * Culminating project
 * 2018-2019
 */

/**
 *
 * @author kamac8665
 */
public class Page2 extends javax.swing.JFrame {

    /**
     * Creates new form Page2
     */
    public Page2() {
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

        BackgroundPanel = new javax.swing.JPanel();
        infoLabel = new javax.swing.JLabel();
        infoLabel2 = new javax.swing.JLabel();
        userInputr = new javax.swing.JTextField();
        infoLabel3 = new javax.swing.JLabel();
        userInputt = new javax.swing.JTextField();
        infoLabel4 = new javax.swing.JLabel();
        userInputf = new javax.swing.JTextField();
        infoLabel5 = new javax.swing.JLabel();
        userInputR = new javax.swing.JTextField();
        outputLabel = new javax.swing.JLabel();
        enterButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BackgroundPanel.setBackground(new java.awt.Color(204, 255, 255));

        infoLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        infoLabel.setText("Enter the following Information and we will calculate the future value:");

        infoLabel2.setText("Advertised annual interest rate(%):");

        infoLabel3.setText("Term/Time in years:");

        infoLabel4.setText("Frequency(Number of payments per year):");

        infoLabel5.setText("Regular payment ($):");

        outputLabel.setText("---");

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoLabel3)
                            .addComponent(infoLabel2)
                            .addComponent(infoLabel4)
                            .addComponent(infoLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userInputr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userInputt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userInputf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userInputR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundPanelLayout.createSequentialGroup()
                        .addComponent(outputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(149, 149, 149)
                        .addComponent(enterButton)))
                .addContainerGap())
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BackgroundPanelLayout.createSequentialGroup()
                        .addComponent(infoLabel)
                        .addGap(32, 32, 32)
                        .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userInputr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infoLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userInputt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infoLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userInputf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infoLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(infoLabel5)
                            .addComponent(userInputR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(enterButton))
                    .addComponent(outputLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(backButton)
                .addContainerGap())
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

    /**
     * This method calculates the future value of compounded interest
     */
    public static double futureValue (double FV,double r,double R,double f,double t,double i,double n, double numerator, double orignum){
        
        //FV  = R((1+i)^n -1)
        //           i

        //converts the percentage as a decimal
        r = r / 100;
        
        //calculates the interest(i) and amount of payments(n)
        i = r/f;
        n = t*f;
        
        //calculates the value of the numerator of the equation
        numerator = 1 + i;
        
        orignum = numerator;
        
        int l = 1;
        
        //calculates the numerator t the power of n
        while (l <= n)
        {
            numerator = numerator * orignum;
            l = l + 1;
        }
        
        numerator = numerator - 1;
        numerator = numerator * R;
        FV = numerator / i;
        
        //rounds the future value to the nearest tenth
        FV = FV * 100;
        FV = Math.round(FV);
        FV = FV / 100;
        
        //return the value back
        return FV;
    }
    
    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        
        //initializing variables
        double r; //r = advertised annual interest rate
        double R; //R = Regular payment
        double f; //Frequency of regular payments per year
        double t; //Length of investment in years
        double i; //interest per frequency
        double n; //total number of payments
        double FV;//future value
        double numerator;
        double orignum;
        
        try{
            
            r = Double.parseDouble(userInputr.getText());
            R = Double.parseDouble(userInputR.getText());
            f = Double.parseDouble(userInputf.getText());
            t = Double.parseDouble(userInputt.getText());
            
            i = 0;
            n = 0;
            FV = 0;
            numerator = 0;
            orignum = 0;
            
            outputLabel.setText("" + futureValue(FV, r, R, f, t, i, n, numerator, orignum));
            
        }catch (NumberFormatException nfe){
            
            outputLabel.setText("That is an invalid number.");
            System.out.println("Exception: " + nfe);
            
        }
        
    }//GEN-LAST:event_enterButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        //this code programs the project to switch from page 2 to page 1
        this.setVisible(false);
        Page1 p = new Page1();
        p.setVisible(true); 
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton enterButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel infoLabel2;
    private javax.swing.JLabel infoLabel3;
    private javax.swing.JLabel infoLabel4;
    private javax.swing.JLabel infoLabel5;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JTextField userInputR;
    private javax.swing.JTextField userInputf;
    private javax.swing.JTextField userInputr;
    private javax.swing.JTextField userInputt;
    // End of variables declaration//GEN-END:variables
}
