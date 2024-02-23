/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m02a02.View;

import m02a02.Model.accessControl;

public class CaseView {

    public void showCaseDetails(int caseId, String caseType, String status, accessControl accessControl) {
        System.out.println("----- Case Info -----");
        System.out.println("ID: " + caseId);
        System.out.println("Type: " + caseType);
        System.out.println("Status: " + status);
        // Assuming AccessControl has a meaningful toString() or you implement a way to display relevant details
        System.out.println("Access Control: " + accessControl);
    }
}
