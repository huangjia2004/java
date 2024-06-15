package Java程序设计上机实训;
import java.util.Scanner;
public class Demo2_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m,max;
        System.out.println("请输入第一个数：");
        int x=sc.nextInt();
        System.out.println("请输入第二个数：");
        int y=sc.nextInt();
        System.out.println("请输入第三个数：");
        int z=sc.nextInt();
        m=(x>y)?x:y;
        max=(m>z)?m:z;
        System.out.println("三个数中最大的数是："+max);
        sc.close();
    }
}
