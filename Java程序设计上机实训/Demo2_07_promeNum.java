package Java程序设计上机实训;
public class Demo2_07_promeNum {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <200;i+=2){
            boolean isPrime = false;
            for(int j =2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
                else{
                    isPrime = true;
                }
            }
            if(isPrime==true) {
                count++;
                System.out.print(i+" ");
                if(count%5==0){
                    System.out.println();
                }
            }
            
        }
        System.out.println();
        System.out.println("素数的个数的："+count);
    }
}
