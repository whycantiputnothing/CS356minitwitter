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
    private UserGroup ug;
    private int userCount;
    private int groupCount;
    
    public UserGroupManager(){
        ug = new UserGroup("Root");
        userCount = 0;
        groupCount = 0; //do not count root userGroup in the total
    }
    
    public void addUser(String s) {
        User user = new User(s);
        addUser(user);
    }
    
    public void addUser(User u) {
        ug.addUser(u);
        userCount++;
    }
    
    public void addUserGroup(String s) {
        UserGroup group = new UserGroup(s);
        addUserGroup(group);
    }
    
    public void addUserGroup(UserGroup ug) {
        ug.addUserGroup(ug);
        groupCount++;
    }
    
    public User findUser(String s) {
        for (User u : ug.getUsers()) {
            if (u.getUniqueID().equals(s)) {
                return u;
            }
        }
        if (!ug.getUserGroups().isEmpty()) {
            for (UserGroup ug : ug.getUserGroups()) {
                findUser(s);
            }
        }
        return null;

    }
    
}
