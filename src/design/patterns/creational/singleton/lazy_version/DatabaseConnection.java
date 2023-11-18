/**
 * Create by saurabh
 * Date: 18/11/23
 * Project Name: Design-Patterns
 */
package design.patterns.creational.singleton.lazy_version;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection;

    private DatabaseConnection() {
    }
    public static DatabaseConnection getDataBaseConnectionInstance(){
        if(databaseConnection==null){
            databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }
    void getDataBaseConnectionDetails(){
        System.out.println("connection successful");
    }
}
