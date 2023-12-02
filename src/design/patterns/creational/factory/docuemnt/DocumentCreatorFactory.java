/**
 * Create by saurabh
 * Date: 02/12/23
 * Project Name: Design-Patterns
 */
package design.patterns.creational.factory.docuemnt;

public class DocumentCreatorFactory {
    DocumentCreator getDocument(String documentType){
        if(documentType.equals(DocumentType.PDF)){
            PDF pdf = new PDF();
            return pdf;
        } else if (documentType.equals(DocumentType.WORD_DOCUMENT)) {
            return new Word();
        } else if (documentType.equals(DocumentType.EXCEL)) {
            return new Excel();
        } else if (documentType.equals(DocumentType.POWER_POINT)) {
            return new Power();
        }else {
            throw new IllegalArgumentException("Please provide correct douemnt type");
        }
    }
}
