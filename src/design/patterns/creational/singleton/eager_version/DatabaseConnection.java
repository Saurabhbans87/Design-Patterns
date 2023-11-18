/**
 * Create by saurabh
 * Date: 18/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.creational.singleton.eager_version;

public class DatabaseConnection {
    public static final DatabaseConnection DATABASE_INSTANCE = new DatabaseConnection();

    private DatabaseConnection() {

    }

    void dataBaseConnection() {
        System.out.println("Database connected");
    }

    public DatabaseConnection databaseDetails() {
        return DATABASE_INSTANCE;
    }

}
