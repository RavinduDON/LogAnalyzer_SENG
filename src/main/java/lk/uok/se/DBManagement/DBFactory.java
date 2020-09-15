package lk.uok.se.DBManagement;

public class DBFactory {

    public static DBFactory dbFactory;

    public enum DBFactoryTypes{
        email;
    }

    public static DBFactory getDbFactory(){
        if(dbFactory==null){
            dbFactory=new DBFactory();
        }
        return dbFactory;
    }

    public DBRepository getDBrepository(DBFactoryTypes types){
        switch (types){
            case email:
                return new DBPerformAction();
            default:
                return null;
        }
    }

}
