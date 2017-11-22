package MiniTwitter;


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
public class UserGroup implements UserMember{

    private String uniqueID;
    private List<User> users;
    private List<UserGroup> userGroups;
    private long creationTime;
    

    /**
     *
     * @param id
     */
    public UserGroup(String id) {
        uniqueID = id;
        users = new ArrayList();
        userGroups = new ArrayList();
        creationTime = System.currentTimeMillis();
    }

    /**
     *
     * @param u User to be added to users
     */
    public void addUser(User u) {
        users.add(u);
    }

    /**
     *
     * @param u UserGroup to be added to userGroups
     */
    public void addUserGroup(UserGroup u) {
        userGroups.add(u);
    }

    /**
     *
     * @return
     */
    public String getUniqueID() {
        return uniqueID;
    }

    /**
     *
     * @return
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     *
     * @return
     */
    public List<UserGroup> getUserGroups() {
        return userGroups;
    }

    /**
     * recursively search UserGroup for user S
     * @param s String ID of user to be found
     * @param ug UserGroup where to search for user
     * @return User if user is found, null if not found
     */
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

    /**
     * Recursively search for UserGroup
     * @param s String ID of UserGroup to be found
     * @param ug UserGroup where to serach for user
     * @return UserGroup if found, null if not found
     */
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

    /**
     * recursively count number of messages
     * @param ug UserGroup to serach for messages in
     * @return int with number of messages
     */
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

    /**
     * recursively count number of positive messages
     * @param ug UserGroup to search for positive messages in
     * @return int with number of messages
     */
    public int getNumberOfPositiveMessages(UserGroup ug) {
        int result = 0;
        for (User u : ug.getUsers()) {
            for (String str : u.getNewsFeed()) {
                String s = str.toLowerCase();
                if (s.contains("great") || s.contains("good")
                        || s.contains("excellent")) {
                    result += 1;
                }
            }
        }
        for (UserGroup ug1 : ug.getUserGroups()) {
            result += getNumberOfPositiveMessages(ug1);
        }
        return result;
    }

    @Override
    public String toString() {
        return getUniqueID();

    }

    /**
     * used to decide icon in jtree
     * @param userGroupVisitor
     */
    @Override
    public void accept(UserMemberVisitor userGroupVisitor) {
        userGroupVisitor.visit(this);
    }

}
