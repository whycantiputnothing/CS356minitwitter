/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brandon-PC
 */
public class UserGroupManager {

    private UserGroup userGroup;
    private int userCount;
    private int groupCount;

    public UserGroupManager() {
        userGroup = new UserGroup("Root");
        userCount = 0;
        groupCount = 0; //do not count root userGroup in the total
    }

    public void addUser(String s) {
        User user = new User(s);
        addUser(user, userGroup);
    }

    public void addUser(User u, UserGroup ug) {
        ug.addUser(u);
        userCount++;
    }

    public void addUserGroup(UserGroup toAdd, UserGroup existing) {
        existing.addUserGroup(userGroup);
        groupCount++;
    }

    public User findUser(String s) {
        return userGroup.findUser(s, userGroup);
    }

    public UserGroup findUserGroup(String s) {
        return userGroup.findUserGroup(s, userGroup);
    }
    
    public int getNumberOfMessages() {
        return userGroup.getNumberOfMessages(userGroup);
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public int getGroupCount() {
        return groupCount;
    }

    public void setGroupCount(int groupCount) {
        this.groupCount = groupCount;
    }

    public UserGroup getRoot() {
        return userGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }

}
