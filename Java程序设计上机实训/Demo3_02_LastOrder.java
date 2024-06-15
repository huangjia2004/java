package Java程序设计上机实训;
import java.util.Scanner;
public class Demo3_02_LastOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入排成一圈的人数：");
        int n=sc.nextInt();
        boolean[] arr=new boolean[n];
        for (int i=0;i<arr.length;i++) {
            arr[i]=true;
        }
        int leftCount=n;
        int countNum=0;
        int index=0;
        while(leftCount>1){
            if(arr[index]==true){
                countNum++;
                if(countNum==3){
                    countNum=0;
                    arr[index]=false;
                    leftCount--;
                }
            }
            index++;
            if(index==n){
                index=0;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==true){
                System.out.print("原排在第"+(i+1)+"位的人留下来。");
            }
        }
        sc.close();
    }
}