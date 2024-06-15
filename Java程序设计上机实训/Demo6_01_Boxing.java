package Java程序设计上机实训;
public class Demo6_01_Boxing {
    public static void main(String[] args) {
        int v=30;
        Integer i=new Integer(v);
        System.out.println(i.getClass().getName());
        Object obj=i;
        int r=i.intValue();
        r+=50;
        System.out.println(r);
    }
}