/**
 * Create by saurabh
 * Date: 18/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.creational.singleton.eager_version;

public class DatbaseConnectionMain {
    public static void main(String[] args) {
        //DatabaseConnection.DATABASE_INSTANCE.dataBaseConnection();
        //DatabaseConnection.DATABASE_INSTANCE.databaseDetails();
        DatabaseConnection.getDatabaseInstance().dataBaseConnection();
    }
}
