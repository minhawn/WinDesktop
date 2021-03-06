/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Won_WinDesktop;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager2;
import java.awt.event.ActionListener;

/**
 *
 * @author Minhawn
 */
public class Won_WinDesktopView extends javax.swing.JFrame {

    Won_WinDesktopController wcontroller;
    Won_WinDesktopModel wmodel;
    /**
     * Creates new form Won_WinDesktopView
     */
    public Won_WinDesktopView() {
        initComponents();
        this.getContentPane().setBackground(new Color(0,128,128));
    }

      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop_d = new javax.swing.JDesktopPane();
        rgb_button = new javax.swing.JButton();
        rgb_label = new javax.swing.JLabel();
        C_button = new javax.swing.JButton();
        drive_label = new javax.swing.JLabel();
        notepad_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        hydra_button = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("John Won Project 3");
        setBackground(new java.awt.Color(0, 128, 128));
        setName("desktop"); // NOI18N

        desktop_d.setBackground(new java.awt.Color(0, 128, 128));

        rgb_button.setBackground(new java.awt.Color(0, 128, 128));
        rgb_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Won_WinDesktop/rgb_32x32.png"))); // NOI18N
        rgb_button.setBorder(null);
        rgb_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgb_buttonActionPerformed(evt);
            }
        });

        rgb_label.setBackground(new java.awt.Color(0, 128, 128));
        rgb_label.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        rgb_label.setForeground(new java.awt.Color(255, 255, 255));
        rgb_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rgb_label.setText("RGB Color Editor");

        C_button.setBackground(new java.awt.Color(0, 128, 128));
        C_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Won_WinDesktop/doc_32x32.png"))); // NOI18N
        C_button.setBorder(null);
        C_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_buttonActionPerformed(evt);
            }
        });

        drive_label.setBackground(new java.awt.Color(0, 128, 128));
        drive_label.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        drive_label.setForeground(new java.awt.Color(255, 255, 255));
        drive_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        drive_label.setText("File Browser");

        notepad_button.setBackground(new java.awt.Color(0, 128, 128));
        notepad_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Won_WinDesktop/notepad_2_32x32.png"))); // NOI18N
        notepad_button.setBorder(null);

        jLabel1.setBackground(new java.awt.Color(0, 128, 128));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Textpad");

        hydra_button.setBackground(new java.awt.Color(0, 128, 128));
        hydra_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Won_WinDesktop/hydra_32x32.png"))); // NOI18N
        hydra_button.setToolTipText("");
        hydra_button.setBorder(null);
        hydra_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hydra_buttonActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 128, 128));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SlayHydra.exe");

        javax.swing.GroupLayout desktop_dLayout = new javax.swing.GroupLayout(desktop_d);
        desktop_d.setLayout(desktop_dLayout);
        desktop_dLayout.setHorizontalGroup(
            desktop_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktop_dLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(desktop_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rgb_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(C_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(notepad_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hydra_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rgb_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(drive_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(1115, Short.MAX_VALUE))
        );
        desktop_dLayout.setVerticalGroup(
            desktop_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktop_dLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rgb_button, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rgb_label)
                .addGap(5, 5, 5)
                .addComponent(C_button, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drive_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notepad_button, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hydra_button, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(0, 338, Short.MAX_VALUE))
        );
        desktop_d.setLayer(rgb_button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop_d.setLayer(rgb_label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop_d.setLayer(C_button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop_d.setLayer(drive_label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop_d.setLayer(notepad_button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop_d.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop_d.setLayer(hydra_button, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop_d.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop_d, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1219, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop_d, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hydra_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hydra_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hydra_buttonActionPerformed

    private void rgb_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgb_buttonActionPerformed
    }//GEN-LAST:event_rgb_buttonActionPerformed

    private void C_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_buttonActionPerformed
    }//GEN-LAST:event_C_buttonActionPerformed

    void addMyCompAct(ActionListener my_comp)
    {
        rgb_button.addActionListener(my_comp);
    }
    
   
    
    void addMyDriveAct(ActionListener my_drive)
    {
        C_button.addActionListener(my_drive);
    }
    

    
    void addMyTextpadAct(ActionListener my_txtpad)
    {
        notepad_button.addActionListener(my_txtpad);
    }
    void addMyHydraAct(ActionListener my_hydra)
    {
        hydra_button.addActionListener(my_hydra);
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton C_button;
    public javax.swing.JDesktopPane desktop_d;
    private javax.swing.JLabel drive_label;
    public javax.swing.JButton hydra_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JButton notepad_button;
    public javax.swing.JButton rgb_button;
    private javax.swing.JLabel rgb_label;
    // End of variables declaration//GEN-END:variables
}
