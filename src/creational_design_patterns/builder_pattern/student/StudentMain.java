/**
 * Create by saurabh
 * Date: 16/11/23
 * Project Name: Design-Patterns
 */
package creational_design_patterns.builder_pattern.student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new StudentBuilder().setName("Ramesh").setRollNumber("34533").getStudent();
        System.out.println(student);
    }
}
