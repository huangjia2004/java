package Java程序设计上机实训;

public class Demo5_04_StringJudge {
    public static void main(String[] args) {
        String s1="String";
        String s2="Str";
        System.out.println("判断是否以字符串Str开头："+s1.startsWith("Str"));
        System.out.println("【判断是否以ng结尾："+s1.endsWith("ng"));
        System.out.println("判断是否为空："+s1.isEmpty());
        System.out.println("判断是否包含字符串tri："+s1.contains("tri"));
        System.out.println("判断字符串是否相等："+s1.equals(s2));
        System.out.println("判断字符串是否相等："+s1.equalsIgnoreCase(s2));

    }
}
