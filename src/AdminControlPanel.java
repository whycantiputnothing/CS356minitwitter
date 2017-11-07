/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandon-PC
 */
public class AdminControlPanel extends javax.swing.JFrame {
    private UserGroupManager userGroupManager;
    /**
     * Creates new form AdminControlPanel
     */
    public AdminControlPanel() {
        initComponents();
        userGroupManager = new UserGroupManager();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        TextUserID = new javax.swing.JTextField();
        textGroupID = new javax.swing.JTextField();
        bAddUser = new javax.swing.JButton();
        bAddGroup = new javax.swing.JButton();
        bOpenUserView = new javax.swing.JButton();
        bShowUserTotal = new javax.swing.JButton();
        bShowMessagesTotal = new javax.swing.JButton();
        bShowGroupTotal = new javax.swing.JButton();
        bShowPositivePercentage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Control Panel");

        jScrollPane1.setViewportView(jTree1);

        TextUserID.setText("User ID");
        TextUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUserIDActionPerformed(evt);
            }
        });

        textGroupID.setText("Group ID");
        textGroupID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textGroupIDActionPerformed(evt);
            }
        });

        bAddUser.setText("Add User");

        bAddGroup.setText("Add Group");

        bOpenUserView.setText("Open User View");
        bOpenUserView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOpenUserViewActionPerformed(evt);
            }
        });

        bShowUserTotal.setText("Show User Total");
        bShowUserTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bShowUserTotalActionPerformed(evt);
            }
        });

        bShowMessagesTotal.setText("Show Messages Total");

        bShowGroupTotal.setText("Show Group Total");
        bShowGroupTotal.setToolTipText("");

        bShowPositivePercentage.setText("Show Positive Percentage");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bShowMessagesTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(bShowUserTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bShowPositivePercentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bShowGroupTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(bOpenUserView, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextUserID)
                    .addComponent(textGroupID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAddGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAddUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textGroupID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAddGroup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bOpenUserView)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bShowGroupTotal)
                    .addComponent(bShowUserTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bShowPositivePercentage)
                    .addComponent(bShowMessagesTotal))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUserIDActionPerformed

    private void textGroupIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textGroupIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textGroupIDActionPerformed

    private void bOpenUserViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOpenUserViewActionPerformed
        // TODO add your handling code here:
        User Brandon = new User("Brandon");
        Brandon.addNewsFeed("Hello there");
        new UserView(Brandon, userGroupManager.getUserGroup()).setVisible(true);
        
    }//GEN-LAST:event_bOpenUserViewActionPerformed

    private void bShowUserTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bShowUserTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bShowUserTotalActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextUserID;
    private javax.swing.JButton bAddGroup;
    private javax.swing.JButton bAddUser;
    private javax.swing.JButton bOpenUserView;
    private javax.swing.JButton bShowGroupTotal;
    private javax.swing.JButton bShowMessagesTotal;
    private javax.swing.JButton bShowPositivePercentage;
    private javax.swing.JButton bShowUserTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JTextField textGroupID;
    // End of variables declaration//GEN-END:variables
}
