package Java程序设计上机实训;
import java.util.Scanner;
public class Demo4_05_Overloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("圆的面积---------1");
        System.out.println("圆柱体体积-------2");
        System.out.println("圆柱体的表面积---3");
        System.out.print("请输入相应的数字：");
        int n=scanner.nextInt();
        switch (n) {
            case 1:
                System.out.print("请输入圆的半径：");
                double r1=scanner.nextDouble();
                double s1=area(r1);
                System.out.print("圆的面积为："+String.format("%.2f",s1));
                break;
            case 2:
                System.out.print("请输入圆柱体的半径：");
                float r2=scanner.nextFloat();
                System.out.print("请输入圆柱体的高度：");
                float h2=scanner.nextFloat();
                double s2=area(r2,h2);
                System.out.print("圆柱体的体积为："+String.format("%.2f",s2));
                break;
            case 3:
                System.out.print("请输入圆柱体的半径：");
                double r3=scanner.nextDouble();
                System.out.print("请输入圆柱体的高度：");
                double h3=scanner.nextDouble();
                double s3=area(r3,h3);
                System.out.println("圆柱体的表面积为："+String.format("%.2f",s3));
                break;
        }
        scanner.close();
    }
    public static double area(double r){
        return r*r*Math.PI;
    }
    public static double area(float r,float h){
        return Math.PI*r*r*h;
    }
    public static double area(double r,double h){
        return 2*Math.PI*r*h+2*Math.PI*r*r;
    }
}
