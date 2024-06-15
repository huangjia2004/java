
import java.util.Scanner;
public class 实训任务六2 {
    public static void main(String[] args) {
        System.out.println("请输入圆的半径:");
        Scanner in =new Scanner(System.in);
        int radius = in.nextInt();
        paint(radius);
        in.close();
    }
    public static void paint(int r){
        int y = r*2;
        int x = 0;
        int c = 0;
        int z = 2;
        for(int j=r*2;j>=0;j=j-z){
            x=getX(r,y);
            System.out.print(getSpace(x)+"*");
            c=(r-x)*2;
            System.out.println(getSpace(c)+"*");
            y-=z;
        }
    }
    public static int getX(int r,int y){
            int x=y-r;
            double t=Math.sqrt((r*r)-(x*x));
            return (int)Math.round(r-t);
    }
    public static String getSpace(int i){
        String s = " ";
        for(int j=0;j<i;j++){
            s+="*";
        }
        return s;
    }
}