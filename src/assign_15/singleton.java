package assign_15;

public class singleton {

    private static singleton dbObject;

    singleton() {
    }

    public static singleton getInstance() {

        // create object if it's not already created
        if (dbObject == null) {
            dbObject = new singleton();
        }

        // returns the singleton object
        return dbObject;
    }

    public void getConnection() {
        System.out.println("You are now connected to the database.");
    }



    public static void main(String[] args) {
        singleton db1;

        // refers to the only object of Database

        db1= singleton.getInstance();

        db1.getConnection();
    }
}

