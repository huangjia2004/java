package Java程序设计上机实训;
import java.util.Scanner;
public class Demo3_01_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] =new int [20];
        System.out.println("请输入多个整数：(输入-1代表结束)");
        int i=0,j;
        do{
            a[i]=scanner.nextInt();
            i++;
        }while(a[i-1]!=-1);
        scanner.close();
        System.out.println("你输入的数组为：");
        for(j=0;j<i-1;j++){
            System.out.print(a[j]+" ");
        }
        System.out.println("\n数组的逆序输出为：");
        for(j=i-2;j>=0;j=j-1){
            System.out.print(a[j]+" ");
        }
    }
}

