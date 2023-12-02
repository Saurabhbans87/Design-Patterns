/**
 * Create by saurabh
 * Date: 02/12/23
 * Project Name: Design-Patterns
 */
package design.patterns.creational.factory.docuemnt;

public class PDF implements DocumentCreator{
    @Override
    public void createDocument() {
        System.out.println("Pdf created successfully");
    }
}
