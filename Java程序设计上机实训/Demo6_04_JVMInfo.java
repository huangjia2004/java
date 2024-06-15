package Java程序设计上机实训;

public class Demo6_04_JVMInfo {
    public static void main(String[] args) {
        Runtime rt=Runtime.getRuntime();
        System.out.println("处理器的个数："+rt.availableProcessors());
        System.out.println("空间大小:"+rt.freeMemory()/1024/10294);
        //System.out.println("最大可用内存大小："rt.maxMemory()/1024/1024);
    }
}
