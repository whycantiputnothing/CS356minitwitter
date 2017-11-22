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
public class User implements Subject, Observer, UserMember {
    
    private String uniqueID;
    private List<User> followers;
    private List<User> followings;
    private List<String> newsFeed;
    private static int observerIDTracker = 0;
    private int observerID;
    private Subject user;
    private long creationTime;
    private long lastUpdateTime;

    /**
     *
     * @param ID String for identification
     */
    public User(String ID){
        uniqueID = ID;
        followers = new ArrayList();
        followings = new ArrayList();
        newsFeed = new ArrayList();
        this.observerID = observerIDTracker++;
        creationTime = System.currentTimeMillis();
        lastUpdateTime = creationTime;
    }
    
    /**
     * 
     * @param s String to be added to newsFeed
     */
    public void addNewsFeed(String s) {
        newsFeed.add(uniqueID + ": " + s);
        NotifyObservers();
    }
    
    /**
     * used when notifying observers, else every observer would
     * get duplicate copies of messages
     * @param s 
     */
    public void addFeed(String s) {
        newsFeed.add(s);
    }
    
    /**
     *
     * @param u user to be added to followers
     */
    public void addFollowers(User u) {
        followers.add(u);
    }
    
    /**
     *
     * @param u user to be added to followings
     */
    public void addFollowings(User u) {
        followings.add(u);
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
     * @param uniqueID
     */
    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    /**
     *
     * @return
     */
    public List<User> getFollowers() {
        return followers;
    }

    /**
     *
     * @param followers
     */
    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    /**
     *
     * @return
     */
    public List<User> getFollowings() {
        return followings;
    }

    /**
     *
     * @param followings
     */
    public void setFollowings(List<User> followings) {
        this.followings = followings;
    }

    /**
     *
     * @return
     */
    public List<String> getNewsFeed() {
        return newsFeed;
    }

    /**
     *
     * @param newsFeed
     */
    public void setNewsFeed(List<String> newsFeed) {
        this.newsFeed = newsFeed;
    }
    
     public long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }

    public long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     *
     * @param observer
     */
    @Override
    public void Attach(Observer observer) {
        addFollowers((User) observer);
    }

    /**
     *
     */
    @Override
    public void NotifyObservers() {
        for (Observer observer : followers) {
            observer.update(newsFeed.get(newsFeed.size() - 1));
        }
    }

    /**
     *
     * @param s
     */
    @Override
    public void update(String s) {
        addFeed(s);
        }
    
    /**
     *
     */
    public void printFeed(){
        for(String s : newsFeed) {
            System.out.println(s);
        }
    }
    
    @Override
    public String toString(){
        return getUniqueID();
    }

    /**
     * used to determine icon in jtree
     * @param userGroupVisitor
     */
    @Override
    public void accept(UserMemberVisitor userGroupVisitor) {
        userGroupVisitor.visit(this);
    }
    
}
