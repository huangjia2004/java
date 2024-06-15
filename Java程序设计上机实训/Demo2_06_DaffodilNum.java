package Java程序设计上机实训;
public class Demo2_06_DaffodilNum {
    public static void main(String[] args) {
        int gw,sw,bw;
        for(int n=101;n<1000;n++){
            bw=n/100;
            sw=n%100/10;
            gw=n%10;
        if(bw*bw*bw+Math.pow(sw, 3)+Math.pow(gw, 3)==n){
            System.out.println(n+"是一个水仙花数");
        }
        }

    }
}
