package Java程序设计上机实训;

public class Demo4_10_WeatherForecast {
    public static void main(String[] args) {
        Weather weatherBeijing = new Weather();
        System.err.print("\n今天白天：");
        weatherBeijing.setState(new CloudyDayState());
        weatherBeijing.show();
        System.out.print("\n今天夜晚：");
        weatherBeijing.setState(new LighgtRainState());
        weatherBeijing.show();
        System.out.print("转：");
        weatherBeijing.setState(new HeavyRainState());
        weatherBeijing.show();
        System.out.print("\n明天白天：");
        weatherBeijing.setState(new LighgtRainState());
        weatherBeijing.show();
        System.out.print("\n民天夜晚：");
        weatherBeijing.setState(new CloudyLittleState());
        weatherBeijing.show();
    }
}
