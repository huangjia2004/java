package Java程序设计上机实训;
import java.sql.*;
public class Demo11_03_PreparedStatement{
    public static void main(String[] args) {
        if(args.length!=7){
            System.out.println("Parameters Error! Please Input Again");
            System.exit(0);
        }
        String name=args[0];
        int age=0;
        try{
            age=Integer.parseInt(args[1]);
        }
        catch(NumberFormatException e){
            System.out.println("Parameters Error! Age should be Number Format!");
            System.exit(0);
        }
        String sex=args[2];
        String address=args[3];
        String depart=args[4];
        int worklen=0;
        try{
            worklen=Integer.parseInt(args[5]);
        }
        catch(NumberFormatException e){
            System.out.println("Parameters Error! Worklen should be Number Format!");
            System.exit(0);
        }
        int wage=0;
        try{
            wage=Integer.parseInt(args[6]);
        }
        catch(NumberFormatException e){
            System.out.println("Parameters Error! Wage should be Number Format!");
            System.exit(0);
        }
        PreparedStatement pstmt=null;
        Connection conn=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo?useUnicode=ture&characterEncoding=utf-8&serverTimezone=GMT%2B8", "root", "123456");
            pstmt=conn.prepareStatement("insert into staff (name,age,sex,address,depart,worklen,wage) values (?,?,?,?,?,?,?)");
            pstmt.setString(1,name);
            pstmt.setInt(2,age);
            pstmt.setString(3,sex);
            pstmt.setString(4,address);
            pstmt.setString(5,depart);
            pstmt.setInt(6,worklen);
            pstmt.setInt(7,wage);
            pstmt.executeUpdate();
            System.out.println("Insert Success!");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(pstmt!=null){
                    pstmt.close();
                }
                if(conn!=null){
                    conn.close();
                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
}
