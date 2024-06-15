package Java程序设计上机实训;
public class Demo4_04_Vehice {
    double speed;
    int power;
    void speedUp(int s){
        speed=s+speed;
    }
    void speedDown(int d){
        speed=speed-d;
    }
    void setPower(int p){
        power=p;
    }
    int getPower(){
        return power;
    }
    double getSpeed(){
        return speed;
    }
}
