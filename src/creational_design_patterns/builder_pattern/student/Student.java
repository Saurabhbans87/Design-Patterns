/**
 * Create by saurabh
 * Date: 16/11/23
 * Project Name: Design-Patterns
 */
package creational_design_patterns.builder_pattern.student;

public class Student {
    private String name;
    private String address;
    private String rollNumber;

    public Student(String name, String address, String rollNumber) {
        this.name = name;
        this.address = address;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                '}';
    }
}
