package Java程序设计上机实训;

public class Demo5_03_RemoveSpace {
    public static void main(String[] args) {
        String s="www.hynu.com";
        System.out.println("将com替换成edu.cn的结果："+s.replace("com", "deu.cn"));
        String s1="    w w w.c h i n a .c o m   ";
        System.out.println("去掉前后空格的结果："+s1.trim());
        System.out.println("去除字符串中所有空格的结果："+s.replace(" ", ""));
    }
}
