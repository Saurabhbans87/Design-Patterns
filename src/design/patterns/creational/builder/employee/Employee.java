/**
 * Create by saurabh
 * Date: 19/03/24
 * Project Name: Design-Patterns
 */
package design.patterns.creational.builder.employee;

public class Employee {
    private String name;
    private int age;
    private String panNumber;
    private String aadharNumber;
    private String companyName;

    public Employee(String name,int age,String panNumber,String aadharNumber,String companyName){
        this.name = name;
        this.age = age;
        this.panNumber = panNumber;
        this.aadharNumber = aadharNumber;
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        companyName = companyName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", panNumber='" + panNumber + '\'' +
                ", aadharNumber='" + aadharNumber + '\'' +
                ", CompanyName='" + companyName + '\'' +
                '}';
    }
}
