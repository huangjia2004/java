package Java程序设计上机实训;

public class Demo6_03_ProgramRuntimes {
    public static void main(String[] args) {
        long startime=System.currentTimeMillis();
        int sum=0;
        for(int i=0;i<999999999;i++){
            sum+=i;
        }
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间："+(endTime-startime)+"毫秒");
    }
}
