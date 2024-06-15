package Java程序设计上机实训;
import java.util.Scanner;
public class Demo2_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y;
        boolean result;
        System.out.println("请输入第一个数字：");
        x=scanner.nextInt();
        System.out.println("请输入第二个数字：");
        y=scanner.nextInt();
        result=((x+y)%3==0||(x+y)%5==0);
        System.out.println(result);
        scanner.close();
    }
}
