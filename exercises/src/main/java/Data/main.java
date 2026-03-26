package Data;

public class main {
    public static void main(String [] args){
        Database database = new MySQLDatabase();
        database.connect();
    }
}
