/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luckydraw;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author mzj10
 */
public class lucky extends javax.swing.JFrame {

    int n1,n2,n3,n4;
    String s1,s2,s3,s4;
    Timer t;
    public lucky() {
        initComponents();
        
        setSize(600,740);
        jLabel2.setSize(511, 570);
        setLocationRelativeTo(null);
       jTextField1.setEditable(false);
       jTextField2.setEditable(false);
       jTextField3.setEditable(false);
       jTextField4.setEditable(false);
       jLabel4.setVisible(false);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("أبدأ");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(370, 360, 100, 100);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("توقف");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(110, 360, 100, 100);

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 0, 0));
        jTextField4.setText("0");
        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(290, 270, 30, 60);

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 0, 0));
        jTextField3.setText("0");
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(250, 270, 30, 60);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 0, 0));
        jTextField2.setText("0");
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(210, 270, 30, 60);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 0, 0));
        jTextField1.setText("0");
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(170, 270, 30, 60);

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("رقم الفائز");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 220, 110, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\mzj10\\Downloads\\lottery (1).png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 170, 510, 520);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("ATHAR FOUNDATION ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 60, 420, 60);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("مؤسسة أثر التنموية");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 20, 310, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/luckydraw/download.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(410, 10, 180, 220);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel6.setText("FOR DEVELOPMENT");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 100, 440, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 590, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      //Thread t = new Thread(100,this);
      
//     n1 = ThreadLocalRandom.current().nextInt(0, 2);
//     s1+=n1;
//      jTextField1.setText(s1);
//     n2 = ThreadLocalRandom.current().nextInt(0,10);
//     s2+=n2;
//     jTextField2.setText(s2);
//     n3 = ThreadLocalRandom.current().nextInt(0,10);
//     s3+=n3;
//     jTextField3.setText(s3);
//     n4 = ThreadLocalRandom.current().nextInt(0,10);
//     s4+=n4;
//     jTextField4.setText(s4);
     
      
      
      
      
//        for (int i = 1;i<=10;i++){
//           
//                
//                jTextField1.setText(Integer.toString(ThreadLocalRandom.current().nextInt(0, 2)));
//         if (jTextField1.getText().equals("1")){
//          jTextField2.setText(Integer.toString(ThreadLocalRandom.current().nextInt(0,6)));   
//         }else{
//             jTextField2.setText(Integer.toString(ThreadLocalRandom.current().nextInt(0,10)));
//         }
//         if (jTextField2.getText().equals("5")&&jTextField1.getText().equals("1")){
//           jTextField3.setText(Integer.toString(0));
//         jTextField4.setText(Integer.toString(0));
//         }
//         else{
//         jTextField3.setText(Integer.toString(ThreadLocalRandom.current().nextInt(0, 10)));
//         jTextField4.setText(Integer.toString(ThreadLocalRandom.current().nextInt(0, 10)));
//        
//          
//        }
//        }
           
           
           
           
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    jLabel4.setVisible(false);
        t = new Timer(10,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jTextField1.setForeground(Color.red);
        jTextField2.setForeground(Color.red);
        jTextField3.setForeground(Color.red);
        jTextField4.setForeground(Color.red);
        jTextField1.setText(s1="");
        jTextField2.setText(s2="");
        jTextField3.setText(s3="");
        jTextField4.setText(s4="");
        n1 = ThreadLocalRandom.current().nextInt(0, 2);
     s1+=n1;
      jTextField1.setText(s1);
      if (jTextField1.getText().equals("1")){
          n2 = ThreadLocalRandom.current().nextInt(0,6); 
        }else{
           n2 = ThreadLocalRandom.current().nextInt(0,10); 
       }
      
      
      
      
      if (n2 == 5&&jTextField1.getText().equals("1")){
         jTextField3.setText(Integer.toString(0));  
         jTextField4.setText(Integer.toString(0));
       }
       else{
       n3 = ThreadLocalRandom.current().nextInt(0,10);
       n4 = ThreadLocalRandom.current().nextInt(0,10);
      }
     s2+=n2;
     jTextField2.setText(s2);
     
     s3+=n3;
     jTextField3.setText(s3);
     
     s4+=n4;
     jTextField4.setText(s4);        
               repaint(); 
                
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
      t.start();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        t.stop();
         jLabel4.setVisible(true);
         
//         int num1 = Integer.parseInt(jTextField2.getText());
//         if (jTextField1.getText().equals("1")&& num1 >= 5 ){
//            
//        jTextField2.setText("5");
//        jTextField3.setText("0");
//        jTextField4.setText("0");
//         }
        jTextField1.setForeground(Color.green);
        jTextField2.setForeground(Color.green);
        jTextField3.setForeground(Color.green);
        jTextField4.setForeground(Color.green);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(lucky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lucky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lucky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lucky.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lucky().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
