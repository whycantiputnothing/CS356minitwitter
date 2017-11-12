
import java.awt.Component;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Brandon
 */
public class MyTreeCellRenderer extends DefaultTreeCellRenderer implements UserMemberVisitor {

    @Override
    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);

        // decide what icons you want by examining the node
        if (value instanceof DefaultMutableTreeNode) {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
            UserMember um = (UserMember) node.getUserObject();
            um.accept(this);
        }

        return this;
    }

    /**
     * if param is of type userGroup, set icon to folder
     * @param userGroup 
     */
    @Override
    public void visit(UserGroup userGroup) {
        setIcon(UIManager.getIcon("FileView.directoryIcon"));
    }

    /**
     * if param is of type User, set icon to file
     * @param user
     */
    @Override
    public void visit(User user) {
        setIcon(UIManager.getIcon("FileView.fileIcon"));
    }

}
