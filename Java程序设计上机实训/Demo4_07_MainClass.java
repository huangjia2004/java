package Java程序设计上机实训;
public class Demo4_07_MainClass {
    public static void main(String[] args) {
        Demo4_07_FamilyPerson.surname="李";
        Demo4_07_FamilyPerson fathre,sonOne,sonTwo;
        fathre=new Demo4_07_FamilyPerson();
        sonOne=new Demo4_07_FamilyPerson();
        sonTwo=new Demo4_07_FamilyPerson();
        fathre.setName("国庆");
        sonOne.setName("建设");
        sonTwo.setName("科技");
        System.out.println("父亲"+fathre.surname+fathre.name);
        System.out.println("大儿子"+sonOne.surname+sonOne.name);
        System.out.println("二儿子"+sonTwo.surname+sonTwo.name);
        fathre.setSurname("张");
        System.out.println("父亲"+fathre.surname+fathre.name);
        System.out.println("大儿子"+sonOne.surname+sonOne.name);
        System.out.println("二儿子"+sonTwo.surname+sonTwo.name);
    }
}