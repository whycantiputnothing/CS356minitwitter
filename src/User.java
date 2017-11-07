
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
public class User implements Subject,Observer{
    
    private String uniqueID;
    private List<User> followers;
    private List<User> followings;
    private List<String> newsFeed;
    private static int observerIDTracker = 0;
    private int observerID;
    private Subject user;
    
    
    public User(String ID){
        uniqueID = ID;
        followers = new ArrayList();
        followings = new ArrayList();
        newsFeed = new ArrayList();
        this.observerID = observerIDTracker++;
        
    }
    
    public void addNewsFeed(String s) {
        newsFeed.add(uniqueID + ": " + s);
        NotifyObservers();
    }
    
    public void addFeed(String s) {
        newsFeed.add(s);
    }
    
    public void addFollowers(User u) {
        followers.add(u);
    }
    
    public void addFollowings(User u) {
        followers.add(u);
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<User> getFollowings() {
        return followings;
    }

    public void setFollowings(List<User> followings) {
        this.followings = followings;
    }

    public List<String> getNewsFeed() {
        return newsFeed;
    }

    public void setNewsFeed(List<String> newsFeed) {
        this.newsFeed = newsFeed;
    }

    @Override
    public void Attach(Observer observer) {
        addFollowers((User) observer);
    }

    @Override
    public void NotifyObservers() {
        for (Observer observer : followers) {
            observer.update(newsFeed.get(newsFeed.size() - 1));
        }
    }

    @Override
    public void update(String s) {
        addFeed(s);
        printFeed();
        }
    
    public void printFeed(){
        for(String s : newsFeed) {
            System.out.println(s);
        }
    }
    
}
