package Java程序设计上机实训;
public class Demo4_03_Test {
    public static void main(String[] args) {
        System.out.println("静态变量x="+Demo4_03_StaticVar.getX());
        //System.out.println("实例变量y="+Demo4_03_StaticVar.getY());出错error
        Demo4_03_StaticVar x = new Demo4_03_StaticVar();
        Demo4_03_StaticVar y = new Demo4_03_StaticVar();
        x.setX(1);
        x.setY(2);
        y.setX(3);
        y.setY(4);
        System.out.println("静态变量x.x="+x.getX());
        System.out.println("实例变量x.y="+x.getY());
        System.out.println("静态变量y.x="+y.getX());
        System.out.println("实例变量y.y="+y.getY());
    }
}
