package Java程序设计上机实训;
import java.util.Scanner;
public class Demo3_04_matrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] a = new int[4][4];
        System.out.println("请输入4行4列的矩阵：");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("矩阵的输出:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum += a[i][j];
            }
        }
        System.out.println("矩阵的和为：" + sum);
        sum=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(j==i){
                sum += a[j][i];
                }
            }
        }
        System.out.println("对角线元素的和为：" + sum);
        scanner.close();
    }
}
