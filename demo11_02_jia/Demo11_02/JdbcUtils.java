package demo11_02_jia.Demo11_02;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
public class JdbcUtils {
    private static String driver=null;
    private static String url=null;
    private static String username=null;
    private static String password=null;
    static{
        try{
            InputStream is=JdbcUtils.class.getClassLoader().getResourceAsStream("demo11_02_jia/db.properties");
            Properties properties=new Properties();
            properties.load(is);
            driver=properties.getProperty("driver");
            url=properties.getProperty("url");
            username=properties.getProperty("username");
            password=properties.getProperty("password");
            Class.forName(driver);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection()throws SQLException{
        System.out.println(url);
        return DriverManager.getConnection(url, username, password);
    }
    public static void close(Connection conn,Statement stmt,ResultSet rs)throws SQLException{
        if(rs!=null){
            rs.close();
        }
        if(stmt!=null){
            stmt.close();
        }
        if(conn!=null){
            conn.close();
        }
    }
}
