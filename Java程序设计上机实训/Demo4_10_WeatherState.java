package Java程序设计上机实训;

public interface Demo4_10_WeatherState {
    public void showState();
}
class Weather{
    Demo4_10_WeatherState state;
    public void show(){
        state.showState();
    }
    public void setState(Demo4_10_WeatherState s){
        state=s;
    }
}
class CloudyLittleState implements Demo4_10_WeatherState{
    public void showState(){
        System.out.print("少云，北风2级，气温17摄氏度，空气质量优，相对湿度40%。");
    }
}
class LighgtRainState implements Demo4_10_WeatherState{
    public void showState(){
        System.out.print("小雨，气温22摄氏度，空气质量优，相对湿度70%。");
    }
}
class HeavyRainState implements Demo4_10_WeatherState{
    public void showState(){
        System.out.print("大雨，气温18摄氏度，空气质量优，相对湿度80%。");
    }
}
class CloudyDayState implements Demo4_10_WeatherState{
    public void showState(){
        System.out.print("多云，南风<3级，气温26摄氏度，空气质量优，相对湿度60%。");
    }
}