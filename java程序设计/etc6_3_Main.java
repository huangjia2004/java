package java程序设计;
import java.io.*;
import java.util.*;
public class etc6_3_Main {
    public static void main(String[] args) throws Exception {
        System.out.print(""+"-*- Welcome-*-\n"+"1-'testString'\n"+"2-'teststring2'\n"+"3-'testString3'\n" +"4-'testImmutableString'\n"+"q-EXIT \n");
        Scanner in=new Scanner(System.in);
        int code;
        while(-1!=(code=System.in.read())){
            char ch=(char)code;
            if('1'==ch){StringMethodOne.testStringOne();}
            if('2'==ch){StringMethodTwo.testStringTwo();}
            if('3'==ch){StringMethodThree.testStringThree();}
            if('4'==ch){StringImmutable.testImmutableString();}
            if('q'==ch){System.exit(0);}
        }
    }
}
class Person{
    int id;
    String name;
    public Person(int id,String name){
        this.id=id;
        this.name=name;
    }
    public Person(){
    }
}
class StringImmutable{
    public static void testImmutableString(){
        String s="abc";
        s.concat ("efg");
        System.out.println(s);
        s=s.concat ("efg");
        System.out.println(s);
        Person p1=new Person(1,"a");
        Person p2=new Person(2,"a");
        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name==p2.name);
        p1.name="c";
        System.out.println(p2.name);
    }
}
class StringMethodOne{
    public static void testStringOne(){
        String str1=new String("普通新建字符串");
        System.out.println("str1-"+str1);
        String str2="This is the new string";
        System.out.println("str2-"+str2);
        String[] auto={"Seat", "Ford", "KIA"};
        for(int i=0;i<auto.length; i++){
            String auto1=auto[i];
            System.out.println("auto["+i+"]="+auto1+";");
        }
        String strRez="字符串连接:"+auto[0]+"+"+auto[1]+"+"+auto[2];
        System.out.println("strRez="+strRez);
        String str="new string to test length";
        int length=str.length();
        System.out.println("This is length of string test "+length);
        String str3="last one symbol ";
        int last=str3.length()-1;
        char ch=str3.charAt(last);
        System.out.println(ch);
        int first=str3.length()-str3.length();
        char ch2=str3.charAt(0);
        System.out.println(ch2+"\n");
        for(int i=0;i<str2.length(); i++){
            char every_sybol=str2.charAt(i);
            System.out.println(every_sybol+"\t"+every_sybol);
        }
        String str4="1 000 000 000";
        char[] chArray=str4.toCharArray();
        for(int i=0; i<chArray.length; i++){
            if(chArray[i]==' '){
                chArray[i]='.';
            }
        }
        System.out.println(Arrays.toString(chArray));
        System.out.println(chArray);
        System.out.println("\n");
        String s="i can do it by myself";
        String name=s.substring(7,s.length()-4);
        for (int i=0;i<s.length(); i++){
            //System.out.print(i+"\t");
            System.out.printf("%5d",i);
            //int d=chArray[i];
        }
        System.out.println("");
        for (int i=0; i<s.length(); i++){
            char every_sybol=s.charAt(i);
            System.out.printf("%5c",every_sybol);
        }
        System.out.println("\n\n"+s);
        System.out.println("s.substring(7,s.length()-4)"+name);
        String domain=s.substring(14);
        System.out.println("s.substring(14)"+domain);
        System.out.println("***************************************************");
        String isbn="978 7 16 148410 0";
        String[]isbnParts=isbn.split("");
        System.out.println("图书编号:"+isbnParts[0]);
        System.out.println("地区码:"+isbnParts[1]);
        System.out.println("出版社代码:"+isbnParts[2]);
        System.out.println("出版序号:"+isbnParts[3]);
        System.out.println("校验位:"+isbnParts[4]);
        if(isbn.startsWith("9")){
            System.out.println("Sting starts with 9 symbol");
        }
    }
}
class  StringMethodThree{
    public static void testStringThree(){
        System.out.println("testString_three method is launched");
        String s=" dfdfdf ";
        String ss;
        ss=s.trim();
        System.out.println("String s|"+s+"|"+"s.length()="+s.length());
        System.out.println("String ss|"+s.trim()+"|ss.leight ()= "+ss.length());
    }
}
class  StringMethodTwo{
    public static void testStringTwo(){
        String s=null;
        System.out.println(s);
        s="";
        System.out.println("*"+s+"*");
        s=" ";
        System.out.println("*"+s+"*");
        s="Hello World!";
        System.out.println("stringLength()"+s.length());
        System.out.println("StringSubstring(5)"+s.substring(5));
        System.out.println("StringcharAt()"+s.charAt(6));
        String s2="Hello World!";
        System.out.println("String s("+s+")==String s2("+s2+")"+(s==s2));
        System.out.println("s.equals(s2):"+s.equals(s2));
        //s=null;
        if("Hello World!".equals(s))
            System.out.println("\"Hello World!\".equals(s)");
        if(s!=null && s.equals("Hello World!"))
            if(s.equals("Hello World!"))
                System.out.println("s.equals(\"Hello World!\")");
        if("HELLO World!".equalsIgnoreCase(s))
            System.out .println("\"HELLOWorld!\".equalsIgnoreCase(s)");
        System.out.println("to owerCase():"+s.toLowerCase());
        System.out.println("to UpperrCase():"+s.toUpperCase());
        if(s.startsWith("H"))
        System.out.println("s.startsWith(\"H\")");
        if(s.contains("world"))
        System.out.println(s.indexOf("?"));
        System.out .println(s.indexOf("!"));
        System.out.println(s.replace("Hello", "GoodBye"));
    }
}