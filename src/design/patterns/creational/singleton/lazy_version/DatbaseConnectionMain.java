/**
 * Create by saurabh
 * Date: 18/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.creational.singleton.lazy_version;

public class DatbaseConnectionMain {
    public static void main(String[] args) {
        DatabaseConnection.getDataBaseConnectionInstance().getDataBaseConnectionDetails();
    }
}
