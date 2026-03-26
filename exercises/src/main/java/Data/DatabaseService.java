package Data;

public class DatabaseService {
    private Database database;

    public DatabaseService(Database database){
        this.database = database;
    }

    public void saveUser(String user){
        database.saveUser(user);
    }
}
