package MiniTwitter;

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

    /**
     *
     * @param userGroup
     */
    public void visit(UserGroup userGroup);

    /**
     *
     * @param user
     */
    public void visit(User user);
    
}
