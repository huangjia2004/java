package Java程序设计上机实训;

public class Demo6_02_WrapperClass {
    public static void main(String[] args) {
        Integer i1=128;
        Integer i2=128;
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));
        i1=10;
        i2=10;
        System.out.println(i1==i2);
    }
}
