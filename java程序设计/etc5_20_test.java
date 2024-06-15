package java程序设计;
public class etc5_20_test {
    public static void main(String[] args) {
        Manager m1=new Manager("张三","经理001",6666.66);
        m1.work();
        Waiter w1=new Waiter("小明","服务员001");
        Waiter w2=new Waiter("小红","服务员002");
        w1.work();w1.services();
        w2.work();w2.services();
        Chef c1=new Chef("李四","厨师001");
        Chef c2=new Chef("王五","厨师002");
        c1.work();c1.services();
        c2.work();c2.services();
    }
}
