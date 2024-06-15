package Java程序设计上机实训;
public class Demo4_08_Bank {
    int savedMoney;
    int year;
    double interest;
    double interestRate=0.29;
    public double computerInterest(){
        interest =year*interestRate*savedMoney;
        return interest;
    }
    public void setInterestRate(double rate){
        interestRate=rate;
    }
}
class CityBank extends Demo4_08_Bank {
    double year;
    public double computerInterest(){
        super.year=(int )year;
        double r=year-(int)year;
        int day=(int)(r*1000);
        double yearInterest=super.computerInterest();
        double dayInterest=day*0.0001*savedMoney;
        interest=yearInterest+dayInterest;
        System.out.printf("%d元存在城市银行%d年零%d天的利息：%.2f元\n",savedMoney,super.year,day,interest);
        return interest;
    }
}
class BusinessBank extends Demo4_08_Bank{
    double year;
    public double computerInterest(){
        super.year=(int )year;
        double r=year-(int)year;
        int day=(int)(r*1000);
        double yearInterest=super.computerInterest();
        double dayInterest=day*0.00012*savedMoney;
        interest=yearInterest+dayInterest;
        System.out.printf("%d元存在商业银行%d年零%d天的利息：%.2f元\n",savedMoney,super.year,day,interest);
        return interest;
    }
}
