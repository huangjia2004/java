package Java程序设计上机实训;

public class Demo4_11_RedCowForm {
    String formName;
    RedCow cow;
    Demo4_11_RedCowForm(){
    }
    Demo4_11_RedCowForm(String s){
        cow = new RedCow(160,865,7000);
        formName = s;
    }
    public void showCowMess(){
        cow.speak();
    }
    
    class RedCow{
        String cowName="红牛";
        int height,weight,price;
        RedCow(int h,int w,int p){
            height=h;
            weight=w;
            price=p;
        }
        void speak(){
            System.out.println(cowName+"身高："+height+"cm 体重："+weight+"kg");
            System.out.println("生活在"+formName);
        }
    }
}