
import java.util.Scanner;
public class 实训任务六1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n =scanner.nextInt();
        scanner.close();
        int i,j;
        for(i=1;i<=2*n+3;i++){
            for(j=1;j<i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=(4*n+5)-2*(i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
