package design.patterns.builder;

public class StudentBuilder implements IStudent {
    private String firstName;
    private String middleName;
    private String lastName;
    private String primaryEmail;
    private String secondaryEmail;
    private String primaryMobileNumber;
    private String secondaryMobileNumber;

    @Override
    public StudentBuilder firstName(final String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public StudentBuilder lastName(final String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public StudentBuilder middleName(final String middleName) {
        this.middleName = middleName;
        return this;
    }

    @Override
    public StudentBuilder primaryEmail(final String primaryEmail) {
        this.primaryEmail = primaryEmail;
        return this;
    }

    @Override
    public StudentBuilder secondaryEmail(final String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
        return this;
    }

    @Override
    public StudentBuilder primaryMobileNumber(final String primaryMobileNumber) {
        this.primaryMobileNumber = primaryMobileNumber;
        return this;
    }

    @Override
    public StudentBuilder secondaryMobileNumber(final String secondaryMobileNumber) {
        this.secondaryMobileNumber = secondaryMobileNumber;
        return this;
    }

    public Student build() {
        return new Student(this);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public String getPrimaryMobileNumber() {
        return primaryMobileNumber;
    }

    public String getSecondaryMobileNumber() {
        return secondaryMobileNumber;
    }
}
