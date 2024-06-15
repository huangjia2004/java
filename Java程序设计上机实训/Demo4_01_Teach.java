package Java程序设计上机实训;
public class Demo4_01_Teach {
    public static void main(String[] args) {
        System.out.println("以下是老师的姓名和年龄：");
        Demo4_01_Teacher teacher = new Demo4_01_Teacher("张三",30);
        System.out.println("姓名为"+teacher.getName());
        System.out.println("年龄为"+teacher.getAge());
        System.out.println("以下是教师的成员方法：");
        teacher.teach();
        teacher.prepare();
    }
}
