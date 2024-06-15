import java.util.Scanner;
public class 试验七_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m,n;
        System.out.println("请输入m:");
        m=scanner.nextInt();
        System.out.println("请输入n:");
        n=scanner.nextInt();
        scanner.close();
        int a[][] =new int [n][m];
        int max=n*m;
        int i=0,j=0,count=1,flag=0;
        while(count<max){
            for(;j<m-1-flag;j++){
                if(count>max){
                    break;
                }
                a[i][j]=count++;
            }
            for(;i<n-1-flag;i++){
                if(count>max){
                    break;
                }
                a[i][j]=count++;
            }
            for(;j>flag;j--){
                if(count>max){
                    break;
                }
                a[i][j]=count++;
            }
            for(;i>flag;i--){
                if(count>max){
                    break;
                }
                a[i][j]=count++;
            }
            flag++;i++;j++;
        }
        
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
}
