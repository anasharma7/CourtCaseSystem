/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m02a02.Model;

import java.time.LocalDateTime;

public class Document {

    private int docId;
    private int caseId;
    private String title;
    private String content;
    private LocalDateTime creationDate;
    private LocalDateTime lastModifiedDate;
    // Assuming AccessControl is defined and includes document-level permissions
    private accessControl documentAccessControl;

    public Document(int docId, int caseId, String title, String content, accessControl documentAccessControl) {
        this.docId = docId;
        this.caseId = caseId;
        this.title = title;
        this.content = content;
        this.creationDate = LocalDateTime.now();
        this.lastModifiedDate = LocalDateTime.now();
        this.documentAccessControl = documentAccessControl;
    }

    // Getters and Setters
    public int getDocId() { return docId; }
    public void setDocId(int docId) { this.docId = docId; }

    public int getCaseId() { return caseId; }
    public void setCaseId(int caseId) { this.caseId = caseId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) {
        this.content = content;
        this.lastModifiedDate = LocalDateTime.now();
    }

    public LocalDateTime getCreationDate() { return creationDate; }
    public LocalDateTime getLastModifiedDate() { return lastModifiedDate; }

    public accessControl getDocumentAccessControl() { return documentAccessControl; }
    public void setDocumentAccessControl(accessControl documentAccessControl) { this.documentAccessControl = documentAccessControl; }

    // Additional functionality like update, delete can be added here
    public void updateDocument(String newContent) {
        this.content = newContent;
        this.lastModifiedDate = LocalDateTime.now();
     }
    public static boolean deleteDocument(int docId) {
        return true; // Placeholder return value
    }
}
