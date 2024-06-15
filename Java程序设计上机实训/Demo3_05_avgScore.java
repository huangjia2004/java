package Java程序设计上机实训;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Demo3_05_avgScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [][] a=new String[5][6];
        for (int i=1; i<6; i++){
            System.out.print("请输入第"+i+"个学生的学号：");
            a[i-1][0]=scanner.nextLine();
            System.out.print("请输入第"+i+"个学生的姓名：");
            a[i-1][1]=scanner.nextLine();
            for(int j=1; j<4; j++){
                System.out.print("请输入第"+i+"个学生的成绩：");
                a[i-1][j+1]=scanner.nextLine();
            }
            System.out.println();
        }
        scanner.close();
        float avg;
        int sum;
        for(int i=0;i<5;i++){
            sum=0;
            for(int j=2;j<5;j++){
                sum+=Integer.parseInt(a[i][j]);
            }
            avg=sum/3;
            a[i][5]=String.valueOf(avg);
        }
        String s1;
        try{
            File f=new File("");
            f.mkdirs();
            File file=new File("");
            if(file.exists()){
                System.out.println("文件已存在！");
            }
            else{
                System.out.println("文件不存在，正在创建文件");
                file.createNewFile();
            }
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            for(int i=0;i<5;i++){
                for(int j=0;j<6;j++){
                    s1=a[i][j]+"\t";
                    output.write(s1);
                    }
                output.newLine();
            }
            output.close();
            System.out.println("数据已近写入");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
