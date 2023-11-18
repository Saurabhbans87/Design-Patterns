/**
 * Create by saurabh
 * Date: 18/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.creational.factory;

public class GenderMain {
    public static void main(String[] args) {
        GenderFactory genderFactory = new GenderFactory();
        genderFactory.getGenderObject(GenderType.MALE).booked();
        genderFactory.getGenderObject(GenderType.FEMALE).booked();
    }
}
