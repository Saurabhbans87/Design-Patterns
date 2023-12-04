package design.patterns.creational.builder;

public class Client {
    public static void main(String[] args) {
        Student student = new StudentBuilder()
                .firstName("Json")
                .primaryEmail("jsonmike@gmail.com")
                .primaryMobileNumber("1234567890")
                .build();
        System.out.println(student.toString());
    }
}
