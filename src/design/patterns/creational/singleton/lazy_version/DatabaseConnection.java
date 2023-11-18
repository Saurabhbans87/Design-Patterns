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
    //This will in multithreaded environment
    public static DatabaseConnection getDataBaseConnectionInstance(){
        if(databaseConnection==null){
            databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }
    //To make a singleton class thread safe, getDataBaseConnectionInstanceMultiThreaded() method is made synchronized
    // so that multiple threads can’t access it simultaneously
    public static DatabaseConnection getDataBaseConnectionInstanceMultiThreaded(){
        if(databaseConnection==null){
            synchronized (DatabaseConnection.class){
                databaseConnection = new DatabaseConnection();
            }
        }
        return databaseConnection;
    }

    //Lazy initialization with Double check
    public static DatabaseConnection getDataBaseConnectionInstanceDoubleCheck(){
        if(databaseConnection==null){
            synchronized (DatabaseConnection.class){
                if(databaseConnection==null){
                    databaseConnection = new DatabaseConnection();
                }
            }
        }
        return databaseConnection;
    }


    void getDataBaseConnectionDetails(){
        System.out.println("connection successful");
    }

    void getDataBaseConnectionDetailsMultiThreaded(){
        System.out.println("connection successful in multithreaded");
    }

    void getDataBaseConnectionDetailsDoubleCheck(){
        System.out.println("connection successful using double check");
    }

}
