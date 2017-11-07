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
        ug.addUser(user);
        userCount++;
    }
    
    public void addUserGroup(String s) {
        UserGroup group = new UserGroup(s);
        ug.addUserGroup(group);
        groupCount++;
    }
    
}
