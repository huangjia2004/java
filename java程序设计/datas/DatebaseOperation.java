package java程序设计.datas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DatebaseOperation {
    private MySQLCon myDB=null;
    private Connection conn=null;
    private Statement stmt=null;
    private int num1;
    private int num2;
    private String name;
    private String password;
    public DatebaseOperation(MySQLCon myDB){
        conn=myDB.getMyConnection();
        stmt=myDB.getMyStatement();
        num1=0;
        num2=0;
    }
    public void insertDate(String name,String password){
        try {
            String sql="insert into user(username,password) values('"+name+"','"+password+"')";
            stmt.executeUpdate(sql);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void deleteDate(String name){
        String sql="delete from user where username="+name+"";
        System.out.println(sql);
        try{
            stmt.executeUpdate(sql);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void updateDate(String name,String password){
        String sql="update user set name='"+name+"',password='"+password+"'where name='"+name+"'&&password='"+password+"'";
        System.out.println(sql);
        try{
            stmt.executeUpdate(sql);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    public boolean selectPassword(String mpassword){
        String sql="select * from user";
        try{
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                password=rs.getString("password");
                num2++;
                if(password.equals(mpassword)&&(num2==num1)){
                    return true;
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean selectName(String mname){
        String sql="select * from user";
        try{
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                name=rs.getString("username");
                num1++;
                if(name.equals(mname)){
                    return true;
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public void selectAll(){
        String sql="select * from user";
        try{
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                name=rs.getString("username");
                password=rs.getString("password");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
    public void setNum1(){
        num1=0;
    }
    public void setNum2(){
        num2=0;
    }
}
