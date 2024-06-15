package Java程序设计上机实训;

public class Demo4_08_SaveMony {
    public static void main(String[] args) {
        int amount=10000;
        CityBank bank=new CityBank();
        bank.savedMoney=amount;
        bank.year=5.198;
        bank.setInterestRate(0.035);
        double interest=bank.computerInterest();
        BusinessBank bank2=new BusinessBank();
        bank2.savedMoney=amount;
        bank2.year=5.198;
        bank2.setInterestRate(0.035);
        double interest2=bank2.computerInterest();
        System.out.printf("两个银行利息相差%.2f\n", interest-interest2);
    }
}
