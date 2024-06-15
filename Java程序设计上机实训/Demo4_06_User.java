package Java程序设计上机实训;
public class Demo4_06_User {
    public static void main(String[] args) {
        Demo4_06_CD dataCd = new Demo4_06_CD();
        int b[]={1,2,3,4,5,6,7,8};
        dataCd.setSize(b.length);
        dataCd.setContent(b);
        int a[]=dataCd.getContent();
        System.out.println("dataCd上的内容：");
        for(int i=0; i<a.length; i++){
            System.out.printf("%sd", a[i]);
        }
        Demo4_06_Computer computerIMB = new Demo4_06_Computer();
        computerIMB.putCD(dataCd);
        System.out.println("\n将dataCD上的内容复制到计算机：computerIMB。");
        computerIMB.copyToComputer();
        System.out.println("computerIMB上的内容：");
        computerIMB.showData();
        int m=12;
        System.out.println("computerIMB上将每个数据增加"+m+"。");
        computerIMB.addData(m);
        System.out.println("computerIMB将增值后的数据复制到CD：dataCD");
        computerIMB.copyToCD();
        System.out.println("dataCD上的内容：");
        a=dataCd.getContent();
        for(int i=0; i<a.length; i++){
            System.out.printf("%3d",a[i]);
        }
    }
}
