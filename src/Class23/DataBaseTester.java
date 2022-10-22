package Class23;

public class DataBaseTester {

        public static void main(String[] args) {//static
            DataBase dataBase = new Oracle();
            dataBase.openDatabase();
            dataBase.readData();
            dataBase.writeData();
            dataBase.closeDatabase();
        }
    }


