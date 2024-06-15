import java.util.Scanner;
public class ArrayExchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[]=new int [10];
        System.out.println("请输入10个数：");
        for(int ifx=0;ifx<a.length;ifx++){
            a[ifx]=scanner.nextInt();
        }
        scanner.close();
        int temp;
        for(int x = 0;x<(a.length)/2;x++){
            temp=a[x];
            a[x]=a[a.length-1-x];
            a[a.length-1-x]=temp;
        }
        System.out.println(a.length);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
