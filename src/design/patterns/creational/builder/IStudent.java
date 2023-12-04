package design.patterns.creational.builder;

public interface IStudent {
    IStudent firstName(String firstName);
    IStudent lastName(String lastName);
    IStudent middleName(String middleName);
    IStudent primaryEmail(String primaryEmail);
    IStudent secondaryEmail(String secondaryEmail);
    IStudent primaryMobileNumber(String primaryMobileNumber);
    IStudent secondaryMobileNumber(String secondaryMobileNumber);
}
