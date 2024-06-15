package Java程序设计上机实训;
public class Demo4_01_Teacher {
    private String name;
    private int age;
    public Demo4_01_Teacher(String name, int age){
        this.name = name;
        if(age<=0){
            age=-age;
        }
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void teach(){
        System.out.println(name+"老师在上课");
    }
    public void prepare(){
        System.out.println(name+"；老师在备课");
    }
}

