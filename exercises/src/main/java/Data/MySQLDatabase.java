package Data;

public class MySQLDatabase implements Database{
    @Override
    public void connect() {
        System.out.println("Connecting");
    }

    @Override
    public void saveUser(String user) {
        System.out.println("Saving");
    }
}
