package java程序设计;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class etc12_02_JdbcConSqlServer {
    public static void main(String[] args) {
        String JDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String conURL = "jdbc:sqlserver://localhost:1433;database=Test;encrypt=false;trustServerCertificate=true";
        String user = "root";
        String password = "123456";
        PreparedStatement pstm = null;
        Connection conn = null;
        ResultSet rs = null;

        try {
            Class.forName(JDriver);
            conn = DriverManager.getConnection(conURL, user, password);
            System.out.println("连接成功");
            String sql = "select count(*) as sum from storage";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            int count = 0;
            while (rs.next()) {
                count = rs.getInt(1);
            }
            System.out.println(count);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("加载失败" + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
