/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package islandgame;

/**
 *
 * @author steph
 */
public class SecondScreen extends javax.swing.JFrame {
    TitleScreen firstWindow;
    int job;
    /**
     * Creates new form SecondScreen
     */
    public SecondScreen() {
        initComponents();
    }
    private Intro introScreen;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnJob1 = new javax.swing.JButton();
        btnJob2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 928, 793));
        setMaximumSize(new java.awt.Dimension(928, 637));
        setMinimumSize(new java.awt.Dimension(928, 637));
        setPreferredSize(new java.awt.Dimension(928, 637));
        setResizable(false);
        setSize(new java.awt.Dimension(928, 637));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, -1, -1));

        btnJob1.setText("This One!");
        btnJob1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJob1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        btnJob2.setText("This One!");
        btnJob2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJob2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJob2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        firstWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnJob1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJob1ActionPerformed
        //Check if the Intro JFrame has been created
        if (introScreen == null){
            introScreen = new Intro(this);
        }
        //Make it visible
        introScreen.setVisible(true);
        //Hide this one
        this.setVisible(false);
        job = 0;
    }//GEN-LAST:event_btnJob1ActionPerformed

    private void btnJob2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJob2ActionPerformed
        //Check if the Intro JFrame has been created
        if (introScreen == null){
            introScreen = new Intro(this);
        }
        //Make it visible
        introScreen.setVisible(true);
        //Hide this one
        this.setVisible(false);
        job = 1;
    }//GEN-LAST:event_btnJob2ActionPerformed

    /**
     * @param m
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJob1;
    private javax.swing.JButton btnJob2;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
    public SecondScreen(TitleScreen m){
        initComponents();
        firstWindow = m;
    }
}