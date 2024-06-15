package Java程序设计上机实训;
public class Demo4_06_Computer {
    int data[];
    Demo4_06_CD includeCD;
    public void putCD(Demo4_06_CD cd){
        includeCD=cd;
        int sixe=includeCD.getSize();
        data=new int [sixe];
    }
    void copyToComputer(){
        int  [] b=includeCD.getContent();
        int min =Math.min(data.length,b.length);
        for(int i=0;i<min;i++){
            data[i]=b[i];
        }
    }
    public void addData(int m){
        for(int i=0;i<data.length;i++){
            data[i]=data[i] + m;
        }
    }
    void copyToCD(){
        includeCD.setContent(data);
    }
    void showData(){
        for(int i=0;i<data.length;i++){
            System.out.printf("%3d", data[i]);
        }
    }
}