
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

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

//    private static AdminControlPanel instance = new AdminControlPanel();
    private UserGroupManager userGroupManager;
    private DefaultTreeModel model;
    private UserGroup root;
    private int numberOfUsers;
    private int numberOfGroups;

    /**
     * Creates new form AdminControlPanel
     */
    public AdminControlPanel() {
        //userGroupManager = new UserGroupManager();
        root = new UserGroup("root");
        initTree();
        initComponents();
        jTree1.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
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
        textUserID = new javax.swing.JTextField();
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

        jTree1.setModel(model);
        jScrollPane1.setViewportView(jTree1);

        textUserID.setText("User ID");
        textUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUserIDActionPerformed(evt);
            }
        });

        textGroupID.setText("Group ID");
        textGroupID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textGroupIDActionPerformed(evt);
            }
        });

        bAddUser.setText("Add User");
        bAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddUserActionPerformed(evt);
            }
        });

        bAddGroup.setText("Add Group");
        bAddGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddGroupActionPerformed(evt);
            }
        });

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
        bShowMessagesTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bShowMessagesTotalActionPerformed(evt);
            }
        });

        bShowGroupTotal.setText("Show Group Total");
        bShowGroupTotal.setToolTipText("");
        bShowGroupTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bShowGroupTotalActionPerformed(evt);
            }
        });

        bShowPositivePercentage.setText("Show Positive Percentage");
        bShowPositivePercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bShowPositivePercentageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bOpenUserView, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bShowMessagesTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(bShowUserTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bShowPositivePercentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bShowGroupTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 4, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textUserID)
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
                    .addComponent(textUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAddUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textGroupID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAddGroup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bOpenUserView)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bShowGroupTotal)
                    .addComponent(bShowUserTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bShowPositivePercentage)
                    .addComponent(bShowMessagesTotal))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUserIDActionPerformed

    private void textGroupIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textGroupIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textGroupIDActionPerformed

    private void bOpenUserViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOpenUserViewActionPerformed
        // TODO add your handling code here:
        User u;
        Object lastPath = jTree1.getLastSelectedPathComponent();

        if (lastPath instanceof DefaultMutableTreeNode) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) lastPath;
            Object userObject = node.getUserObject();
            if (userObject instanceof User) {
                u = (User) userObject;
                new UserView(u, root).setVisible(true);
            }
        }

    }//GEN-LAST:event_bOpenUserViewActionPerformed

    private void bShowUserTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bShowUserTotalActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Total # of Users: " + numberOfUsers);
    }//GEN-LAST:event_bShowUserTotalActionPerformed

    private void bAddGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddGroupActionPerformed
        // TODO add your handling code here:
        UserGroup u = new UserGroup(textGroupID.getText());
        DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(u);
        Object lastPath = jTree1.getLastSelectedPathComponent();
        if (lastPath instanceof DefaultMutableTreeNode && root.findUserGroup(u.getUniqueID(), root) == null) {
            numberOfGroups++;
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) lastPath;
            Object userObject = node.getUserObject();
            if (userObject instanceof UserGroup) {
                UserGroup ug = (UserGroup) userObject;
                ug.addUserGroup(u);
                node.add(newNode);
            } else {
                root.addUserGroup(u);
                DefaultMutableTreeNode tRoot = (DefaultMutableTreeNode) model.getRoot();
                tRoot.add(newNode);
            }
        }

        model.reload();

    }//GEN-LAST:event_bAddGroupActionPerformed

    private void bAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddUserActionPerformed
        // TODO add your handling code here:
        User u = new User(textUserID.getText());
        DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(u);
        Object lastPath = jTree1.getLastSelectedPathComponent();
        if (lastPath instanceof DefaultMutableTreeNode && root.findUser(u.getUniqueID(), root) == null) {
            numberOfUsers++;
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) lastPath;
            Object userObject = node.getUserObject();
            if (userObject instanceof UserGroup) {
                UserGroup ug = (UserGroup) userObject;
                ug.addUser(u);
                node.add(newNode);
            } else {
                root.addUser(u);
                DefaultMutableTreeNode tRoot = (DefaultMutableTreeNode) model.getRoot();
                tRoot.add(newNode);
            }
        }
        model.reload();
    }//GEN-LAST:event_bAddUserActionPerformed

    private void bShowGroupTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bShowGroupTotalActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Total # of User Groups: " + numberOfGroups);
    }//GEN-LAST:event_bShowGroupTotalActionPerformed

    private void bShowMessagesTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bShowMessagesTotalActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Total # of Messages: " + root.getNumberOfMessages(root));
    }//GEN-LAST:event_bShowMessagesTotalActionPerformed

    private void bShowPositivePercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bShowPositivePercentageActionPerformed
        // TODO add your handling code here:
        DecimalFormat df = new DecimalFormat("##.##%");
        JOptionPane.showMessageDialog(rootPane, "Percent of Postive Messages: " + df.format((double)root.getNumberOfPositiveMessages(root)/root.getNumberOfMessages(root)));
    }//GEN-LAST:event_bShowPositivePercentageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTextField textUserID;
    // End of variables declaration//GEN-END:variables

    private void initTree() {
        DefaultMutableTreeNode tRoot = new DefaultMutableTreeNode(root);
        model = new DefaultTreeModel(tRoot);
    }

    public static AdminControlPanel getInstance() {
//        return instance;
        return null;
    }
}
