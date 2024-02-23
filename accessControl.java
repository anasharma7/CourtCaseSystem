/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m02a02.Model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class accessControl {

    private Map<User, Set<AccessLevel>> accessMap;

    public accessControl() {
        this.accessMap = new HashMap<>();
    }

    public enum AccessLevel {
        READ, WRITE, DELETE
    }

    public void grantAccess(User user, AccessLevel accessLevel) {
        Set<AccessLevel> rights = accessMap.getOrDefault(user, new HashSet<>());
        rights.add(accessLevel);
        accessMap.put(user, rights);
    }

    public boolean hasAccess(User user, AccessLevel accessLevel) {
        Set<AccessLevel> rights = accessMap.get(user);
        return rights != null && rights.contains(accessLevel);
    }
}
