/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.signin_systems;

import java.awt.Toolkit;

/**
 *
 * @author GAMING-PC
 */
public class WelcomeForm extends javax.swing.JFrame {

    /**
     * Creates new form WelcomeForm
     */
    public WelcomeForm() {
        
        
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
        txtPercent = new javax.swing.JLabel();
        txtLoading = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Mặp");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPercent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPercent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtPercent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1496.gif"))); // NOI18N
        txtPercent.setText("0 %");
        jPanel1.add(txtPercent, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 474, 100, 60));

        txtLoading.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLoading.setText("Loading...");
        jPanel1.add(txtLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 240, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jLabel2.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(960, 540));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        WelcomeForm sp = new WelcomeForm();
        sp.setVisible(true);
        
        try{
            for(int i=0; i<= 102; i++){
                Thread.sleep(100);
                
                sp.txtPercent.setText(i +"%");
                
                if(i == 10){
                    sp.txtLoading.setText("Khởi chạy Modules...");
                }
                
                if(i == 30){
                    sp.txtLoading.setText("Kết nối database...");
                }
                
                if(i == 50){
                    sp.txtLoading.setText("Kết nối thành công...");
                }
                if(i == 80){
                    sp.txtLoading.setText("Khởi chạy ứng dụng...");
                }
                
                
                if(i == 100){
                    sp.dispose();
                    LoginForm lg = new LoginForm();
                    lg.setVisible(true);
                }
                
            }
            
            
        }catch(Exception e){
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtLoading;
    private javax.swing.JLabel txtPercent;
    // End of variables declaration//GEN-END:variables
}
