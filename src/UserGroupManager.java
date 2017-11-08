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
        addUser(user);
    }

    public void addUser(User u) {
        userGroup.addUser(u);
        userCount++;
    }

    public void addUserGroup(String s) {
        UserGroup group = new UserGroup(s);
        addUserGroup(group);
    }

    public void addUserGroup(UserGroup userGroup) {
        userGroup.addUserGroup(userGroup);
        groupCount++;
    }

    public User findUser(String s) {
        return userGroup.findUser(s, userGroup);
    }

    public UserGroup findUserGroup(String s) {
        return userGroup.findUserGroup(s, userGroup);
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

    public UserGroup getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }

}
