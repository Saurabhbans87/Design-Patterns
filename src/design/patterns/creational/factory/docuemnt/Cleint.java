/**
 * Create by saurabh
 * Date: 02/12/23
 * Project Name: Design-Patterns
 */
package design.patterns.creational.factory.docuemnt;

public class Cleint {
    public static void main(String[] args) {
        DocumentCreatorFactory documentCreatorFactory = new DocumentCreatorFactory();
        DocumentCreator pdfDocument = new PDF();
        pdfDocument.createDocument();
        System.out.println("************************PDF Document******************************");
        DocumentCreator wordDocument = new Word();
        wordDocument.createDocument();
        System.out.println("************************Power Point Document******************************");
        DocumentCreator powerDocument = new Power();
        powerDocument.createDocument();
        System.out.println("************************Excel Document******************************");
        DocumentCreator excelDocument = new Excel();
        excelDocument.createDocument();
    }
}
