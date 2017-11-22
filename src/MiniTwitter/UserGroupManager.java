/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniTwitter;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Brandon-PC
 */
public class UserGroupManager {

//    private UserGroup userGroup;
    private Map<String, Integer> hashMap;

//    public UserGroupManager(UserGroup userGroup) {
//        this.userGroup = userGroup;
//        hashMap = new HashMap<>();
//    }
    
    public UserGroupManager() {
        hashMap = new HashMap<>();
    }

    public boolean areIDVerified(UserGroup ug) {
        if (!hashMap.containsKey(ug.getUniqueID()) && !ug.getUniqueID().contains(" ")
                                                   && !ug.getUniqueID().equals("")){
                hashMap.put(ug.getUniqueID(), 1);
            } else {
                return false;
            }
        for (User u : ug.getUsers()) {
            if (!hashMap.containsKey(u.getUniqueID()) && !u.getUniqueID().contains(" ")
                                                      && !u.getUniqueID().equals("")) {
                hashMap.put(u.getUniqueID(), 1);
            } else {
                return false;
            }

        }
        for (UserGroup ug1 : ug.getUserGroups()) {
            areIDVerified(ug1);
        }
        return true;
    }

}
