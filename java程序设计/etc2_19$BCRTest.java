package java程序设计;
public class etc2_19$BCRTest {
    public static void main(String args[]) {
        etc2_19$BCRTest test =  new etc2_19$BCRTest();
        test.testBreak();
        test.testContinue();
        System.out.println("i的返回值=" + testReturn());
    }

    public void testContinue() {
        System.out.println("测试continue");
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("i=" + i);
        }
    }

    public void testBreak() {
        System.out.println("测试break");
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("i=" + i);
        }
    }

    public static int testReturn() {
        System.out.println("测试return");
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                return i;
            }
            System.out.println("i=" + i);
        }
        return 0;
    }
}