
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

    public void addUser(User u) {
        users.add(u);
    }

    public void addUserGroup(UserGroup u) {
        userGroups.add(u);
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

    public User findUser(String s, UserGroup ug) {
        User result = null;
        for (User u : ug.getUsers()) {
            if (u.getUniqueID().equals(s)) {
                return u;
            }
        }
        for (UserGroup ug1 : ug.getUserGroups()) {
            result = findUser(s, ug1);
            if (result != null) {
                return result;
            }
        }
        return result;
    }

    public UserGroup findUserGroup(String s, UserGroup ug) {
        UserGroup result = null;
        if (ug.getUniqueID().equals(s)) {
            return ug;
        } else {
            for (UserGroup ug2 : ug.getUserGroups()) {
                result = findUserGroup(s, ug2);
                if (result != null) {
                    return result;
                }
            }
        }

        return result;
    }

    public int getNumberOfMessages(UserGroup ug) {
        int result = 0;
        for (User u : ug.getUsers()) {
            result += u.getNewsFeed().size();
        }
        for (UserGroup ug1 : ug.getUserGroups()) {
            result += ug1.getNumberOfMessages(ug1);

        }
        return result;
    }

    public int getNumberOfPositiveMessages(UserGroup ug) {
        int result = 0;
        for (User u : ug.getUsers()) {
            for (String s : u.getNewsFeed()) {
                s.toLowerCase();
                if (s.contains("great") || s.contains("good")
                        || s.contains("excellent")) {
                    result += 1;
                }
            }
        }
        for (UserGroup ug1 : ug.getUserGroups()) {
            result += ug1.getNumberOfMessages(ug1);
        }
        return result;
    }

    @Override
    public String toString() {
        return getUniqueID();

    }

}
