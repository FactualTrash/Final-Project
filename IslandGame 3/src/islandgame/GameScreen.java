/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package islandgame;

/**
 *
 * @author Rowan
 */
public class GameScreen extends javax.swing.JFrame {

    public static int day = 0;
    public static int job = JobSelectScreen.job;
    /**
     * Creates new form GameScreen
     */
    public GameScreen() {
        this.Steve = new Character ("Steve", 5, 5);
      
        initComponents();   
    }

    GameScreen(Intro aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnShelter = new javax.swing.JButton();
        btnHunt = new javax.swing.JButton();
        btnWater = new javax.swing.JButton();
        btnSleep = new javax.swing.JButton();
        lblActions = new javax.swing.JLabel();
        btnInventory = new javax.swing.JButton();
        btnHuntBear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblOutput = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnShelter.setText("Build a Shelter");
        btnShelter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShelterActionPerformed(evt);
            }
        });

        btnHunt.setText("Hunt for food");
        btnHunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuntActionPerformed(evt);
            }
        });

        btnWater.setText("Get Water");
        btnWater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWaterActionPerformed(evt);
            }
        });

        btnSleep.setText("Sleep");
        btnSleep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSleepActionPerformed(evt);
            }
        });

        lblActions.setText("What do you want to do?");

        btnInventory.setText("Check Inventory");
        btnInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryActionPerformed(evt);
            }
        });

        btnHuntBear.setText("Hunt  a Bear");
        btnHuntBear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuntBearActionPerformed(evt);
            }
        });

        lblOutput.setEditable(false);
        lblOutput.setBackground(new java.awt.Color(153, 153, 153));
        lblOutput.setColumns(20);
        lblOutput.setFont(new java.awt.Font("Synchro LET", 0, 18)); // NOI18N
        lblOutput.setRows(3);
        lblOutput.setAutoscrolls(false);
        lblOutput.setCursor(null);
        jScrollPane1.setViewportView(lblOutput);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/islandgame/Background layers/IslandGame_Day_Background.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(btnInventory)
                        .addGap(149, 149, 149)
                        .addComponent(btnSleep, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(358, 358, 358)
                                .addComponent(lblActions)
                                .addGap(74, 74, 74))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(btnHunt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnWater, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHuntBear, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(btnShelter))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 69, Short.MAX_VALUE)
                .addComponent(background)
                .addContainerGap(232, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblActions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHunt)
                    .addComponent(btnWater)
                    .addComponent(btnShelter)
                    .addComponent(btnHuntBear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInventory)
                    .addComponent(btnSleep))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Character Steve;
    
    private void btnHuntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuntActionPerformed
        Steve.hunt();
    }//GEN-LAST:event_btnHuntActionPerformed

    private void btnWaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWaterActionPerformed
        Steve.fillWater();
    }//GEN-LAST:event_btnWaterActionPerformed

    private void btnSleepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSleepActionPerformed
        day = Steve.sleep(day);
    }//GEN-LAST:event_btnSleepActionPerformed

    private void btnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryActionPerformed
        int food = Steve.getFood();
        int water = Steve.getWater();
        boolean shelter = Steve.checkShelter();
        
        lblOutput.append("You have " + food + "days of food"
                     + "\n You have " + water+ "days of water");
        
        if (shelter == true) {
           lblOutput.append("You have a sturdy shelter"); 
        }
        else {
           lblOutput.append("You have no shelter, how uncomfortable");
        }
        
    }//GEN-LAST:event_btnInventoryActionPerformed

    private void btnHuntBearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuntBearActionPerformed
        Steve.huntBear(job, day);
    }//GEN-LAST:event_btnHuntBearActionPerformed

    private void btnShelterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShelterActionPerformed
        Steve.buildShelter();
    }//GEN-LAST:event_btnShelterActionPerformed

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
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnHunt;
    private javax.swing.JButton btnHuntBear;
    private javax.swing.JButton btnInventory;
    private javax.swing.JButton btnShelter;
    private javax.swing.JButton btnSleep;
    private javax.swing.JButton btnWater;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblActions;
    private javax.swing.JTextArea lblOutput;
    // End of variables declaration//GEN-END:variables
}