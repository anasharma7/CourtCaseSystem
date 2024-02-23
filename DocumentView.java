/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m02a02.View;

public class DocumentView {
    
    public void showDocumentDetails(String content, int docId, int caseId) {
        System.out.println("----- Document Details -----");
        System.out.println("Document ID: " + docId);
        System.out.println("Case ID: " + caseId);
        System.out.println("Content: ");
        System.out.println(content);
    }
}
