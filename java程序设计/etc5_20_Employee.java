package java程序设计;
interface VIP {
    public abstract void services();
}
public class etc5_20_Employee{
    private String name;
    private String id;
    public etc5_20_Employee(){
    }
    public etc5_20_Employee(String name, String id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
}
class Chef extends etc5_20_Employee implements VIP{
    public Chef(){
        super();
    }
    public Chef(String name, String id){
        super(name,id);
    }
    public void work(){
        System.out.println("厨师在炒菜");
    }
    public void services(){
        System.out.println("厨师为VIP做紧致的菜");
    }
}
class Waiter extends etc5_20_Employee implements VIP{
    public Waiter(){
        super();
    }
    public Waiter(String name, String id){
        super(name,id);
    }
    public void work(){
        System.out.println("服务员在上菜");
    }
    public void services(){
        System.out.println("服务员为VIP特殊服务");
    }
}
class Manager extends etc5_20_Employee{
    private double money;
    public Manager(){
        super();
    }
    public Manager(String name, String id,double money){
        super(name,id);
        this.money = money;
    }
    public void work(){
        System.out.println("经理在管理酒店");
    }
}