package Java程序设计上机实训;
public class Demo4_04_User {
    public static void main(String[] args) {
        Demo4_04_Vehice car1,car2;
        car1=new Demo4_04_Vehice();
        car1.setPower(225);
        System.out.println("car1的功率为："+car1.getPower());
        car1.speedUp(100);
        System.out.println("car1当前的加速为："+car1.getSpeed());
        car1.speedDown(20);
        System.out.println("car1当前的减速为："+car1.getSpeed());
        car2=new Demo4_04_Vehice();
        car2.setPower(125);
        System.out.println("car2的功率为："+car2.getPower());
        car2.speedUp(80);
        System.out.println("car2当前的加速为："+car2.getSpeed());
        car2.speedDown(30);
        System.out.println("car2当前的减速为："+car2.getSpeed());
    }
}
