package demo11_02_jia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import demo11_02_jia.Demo11_02.JdbcUtils;
public class Demo11_02_Test {
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        try{
            conn=JdbcUtils.getConnection();
            stmt=conn.createStatement();
            String sql_i="insert into user(username,password) values('赵小小','19960328')";
            int i=stmt.executeUpdate(sql_i);
            if(i>0){
                System.out.println("插入成功");
            }
            String sql_u="update user set password='dream' where username='李四'";
            int i1=stmt.executeUpdate(sql_u);
            if(i1>0){
                System.out.println("修改成功");
            }
            String sql_d="delete from user where username='张三'";
            int i2=stmt.executeUpdate(sql_d);
            if(i2>0){
                System.out.println("删除成功");
            }
            String sql_q="select * from user";
            rs=stmt.executeQuery(sql_q);
            while(rs.next()){
                System.out.println(rs.getString("username")+" "+rs.getString("password"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            try{
                JdbcUtils.close(conn, stmt, rs);
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}
