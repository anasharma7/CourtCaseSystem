/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m02a02.Controller;

import m02a02.Model.Case;
import m02a02.Model.accessControl; 
import m02a02.View.CaseView;

public class CaseController {

    private Case model;
    private CaseView view;

    public CaseController(Case model, CaseView view) {
        this.model = model;
        this.view = view;
    }

    
    public accessControl getAccessControl() {
        return model.getAccessControl(); 
    }

    public void setAccessControl(accessControl accessControl) {
        model.setAccessControl(accessControl); 
    }

    public void updateCaseView() {
        // Ensure CaseView's showCaseDetails() method matches this signature
        view.showCaseDetails(model.getCaseId(), model.getCaseType(), model.getStatus(), model.getAccessControl());
    }
}
