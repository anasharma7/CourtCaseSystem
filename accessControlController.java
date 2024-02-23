/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m02a02.Controller;

import java.util.Map;
import java.util.Set;
import m02a02.Model.User;
import m02a02.Model.accessControl;
import java.util.HashMap;



public class accessControlController {
    private Map<User, Set<accessControl.AccessLevel>> accessMap = new HashMap<>();

    public void setAccessMap(Map<User, Set<accessControl.AccessLevel>> accessMap) {
        this.accessMap = accessMap;
    }

    public Map<User, Set<accessControl.AccessLevel>> getAccessMap() {
        return this.accessMap;
    }
}
