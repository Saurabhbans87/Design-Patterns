/**
 * Create by saurabh
 * Date: 02/12/23
 * Project Name: Design-Patterns
 */
package design.patterns.creational.factory.docuemnt;

public class Cleint {
    public static void main(String[] args) {
        DocumentCreatorFactory documentCreatorFactory = new DocumentCreatorFactory();
        DocumentCreator pdfDocument = documentCreatorFactory.getDocument("PDF");
        pdfDocument.createDocument();
        System.out.println("************************WORD Document******************************");
        DocumentCreator wordDocument = documentCreatorFactory.getDocument("WORD");
        wordDocument.createDocument();
        System.out.println("************************Power Point Document******************************");
        DocumentCreator powerDocument = documentCreatorFactory.getDocument("POWER");
        powerDocument.createDocument();
        System.out.println("************************Excel Document******************************");
        DocumentCreator excelDocument = documentCreatorFactory.getDocument("EXCEL");
        excelDocument.createDocument();
    }
}
