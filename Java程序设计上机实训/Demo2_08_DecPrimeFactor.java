package Java程序设计上机实训;
import java.util.Scanner;
public class Demo2_08_DecPrimeFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int n=scanner.nextInt();
        int k=2;
        System.out.print(n+"=");
        while (k<=n) {
            if(k==n){
                System.out.println(k);
                break;
            }
            else if(n%k==0){
                System.out.print(k+"*");
                n=n/k;
            }
            else k++;
        }
        scanner.close();
    }
}
