package Java程序设计上机实训;
public class Demo4_02_TestCourse {
    public static void main(String[] args) {
        Demo4_02_Course course =new Demo4_02_Course();
        course.setCNo(10012791);
        course.setCN("Java程序设计");
        course.setSC(5);
        System.out.println("课程编号"+course.getCNo());
        System.out.println("课程名称"+course.getCN());
        System.out.println("学    分"+course.getSC());
        course.alSC();
        course.output();
    }
}
