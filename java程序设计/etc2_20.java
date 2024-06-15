package java程序设计;
public class etc2_20 {
    public static void main(String[] args) {
        int line=9;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < line-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        line=9;
        for (int i = 0; i < 9; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < line-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
