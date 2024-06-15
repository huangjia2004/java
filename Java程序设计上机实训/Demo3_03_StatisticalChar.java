package Java程序设计上机实训;
import java.util.Scanner;
public class Demo3_03_StatisticalChar {
    public static void main(String[] args) {
        int digital=0;
        int character=0;
        int other=0;
        int blank=0;
        char[] ch=null;
        System.out.println("请输入一行字符：");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='0'&&ch[i]<='9'){
                digital++;
            }
            else if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z'){
                character++;
            }
            else if(ch[i]==' '){
                blank++;
            }
            else{
                other++;
            }
        }
        System.out.println("数字："+digital);
        System.out.println("字符："+character);
        System.out.println("空格："+blank);
        System.out.println("其他："+other);
    }
}
