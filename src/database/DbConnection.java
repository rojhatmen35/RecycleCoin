
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DbConnection {//SuperClass
    private final String HOST="localhost";
    private final String PORT="3306";
    private final String VERITABANI_ISMI="recyclecoin";
    private final String USER="root";
    private final String PASSWORD="nplease7";
    
    protected Connection connection=null;
    protected Statement statement=null;//Sql sorgusu çalıştırmak için gerekli

    public DbConnection() {
        String url="jdbc:mysql://"+this.HOST+":"+this.PORT+"/"+this.VERITABANI_ISMI;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            
            this.connection=DriverManager.getConnection(url, this.USER, this.PASSWORD);
            System.out.println("Bağlantı Başarılı..");
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısızz..");
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);        
        }
        
    }
    
    
    
}

