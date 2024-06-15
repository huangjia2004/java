import java.io.*;
public class ArrayC1 {
    public static void main(String[] args) throws IOException {
        BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
        int a[],i,temp;
        String c;
        System.out.println("Input the number of array elements!"); 
        c=keyin.readLine();
        temp=Integer.parseInt(c);
        a=new int[temp];
        System.out.println("Input "+temp+" number.One per line!"); 
        for(i=0;i<a.length;i++){
            c=keyin.readLine();
            a[i]=Integer.parseInt(c);
        }
        System.out.println("Array a");
        for(i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
    }
}
