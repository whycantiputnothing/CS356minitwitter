
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Brandon-PC
 */
public class UserView extends javax.swing.JFrame {

    private User user;
    private UserGroup userGroup;

    /**
     * Creates new form UserView with title of User's unique ID
     * updates followings list and newsFeed every 10 ms
     * @param u
     * @param ug
     */
    public UserView(User u, UserGroup ug) {
        user = u;
        userGroup = ug;
        initComponents();
        new Timer(10, new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                displayText();
            }
        }).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        bFollowUser = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        bPostTweet = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextAreaNewsFeed = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        TextAreaFollowings = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User: " + user.getUniqueID());
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setType(java.awt.Window.Type.POPUP);

        jTextField1.setText("User ID");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        bFollowUser.setText("Follow User");
        bFollowUser.setToolTipText("Only follows if User ID exists");
        bFollowUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFollowUserActionPerformed(evt);
            }
        });

        jTextField2.setText("Tweet Message");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        bPostTweet.setText("Post Tweet");
        bPostTweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPostTweetActionPerformed(evt);
            }
        });

        TextAreaNewsFeed.setColumns(20);
        TextAreaNewsFeed.setLineWrap(true);
        TextAreaNewsFeed.setAutoscrolls(false);
        jScrollPane3.setViewportView(TextAreaNewsFeed);

        TextAreaFollowings.setColumns(20);
        TextAreaFollowings.setLineWrap(true);
        TextAreaFollowings.setToolTipText("List of current Followings");
        TextAreaFollowings.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane4.setViewportView(TextAreaFollowings);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(bPostTweet, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bFollowUser, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bFollowUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPostTweet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void bFollowUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFollowUserActionPerformed
        User u = userGroup.findUser(jTextField1.getText(), userGroup);
        if (u != null) {
            user.addFollowings(u);
            u.addFollowers(user);
        }
    }//GEN-LAST:event_bFollowUserActionPerformed

    private void bPostTweetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPostTweetActionPerformed
        user.addNewsFeed(jTextField2.getText());
    }//GEN-LAST:event_bPostTweetActionPerformed

    private void displayText() {
        TextAreaFollowings.setText("List View (Current Following)\n");
        TextAreaNewsFeed.setText("List View (News Feed)\n");
        for (User u : user.getFollowings()) {
            TextAreaFollowings.append("- " + u.getUniqueID() + "\n");
        }
        for (String s : user.getNewsFeed()) {
            TextAreaNewsFeed.append("- " + s + "\n");

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextAreaFollowings;
    private javax.swing.JTextArea TextAreaNewsFeed;
    private javax.swing.JButton bFollowUser;
    private javax.swing.JButton bPostTweet;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
