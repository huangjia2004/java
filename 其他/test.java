import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[]=new int [10];
        System.out.println("请输入10个数：");
        for(int i=0;i<10;i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int sum=0,max=arr[0],min=arr[0];
        for(int i=0;i<10;i++){
            sum+=arr[i];
            if(arr[i]>max){max=arr[i];}
            if(min>arr[i]){min=arr[i];}
        }
        System.out.println("求和："+sum);
        System.out.println("最大值"+max);
        System.out.println("最小值"+min);
        System.out.println("平均值"+String.format("%.3f", (float)sum/10));
        test.Sort(arr,10,0);
        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Sort(int []a,int n,int dir){
        int temp;
        if(dir==0){
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    }
                }
            }
        }
        else{
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    }
                }
            }
        }
    }
}