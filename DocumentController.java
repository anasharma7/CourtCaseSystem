/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m02a02.Controller;

import m02a02.Model.Document;
import m02a02.View.DocumentView;

public class DocumentController {

    private Document model;
    private DocumentView view;

    public DocumentController(Document model, DocumentView view) {
        this.model = model;
        this.view = view;
    }

    // Accessor and mutator methods for model fields
    public String getContent() {
        return model.getContent();
    }

    public void setContent(String content) {
        model.setContent(content);
        // Additional logic for secure content update could be implemented here
    }

    public int getDocId() {
        return model.getDocId();
    }

    public void setDocId(int docId) {
        model.setDocId(docId);
    }

    public int getCaseId() {
        return model.getCaseId();
    }

    public void setCaseId(int caseId) {
        model.setCaseId(caseId);
    }

    // Method to update the view based on the current state of the model
    public void updateDocumentView() {
        view.showDocumentDetails(model.getContent(), model.getDocId(), model.getCaseId());
    }
}
