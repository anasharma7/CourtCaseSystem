/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m02a02.View;

import java.util.Map;
import java.util.Set;
import m02a02.Model.User;
import m02a02.Model.accessControl;

public class AccessView {

    public void showAccess(Map<User, Set<accessControl.AccessLevel>> accessMap) {
        System.out.println("----- Access Control List -----");
        accessMap.forEach((user, accessLevels) -> {
            System.out.println("User: " + user.getUsername() + " | Access Levels: " + accessLevelsToString(accessLevels));
        });
    }

    private String accessLevelsToString(Set<accessControl.AccessLevel> accessLevels) {
        StringBuilder levels = new StringBuilder();
        accessLevels.forEach(level -> levels.append(level.name()).append(" "));
        return levels.toString().trim();
    }
}
