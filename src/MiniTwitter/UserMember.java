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
public interface UserMember {

    /**
     *
     * @param userGroupVisitor
     */
    public void accept(UserMemberVisitor userGroupVisitor);
}
