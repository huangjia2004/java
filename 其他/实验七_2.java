import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class 实验七_2 {
    @SuppressWarnings({ "rawtypes" })
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m,n;
        System.out.println("请输入m:");
        m=scanner.nextInt();
        System.out.println("请输入n:");
        n=scanner.nextInt();
        int a[][] =new int [n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j]=scanner.nextInt();
            }
        }
        scanner.close();
        List ans = new ArrayList();
        ans=spiralOrder(a);
        System.out.println(ans);
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static List < Integer > spiralOrder(int[][] matrix) {
        List ans = new ArrayList();
        if (matrix.length == 0)
            return ans;
        int r1 = 0, r2 = matrix.length - 1;
        int c1 = 0, c2 = matrix[0].length - 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++) ans.add(matrix[r1][c]);
            for (int r = r1 + 1; r <= r2; r++) ans.add(matrix[r][c2]);
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--) ans.add(matrix[r2][c]);
                for (int r = r2; r > r1; r--) ans.add(matrix[r][c1]);
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return ans;
    }
}