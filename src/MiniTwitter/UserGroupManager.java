/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniTwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Brandon-PC
 */
public class UserGroupManager {

//    private UserGroup userGroup;
    private Map<String, Integer> IDHashMap;
    private Map<Long, String> userHashMap;

//    public UserGroupManager(UserGroup userGroup) {
//        this.userGroup = userGroup;
//        hashMap = new HashMap<>();
//    }
    public UserGroupManager() {
        IDHashMap = new HashMap<>();
        userHashMap = new HashMap<>();

    }

    public boolean areIDVerified(UserGroup ug) {
        boolean bool = true;
        if (!IDHashMap.containsKey(ug.getUniqueID()) && !ug.getUniqueID().contains(" ")
                && !ug.getUniqueID().equals("")) {
            IDHashMap.put(ug.getUniqueID(), 1);
        } else {
            return false;
        }
        for (User u : ug.getUsers()) {
            if (!IDHashMap.containsKey(u.getUniqueID()) && !u.getUniqueID().contains(" ")
                    && !u.getUniqueID().equals("")) {
                IDHashMap.put(u.getUniqueID(), 1);
            } else {
                return false;
            }

        }
        for (UserGroup ug1 : ug.getUserGroups()) {
            bool = areIDVerified(ug1);
            if (!bool) {
                return false;
            }
        }
        IDHashMap.clear();
        return bool;
    }

    public String lastUpdatedUser(UserGroup ug) {
        String user = "";
        List<Long> longList = new ArrayList<>();
        addUsers(ug);
        if (!userHashMap.isEmpty()) {
            for (long l : userHashMap.keySet()) {
                longList.add(l);
            }
            Collections.sort(longList);
            user = userHashMap.get(longList.get(longList.size() - 1));

        }
        userHashMap.clear();
        return user;
    }

    public void addUsers(UserGroup ug) {
        for (User u : ug.getUsers()) {
            userHashMap.put(u.getLastUpdateTime(), u.getUniqueID());
        }
        for (UserGroup ug1 : ug.getUserGroups()) {
            addUsers(ug1);

        }
    }

}
