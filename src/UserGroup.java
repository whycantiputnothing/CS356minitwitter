
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Brandon
 */
public class UserGroup {

    private String uniqueID;
    private List<User> users;
    private List<UserGroup> userGroups;

    public UserGroup(String id) {
        uniqueID = id;
        users = new ArrayList();
        userGroups = new ArrayList();
    }

    public boolean addUser(User u) {
        if (users.contains(u)) {
            return false;
        } else {
            users.add(u);
            return true;
        }
    }
    
    public boolean addUserGroup(UserGroup u) {
        if (userGroups.contains(u)) {
            return false;
        } else {
            userGroups.add(u);
            return true;
        }
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<UserGroup> getUserGroups() {
        return userGroups;
    }
    
    
    
    

}
