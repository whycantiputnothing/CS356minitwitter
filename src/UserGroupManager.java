/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * wanted to use this class instead of instance variables in admin control panel
 * but it got buggy so i discarded it.
 * @author Brandon-PC
 */
public class UserGroupManager {

    private UserGroup userGroup;
    private int userCount;
    private int groupCount;

    /**
     *
     */
    public UserGroupManager() {
        userGroup = new UserGroup("Root");
        userCount = 0;
        groupCount = 0; //do not count root userGroup in the total
    }

    /**
     *
     * @param s
     */
    public void addUser(String s) {
        User user = new User(s);
        addUser(user, userGroup);
    }

    /**
     *
     * @param u
     * @param ug
     */
    public void addUser(User u, UserGroup ug) {
        ug.addUser(u);
        userCount++;
    }

    /**
     *
     * @param toAdd
     * @param existing
     */
    public void addUserGroup(UserGroup toAdd, UserGroup existing) {
        existing.addUserGroup(userGroup);
        groupCount++;
    }

    /**
     *
     * @param s
     * @return
     */
    public User findUser(String s) {
        return userGroup.findUser(s, userGroup);
    }

    /**
     *
     * @param s
     * @return
     */
    public UserGroup findUserGroup(String s) {
        return userGroup.findUserGroup(s, userGroup);
    }
    
    /**
     *
     * @return
     */
    public int getNumberOfMessages() {
        return userGroup.getNumberOfMessages(userGroup);
    }

    /**
     *
     * @return
     */
    public int getUserCount() {
        return userCount;
    }

    /**
     *
     * @param userCount
     */
    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    /**
     *
     * @return
     */
    public int getGroupCount() {
        return groupCount;
    }

    /**
     *
     * @param groupCount
     */
    public void setGroupCount(int groupCount) {
        this.groupCount = groupCount;
    }

    /**
     *
     * @return
     */
    public UserGroup getRoot() {
        return userGroup;
    }

    /**
     *
     * @param userGroup
     */
    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }

}
