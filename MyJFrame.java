
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amayes
 */
public class MyJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MyJFrame
     */
    public MyJFrame() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Veuillez insérer votre Nom :");

        jLabel2.setText("Veuillez insérer votre Prénom :");

        jLabel3.setText("Veuillez Insérer votre Date de Naissance sous le format jj/mm/aa :");

        jLabel4.setText("Veuillez insérer le nombre d'enfants mineurs (-18 ans ) : ");

        jLabel5.setText("Veuillez Insérer le nombre de jours d'arret de travail");

        jLabel7.setText("Occupez-vous un poste administratif ? si oui préciser : ");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton1.setText("Calculer le Salaire");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (SaisieErroneeException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });

        jLabel6.setText("Salaire");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField7)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField4))))
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws SaisieErroneeException  {//GEN-FIRST:event_jButton1ActionPerformed
        class Person {
            private String FirstName ; 
            private String LastName ; 
            private String Date; 
            private int ChildrenNumber ; 
            
            public void setFirstName(String firstName) {
                FirstName = firstName;
            }
        
            public void setLastName(String lastName) {
                LastName = lastName;
            }
        
            public void setDate(String date) {
                Date = date;
            }
        
            public void setChildrenNumber(int childrenNumber) {
                ChildrenNumber = childrenNumber;
            }
        
            public String getFirstName() {
                return FirstName;
            }
        
            public String getLastName() {
                return LastName;
            }
        
            public String getDate() {
                return Date;
            }
        
            public int getChildrenNumber() {
                return ChildrenNumber;
            }
        
        } 
        
        class Employer extends Person {
        
            private String Function ; 
            private int DayOff ; 
            private double netSalary ; 
        
            public void setFunction(String function) {
                Function = function;
            }
        
            public void setDayOff(int dayOff) {
                DayOff = dayOff;
            }
        
            public void setNetSalary(double netSalary) {
                this.netSalary = netSalary;
            }
        
            public String getFunction() {
                return Function;
            }
        
            public int getDayOff() {
                return DayOff;
            }
        
            public double getNetSalary() {
                return netSalary;
            }
        
            public void netSalary(Employer E) {
                String C = "Chef de Bureau " ; 
                String D = "Chef de Service" ; 
                String J = "Employer" ; 
                double primes1 = 0 ;
                double primes2 = 0 ; 
                double retenues = 0 ; 
                double Socialsecurity = 0.07*E.netSalary ; 
                double p1 = 0.02 ; 
                double p2 = 0.03 ; 
        
          
        
                if (E.getFunction().equals(C) == true ) {
                    primes2 += E.getNetSalary()*p1 ; 
                }
        
                if (E.getFunction().equals(D) == true ) {
                    primes2 += E.getNetSalary()*p2 ; 
        
                }
        
                if (E.getFunction().equals(J) == true ) {
                    primes2 += 0 ; 
        
                }
        
        
        
        
             for (int i = 0 ; i < E.getChildrenNumber() ; i++) {
                 if (E.getChildrenNumber() == 0) {
                     primes1 = 0 ; 
                 } else { 
                 primes1 += 300 ; 
        
                }
        
                 
        
             }
             
             for (int j = 0 ; j<E.DayOff ; j++) {
                  retenues += 100 ; 
                 }
             
            
             E.netSalary += primes1 + primes2 - retenues - Socialsecurity; 
        
            System.out.println("Votre Salaire est : "+E.getNetSalary()+ "DA");
        
                }
        
             
            }

        String C = "Chef de Service" ; 
        String D = "Chef de Bureau" ; 
        String J = "Employer" ; 
        
        


        Employer E = new Employer() ; 

        
        E.setNetSalary(20000);

      
        E.setLastName(jTextField1.getText());


        if (E.getLastName().isEmpty()== true ) {
            JOptionPane.showMessageDialog(null, "Champ Nom Vide  ", "Erreur ", JOptionPane.INFORMATION_MESSAGE);
            throw new SaisieErroneeException() ; 

            

        }

        if (E.getLastName().getClass().getSimpleName() == "String") {
            JOptionPane.showMessageDialog(null, "Veuillez Insérer des Caractères dans le champ Nom", "Erreur ", JOptionPane.INFORMATION_MESSAGE);
            throw new SaisieErroneeException("Veuillez insérer des caractères") ; 
        }



        E.setFirstName(jTextField2.getText());


        if (E.getFirstName().isEmpty()== true ) {
            JOptionPane.showMessageDialog(null, "Champ Nom vide ", "Erreur ", JOptionPane.INFORMATION_MESSAGE);
            throw new SaisieErroneeException() ; 

            

        }

        if (E.getFirstName().getClass().getSimpleName() == "String") {
            JOptionPane.showMessageDialog(null, "Veuillez Insérer des Caractères dans le champ Prénom ", "Erreur ", JOptionPane.INFORMATION_MESSAGE);
            throw new SaisieErroneeException("Veuillez insérer des caractères") ; 
        }
        

        E.setDate(jTextField3.getText());

        if (E.getDate().isEmpty()== true ) {
            JOptionPane.showMessageDialog(null, "Champ Date vide ", "Erreur ", JOptionPane.INFORMATION_MESSAGE);
            throw new SaisieErroneeException() ; 

        
        }


        if (E.getDate().getClass().getSimpleName() == "Integer") {
            JOptionPane.showMessageDialog(null, "Veuillez insérer la date sous le format jj/mm/aa ", "Erreur ", JOptionPane.INFORMATION_MESSAGE);
            throw new SaisieErroneeException("Veuillez insérer sous le format jj/mm/aa") ; 
        }

        if (E.getDate().indexOf("/") != 2 || E.getDate().lastIndexOf("/") != 5 ) {  
            JOptionPane.showMessageDialog(null, "Veuillez insérer sous le format jj/mm/aa ", "Erreur ", JOptionPane.INFORMATION_MESSAGE);
            throw new SaisieErroneeException("Veuillez insérer sous le format jj/mm/aa") ; 
        } 
        
        
        try {

           int i = Integer.valueOf(jTextField4.getText()) ; 
           E.setChildrenNumber(i);
         

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Veuillez insérer des nombres entiers dans le champs nombre d'enfants  ", "Erreur ", JOptionPane.INFORMATION_MESSAGE);
            throw new NumberFormatException("Veuillez insérer des nombres entiers " ) ; 
        }

      
         try {

            int j = Integer.valueOf(jTextField5.getText()); 
            E.setDayOff(j);
            

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Veuillez insérer des nombres entiers dans le champs nombre de retenues  ", "Erreur ", JOptionPane.INFORMATION_MESSAGE);
            throw new NumberFormatException("Veuillez insérer des nombres entiers " ) ; 
        }

         
        
        
        E.setFunction(jTextField6.getText()) ; 
        
         if (E.getFunction().isEmpty()== true ) {
            JOptionPane.showMessageDialog(null, "Champ Fonction vide ", "Erreur ", JOptionPane.INFORMATION_MESSAGE);
            throw new SaisieErroneeException() ; 

            

        }

        if (E.getFunction().getClass().getSimpleName() == "Integer") {
            JOptionPane.showMessageDialog(null, "Veuillez Insérer des Caractères ", "Erreur ", JOptionPane.INFORMATION_MESSAGE);
            throw new SaisieErroneeException("Veuillez insérer des caractères") ; 
        }
        
        if (E.getFunction().equals(C) == false && E.getFunction().equals(D) == false  && E.getFunction().equals(J) == false  ){
            JOptionPane.showMessageDialog(null, "Veuillez choisir entre Chef de Service , Chef de Bureau et Employer   ", "Erreur ", JOptionPane.INFORMATION_MESSAGE);
            throw new SaisieErroneeException("Veuillez choisir entre Chef de Service , Chef de Bureau et Employer  ") ; 
        }
        
        
        E.netSalary(E);
                    
        String str = String.valueOf(E.getNetSalary()) ; 
        jTextField7.setText(str); 
        
        System.out.println(jTextField1.getText());
        System.out.println(jTextField2.getText());
        System.out.println(jTextField3.getText());
        System.out.println(jTextField4.getText());
        System.out.println(jTextField5.getText());
        System.out.println(jTextField6.getText()); 
        System.out.println(jTextField7.getText());
    
        

    
        
    
        
        
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

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
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}