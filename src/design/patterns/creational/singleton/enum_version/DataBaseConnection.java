package design.patterns.creational.singleton.enum_version;

public enum DataBaseConnection {
    DATA_BASE_INSTANCE;

    void dataBaseConnectionUsingEnum(){
        System.out.println("Uing enum");
    }
}
