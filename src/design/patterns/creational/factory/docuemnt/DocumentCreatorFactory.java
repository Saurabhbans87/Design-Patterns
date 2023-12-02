/**
 * Create by saurabh
 * Date: 02/12/23
 * Project Name: Design-Patterns
 */
package design.patterns.creational.factory.docuemnt;

public class DocumentCreatorFactory {
    DocumentCreator getDocument(String documentType){
        if(documentType.equals("PDF")){
            return new PDF();
        } else if (documentType.equals("WORD")) {
            return new Word();
        } else if (documentType.equals("POWER")) {
            return new Excel();
        } else if (documentType.equals("EXCEL")) {
            return new Power();
        }else {
            throw new IllegalArgumentException("Please provide correct document type");
        }
    }
}
