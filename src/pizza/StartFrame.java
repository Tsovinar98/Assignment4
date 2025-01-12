/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author Anonymous
 */
public class StartFrame extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    private PizzaParlor parlor;
    Customer currentCustomer;
    
    public StartFrame() {
        initComponents();
    }

    StartFrame(PizzaParlor parlor) {
        this.parlor = parlor;
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

        jLoginDialog = new javax.swing.JDialog();
        jUsernameLabel = new javax.swing.JLabel();
        jPasswordLabel = new javax.swing.JLabel();
        jUsernameText = new javax.swing.JTextField();
        jPasswordText = new javax.swing.JPasswordField();
        jLLoginButton = new javax.swing.JButton();
        jFeedbackLabel = new javax.swing.JLabel();
        jSignUpDialog = new javax.swing.JDialog();
        jsUsernameLabel = new javax.swing.JLabel();
        jsEmailLabel = new javax.swing.JLabel();
        jsPasswordLabel = new javax.swing.JLabel();
        jsUsernameText = new javax.swing.JTextField();
        jsPasswordText = new javax.swing.JTextField();
        jsEmailText = new javax.swing.JTextField();
        jsSignUpButton = new javax.swing.JButton();
        jsFeedbackLabel = new javax.swing.JLabel();
        jLoginButton = new javax.swing.JButton();
        jSignUpButton = new javax.swing.JButton();
        jLogoLabel = new javax.swing.JLabel();

        jUsernameLabel.setText("Username:");

        jPasswordLabel.setText("Password:");

        jUsernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsernameTextActionPerformed(evt);
            }
        });

        jPasswordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordTextActionPerformed(evt);
            }
        });

        jLLoginButton.setText("Login");
        jLLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLLoginButtonActionPerformed(evt);
            }
        });

        jFeedbackLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jLoginDialogLayout = new javax.swing.GroupLayout(jLoginDialog.getContentPane());
        jLoginDialog.getContentPane().setLayout(jLoginDialogLayout);
        jLoginDialogLayout.setHorizontalGroup(
            jLoginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFeedbackLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLoginDialogLayout.createSequentialGroup()
                .addGroup(jLoginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLoginDialogLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLLoginButton))
                    .addGroup(jLoginDialogLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jLoginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jUsernameLabel)
                            .addComponent(jPasswordLabel))
                        .addGap(29, 29, 29)
                        .addGroup(jLoginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jUsernameText, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(jPasswordText))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jLoginDialogLayout.setVerticalGroup(
            jLoginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLoginDialogLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jLoginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUsernameLabel)
                    .addComponent(jUsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLoginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordLabel)
                    .addComponent(jPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFeedbackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLLoginButton)
                .addContainerGap())
        );

        jsUsernameLabel.setText("Username:");

        jsEmailLabel.setText("Email:");

        jsPasswordLabel.setText("Password:");

        jsSignUpButton.setText("Sign Up");
        jsSignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsSignUpButtonActionPerformed(evt);
            }
        });

        jsFeedbackLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jsFeedbackLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jSignUpDialogLayout = new javax.swing.GroupLayout(jSignUpDialog.getContentPane());
        jSignUpDialog.getContentPane().setLayout(jSignUpDialogLayout);
        jSignUpDialogLayout.setHorizontalGroup(
            jSignUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSignUpDialogLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jSignUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsUsernameLabel)
                    .addComponent(jsPasswordLabel)
                    .addComponent(jsEmailLabel))
                .addGap(18, 18, 18)
                .addGroup(jSignUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsSignUpButton)
                    .addGroup(jSignUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jsUsernameText, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addComponent(jsPasswordText, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jsEmailText, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(jSignUpDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jsFeedbackLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jSignUpDialogLayout.setVerticalGroup(
            jSignUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSignUpDialogLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jSignUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsUsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsUsernameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jSignUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsPasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jSignUpDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsEmailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jsFeedbackLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsSignUpButton)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 255, 0));
        setForeground(new java.awt.Color(102, 255, 102));
        setResizable(false);

        jLoginButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLoginButton.setText("Login");
        jLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginButtonActionPerformed(evt);
            }
        });

        jSignUpButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jSignUpButton.setText("Sign Up");
        jSignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSignUpButtonActionPerformed(evt);
            }
        });

        jLogoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza/ebonini.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSignUpButton))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLogoLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLoginButton)
                .addGap(44, 44, 44)
                .addComponent(jSignUpButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginButtonActionPerformed
        jLoginDialog.pack();
        jLoginDialog.setVisible(true);
    }//GEN-LAST:event_jLoginButtonActionPerformed

    private void jSignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSignUpButtonActionPerformed
        jSignUpDialog.pack();
        jSignUpDialog.setVisible(true);
        
    }//GEN-LAST:event_jSignUpButtonActionPerformed

    private void jUsernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jUsernameTextActionPerformed

    private void jLLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLLoginButtonActionPerformed
        // TODO add your handling code here:
        Customer temp = parlor.validateLogin(jUsernameText.getText().toString(), jPasswordText.getText().toString());
        if(temp == null){
            jFeedbackLabel.setForeground(Color.red);
            jFeedbackLabel.setText("Customer not found!");
        }else{
            currentCustomer = temp;
            jFeedbackLabel.setForeground(Color.blue);
            jFeedbackLabel.setText("Welcome back, " + currentCustomer.getUsername() + "!");
            DashboardFrame frame = new DashboardFrame(parlor, currentCustomer);
            frame.pack();
            frame.setVisible(true);
            jLoginDialog.dispose();
        }
    }//GEN-LAST:event_jLLoginButtonActionPerformed

    private void jsSignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsSignUpButtonActionPerformed
        // TODO add your handling code here:
        String user = jsUsernameText.getText().toString();
        String pass = jsPasswordText.getText().toString();
        String email = jsEmailText.getText().toString();
        Customer temp = parlor.signUp(user,pass,email);
        if(temp == null){
            jsFeedbackLabel.setText("Error!");
        }else{
            currentCustomer = temp;
            DashboardFrame frame = new DashboardFrame(parlor, currentCustomer);
            jSignUpDialog.dispose();
        }
    }//GEN-LAST:event_jsSignUpButtonActionPerformed

    private void jPasswordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jFeedbackLabel;
    private javax.swing.JButton jLLoginButton;
    private javax.swing.JButton jLoginButton;
    private javax.swing.JDialog jLoginDialog;
    private javax.swing.JLabel jLogoLabel;
    private javax.swing.JLabel jPasswordLabel;
    private javax.swing.JPasswordField jPasswordText;
    private javax.swing.JButton jSignUpButton;
    private javax.swing.JDialog jSignUpDialog;
    private javax.swing.JLabel jUsernameLabel;
    private javax.swing.JTextField jUsernameText;
    private javax.swing.JLabel jsEmailLabel;
    private javax.swing.JTextField jsEmailText;
    private javax.swing.JLabel jsFeedbackLabel;
    private javax.swing.JLabel jsPasswordLabel;
    private javax.swing.JTextField jsPasswordText;
    private javax.swing.JButton jsSignUpButton;
    private javax.swing.JLabel jsUsernameLabel;
    private javax.swing.JTextField jsUsernameText;
    // End of variables declaration//GEN-END:variables
}
