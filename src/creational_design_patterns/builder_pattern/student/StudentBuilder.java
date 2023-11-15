/**
 * Create by saurabh
 * Date: 16/11/23
 * Project Name: Design-Patterns
 */
package creational_design_patterns.builder_pattern.student;

public class StudentBuilder {
    private String name;
    private String address;
    private String rollNumber;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public Student getStudent(){
        return new Student(name,address,rollNumber);
    }
}
