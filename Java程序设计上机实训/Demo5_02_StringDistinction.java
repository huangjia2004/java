package Java程序设计上机实训;

public class Demo5_02_StringDistinction {
    public static void main(String[] args) {
        String str1 = "string";
        String str2 = new String("string");
        String str3 = new String("string");
        String str4 = "string";
        System.out.println("str1==str4:"+str1 == str4);
        System.out.println("str2==str3:"+str2 == str3);
        System.out.println("str1==str3:"+str1 == str3);
    }
}
