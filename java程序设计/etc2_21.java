package java程序设计;
import java.util.Scanner;
public class etc2_21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年份（注：必须大于1990）");
        int year=sc.nextInt();
        System.out.println("请输入月份：");
        int month=sc.nextInt();
        boolean isLeapYear;
        if ((year%4==0&&year%100!=0)||(year%400==0)) {
            System.out.println(year+"闰年");
            isLeapYear=true;
        }
        else {
            System.out.println(year+"平年");
            isLeapYear=false;
        }
        int day;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day=30;
                break;
            case 2:
                if (isLeapYear) {
                    day=29;
                }
                else {
                    day=28;
                }
                break;
            default:
                day=0;
                break;
            }
            System.out.println(year+"年"+month+"月共有"+day+"天");
        sc.close();
        }
}
