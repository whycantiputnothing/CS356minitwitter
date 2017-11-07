/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandon
 */
public class Driver {

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminControlPanel().setVisible(true);
            }
        });
        
        UserGroup u1 = new UserGroup("1");
        UserGroup u2 = new UserGroup("2");
        UserGroup u3 = new UserGroup("3");
        UserGroup u4 = new UserGroup("4");
        UserGroup u5 = new UserGroup("5");
        UserGroup u6 = new UserGroup("6");
        UserGroup u7 = new UserGroup("10");
        
        User b = new User("B1");
        User b1 = new User("B2");
        User b2 = new User("B3");
        User b3 = new User("B4");
        User b4 = new User("B5");
        User b5 = new User("B6");
        User b6 = new User("B7");
        
        u1.addUserGroup(u2);
        u1.addUserGroup(u3);
        u2.addUserGroup(u4);
        u4.addUserGroup(u5);
        u3.addUserGroup(u7);
        u5.addUserGroup(u6);
        u5.addUserGroup(u7);
        
        u1.addUser(b);
        u2.addUser(b1);
        u3.addUser(b2);
        u4.addUser(b4);
        u5.addUser(b5);
        u7.addUser(b3);
        u7.addUser(b6);
        
        System.out.println(u1.findUser("B4", u1).getUniqueID());
        System.out.println(u1.findUserGroup("10", u1).getUniqueID());
    }

}
