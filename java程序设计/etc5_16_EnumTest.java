package java程序设计;
enum SeasonEnum{
    SPRING,SUMMER,AUTUMN,WINTER;
}
public class etc5_16_EnumTest {
    public void judge(SeasonEnum s){
        switch (s){
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天henlen");
                break;
        }
    }
    public static void main(String[] args) {
        for(SeasonEnum s : SeasonEnum.values()){
            System.out.println(s);
        }
        new etc5_16_EnumTest().judge(SeasonEnum.WINTER);
    }
}