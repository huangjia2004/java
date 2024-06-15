package Java程序设计上机实训;
public class Demo4_02_Course {
    private int CNo;
    private String CN;
    private double SC;
    public Demo4_02_Course(){}
    public Demo4_02_Course(int CNo,String CN,double SC){
        this.CNo=CNo;
        this.CN=CN;
        this.SC=SC;
    }
    public void setCNo(int CNo){
        this.CNo=CNo;
    }
    public void setCN(String CN){
        this.CN=CN;
    }
    public void setSC(double SC){
        this.SC=SC;
    }
    public int getCNo(){
        return this.CNo;
    }
    public String getCN(){
        return this.CN;
    }
    public double getSC(){
        return this.SC;
    }
    public void alSC(){
        if(SC<=4){
            System.out.println(CN+"学分："+SC);
        }
        else {
            while(SC>4){
                SC--;
            }
                System.out.println(CN+"学分修改后："+SC);
        }
    }
    public void output(){
        System.out.println("课程信息"+CNo+"，"+CN+","+SC);
    }
    
}
