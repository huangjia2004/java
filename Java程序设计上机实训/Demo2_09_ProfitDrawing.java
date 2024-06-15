package Java程序设计上机实训;
import java.util.Scanner;
public class Demo2_09_ProfitDrawing {
    public static void main(String[] args) {
    double x=0,y=0;
    System.out.print("输入当月利润(万元)：");
    Scanner scanner = new Scanner(System.in);
    x=scanner.nextDouble();
    if(x>0&&x<=10){
        y=x*0.1;
    }
    else if(x>10&&x<=20){
        y=10*0.1+(x-10)*0.075;
    }
    else if(x>20&&x<=40){
        y=10*0.1+10*0.075+(x-20)*0.05;
    }
    else if(x>40&&x<=60){
        y=10*0.1+10*0.075+20*0.05+(x-40)*0.03;
    }
    else if (x>60&&x<=100){
        y=20*0.175+20*0.05+20*0.03+(x-60)*0.015;
    }
    else if (x>100) {
        y=20*0.175+40*0.08+40*0.015+(x-100)*0.01;
    }
    System.out.println("应提取的奖金是："+String.format("%.2f",y)+"万元");
    scanner.close();
}
}
