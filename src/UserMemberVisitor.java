/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandon
 */
public interface UserMemberVisitor {
    public void visit(UserGroup userGroup);
    public void visit(User user);
    
}
