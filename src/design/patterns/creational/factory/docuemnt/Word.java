/**
 * Create by saurabh
 * Date: 02/12/23
 * Project Name: Design-Patterns
 */
package design.patterns.creational.factory.docuemnt;

public class Word implements DocumentCreator{
    @Override
    public void createDocument() {
        System.out.println("Word document created successfully created");
    }
}
