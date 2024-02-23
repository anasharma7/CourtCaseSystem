/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m02a02.Model;

public class Case {

    private int caseId;
    private String caseType;
    private String status;
    private accessControl accessControl;

    public Case(int caseId, String caseType, String status, accessControl accessControl) {
        this.caseId = caseId;
        this.caseType = caseType;
        this.status = status;
        this.accessControl = accessControl;
    }

    public int getCaseId() { return caseId; }
    public void setCaseId(int caseId) { this.caseId = caseId; }

    public String getCaseType() { return caseType; }
    public void setCaseType(String caseType) { this.caseType = caseType; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public accessControl getAccessControl() { return accessControl; }
    public void setAccessControl(accessControl accessControl) { this.accessControl = accessControl; }
}
