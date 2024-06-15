package Java程序设计上机实训;
import java.util.Scanner;
public class Demo2_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ge,shi,bai;
        double num;
        System.out.println("请输入三位数");
        num=sc.nextDouble();
        bai=(int)(num/100);
        shi=(int)(num%100/10);
        ge=(int)(num%10);
        System.out.println("个位数是"+ge);
        System.out.println("十位数是"+shi);
        System.out.println("百位数是"+bai);
        sc.close();
    }
}
