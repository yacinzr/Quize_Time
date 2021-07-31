/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUIZE;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author NGSi
 */
public class QINFO extends javax.swing.JFrame {

    /**
     * Creates new form QMEDCIN
     */
    public QINFO() {

        initComponents();
          setResizable(false);
        ArrayList<Integer> num  = new ArrayList<Integer>();
        
      for( int i=1;i<7;i++)
      {
             num.add(i);
      }
      Random ran = new Random();
       int indiceAuHasard =(int) (Math.random() * (num.size() ));
      switch (indiceAuHasard){
            case 1:
               jLabel1.setText("IIIIIIIIIIIIIIIIIII");
                   this.jRadioButton2.setText("oui");
                   this.jRadioButton3.setText("oui");
                   this.jRadioButton1.setText("oui");
                   num.remove(indiceAuHasard);
                
                   break;
            case 2:
               this. jLabel1.setText("QUI a CREER GOOGLE ");
                   this.jRadioButton2.setText("oui");
                   this.jRadioButton3.setText("oui");
                   this.jRadioButton1.setText("oui");
                   num.remove(indiceAuHasard);
                   break;
            case 3:
               this. jLabel1.setText("QUI A MARQUER CONTRE SAN CAN ");
                   this.jRadioButton2.setText("oui");
                   this.jRadioButton3.setText("oui");
                   this.jRadioButton1.setText("oui");
                   num.remove(indiceAuHasard);
                    break;
            case 4:
                this.jLabel1.setText("QUI A OVRI LA PORTE");
                   this.jRadioButton2.setText("oui");
                   this.jRadioButton3.setText("oui");
                   this.jRadioButton1.setText("oui");
                   num.remove(indiceAuHasard);
                    break;
            case 5:
                this.jLabel1.setText("Q1:Internet esu un réseaux");
                   this.jRadioButton2.setText("oui");
                   this.jRadioButton3.setText("oui");
                   this.jRadioButton1.setText("oui");
                   num.remove(indiceAuHasard);
                    break; 
            default:
                this.jLabel1.setText("Q1:Internet esu un réseaux");
                   this.jRadioButton2.setText("oui");
                   this.jRadioButton3.setText("oui");
                   this.jRadioButton1.setText("oui");
                   num.remove(indiceAuHasard);
                    break;
        }
       Random rann = new Random();
       int indiceAuHasard2 =(int) (Math.random() * (num.size() ));
             switch (indiceAuHasard2){
             case 1:
                this.jLabel3.setText("IIIIIIIIIIIIIIIIIII");
                   this.jRadioButton7.setText("oui");
                   this.jRadioButton6.setText("oui");
                   this.jRadioButton4.setText("oui");
                   num.remove(indiceAuHasard2);
                   break;
            case 2:
               this.jLabel3.setText("Q1:Internet esu un réseaux");
                   this.jRadioButton7.setText("oui");
                   this.jRadioButton6.setText("oui");
                   this.jRadioButton4.setText("oui");
                   num.remove(indiceAuHasard2);
                   break;
            case 3:
               this.jLabel3.setText("Q1:Internet esu un réseaux");
                   this.jRadioButton7.setText("oui");
                   this.jRadioButton6.setText("oui");
                   this.jRadioButton4.setText("oui");
                   num.remove(indiceAuHasard2);
                    break;
            case 4:
                this.jLabel3.setText("QUI A OVRI LA PORTE");
                   this.jRadioButton7.setText("oui");
                   this.jRadioButton6.setText("oui");
                   this.jRadioButton4.setText("oui");
                   num.remove(indiceAuHasard2);
                    break;
            case 5:
                this.jLabel3.setText("Q1:Internet esu un réseaux");
                   this.jRadioButton7.setText("oui");
                   this.jRadioButton6.setText("oui");
                   this.jRadioButton4.setText("oui");
                   num.remove(indiceAuHasard2);
                    break; 
            default:
                this.jLabel3.setText("Q1:Internet esu un réseaux");
                   this.jRadioButton7.setText("oui");
                   this.jRadioButton6.setText("oui");
                   this.jRadioButton4.setText("oui");
                   num.remove(indiceAuHasard2);
                    break;
        }
      Random rane= new Random();
       int indiceAuHasard3 =(int) (Math.random() * (num.size() ));
             switch (indiceAuHasard3){
     case 1:
                this.jLabel4.setText("IIIIIIIIIIIIIIIIIII");
                   this.jRadioButton8.setText("FRance");
                   this.jRadioButton9.setText("BELGIQUE");
                   this.jRadioButton5.setText("CANADA");
                   num.remove(indiceAuHasard3);
                   break;
            case 2:
               this.jLabel4.setText("QUI a CREER GOOGLE ");
                   this.jRadioButton8.setText("YACINE");
                   this.jRadioButton9.setText("ZERIKAT");
                   this.jRadioButton5.setText("IHAB");
                   num.remove(indiceAuHasard3);
                   break;
            case 3:
               this.jLabel4.setText("QUI A MARQUER CONTRE SAN CAN ");
                   this.jRadioButton8.setText("HAMI ");
                   this.jRadioButton9.setText("KADIRO");
                   this.jRadioButton5.setText("MNANOK");
                   num.remove(indiceAuHasard3);
                    break;
            case 4:
                this.jLabel4.setText("QUI A OVRI LA PORTE");
                   this.jRadioButton8.setText("ANA ");
                   this.jRadioButton9.setText("HOMA");
                   this.jRadioButton5.setText("MASHI HNA");
                   num.remove(indiceAuHasard3);
                    break;
            case 5:
                this.jLabel4.setText("Q1:Internet esu un réseaux");
                   this.jRadioButton8.setText("oui");
                   this.jRadioButton9.setText("oui");
                   this.jRadioButton5.setText("oui");
               
                   num.remove(indiceAuHasard3);
                    break; 
            default:
                this.jLabel4.setText("JBVBLKBVLL");
                   this.jRadioButton8.setText("ouVJLLVi");
                   this.jRadioButton9.setText("oui");
                   this.jRadioButton5.setText("ouVSJVLVi");
                   num.remove(indiceAuHasard3);
                    break;
      
             }
      
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.setForeground(new java.awt.Color(51, 0, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 180, 430, 30);

        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(30, 140, 240, 21);

        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(30, 80, 240, 21);

        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(30, 110, 240, 21);

        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(20, 280, 150, 21);

        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton5);
        jRadioButton5.setBounds(10, 430, 150, 21);

        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton6);
        jRadioButton6.setBounds(20, 250, 150, 21);

        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton7);
        jRadioButton7.setBounds(20, 220, 150, 21);

        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton8);
        jRadioButton8.setBounds(10, 370, 150, 21);

        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton9);
        jRadioButton9.setBounds(10, 400, 150, 21);

        jButton1.setText("Précedent");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 463, 110, 30);

        jButton2.setText("Suivant");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(680, 463, 110, 30);

        jPanel5.setBackground(new java.awt.Color(51, 0, 204));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(10, 330, 290, 30);

        jPanel4.setBackground(new java.awt.Color(0, 0, 204));
        jPanel4.setForeground(new java.awt.Color(51, 0, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 30, 370, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/innfo.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 500);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(40, 370, 460, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int score;
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        score++;
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
     score++;
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
         score++;
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        lesoptions s = new lesoptions();
s.setVisible(Boolean.TRUE);
this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          Resultat s = new Resultat();
s.setVisible(Boolean.TRUE);
this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(QINFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QINFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QINFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QINFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QINFO().setVisible(true);
             
            }

            private Object QINFO() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}
