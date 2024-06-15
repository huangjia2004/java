package Java程序设计上机实训;
import java.util.Arrays;
import java.util.Random;
public class Demo3_06_Arrays {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5,6,7};
        System.out.println(arr1.length);
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
        int [] arr2=new int [6];
        Arrays.fill(arr2,3);
        System.out.println(Arrays.toString(arr2));
        Arrays.fill(arr2,1,2,10);
        Random rand =new Random();
        Arrays.fill(arr2,rand.nextInt(100)+1);
        System.out.println(Arrays.toString(arr2));
        Integer [] arr3=new Integer[]{3,1,0,10,60,20,35,99};
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(arr3,(x,y)->x-y);
        Arrays.sort(arr3,(x,y)->y-x);
        System.out.println(Arrays.toString(arr3));
        String [] arr4 =new String[] {"Android","Java","Python","Go","R","Basic","C","C++","C#","HTML"};
        System.out.println(Arrays.toString(arr4));
        Arrays.sort(arr4,(s1,s2)->s1.compareTo(s2));
        System.out.println(Arrays.toString(arr4));
        Arrays.sort(arr4,(s1,s2)->s2.compareTo(s1));
        System.out.println(Arrays.toString(arr4));
        Arrays.sort(arr4,(s1,s2)->s1.length()-s2.length());
        System.out.println(Arrays.toString(arr4));
        Arrays.sort(arr4,(s1,s2)->s2.length()-s1.length());
        System.out.println(Arrays.toString(arr4));
    }
}