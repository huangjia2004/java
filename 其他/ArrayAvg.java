public class ArrayAvg {
    public static void main(String args[]){
        int c[]={1,2,3,4,5,6,7,8,9};
        int j;
        System.out.println("Array c");
        for(j=0;j<=8;j++)
        System.out.print(c[j]+" ");
        System.out.println();
        System.out.println("Array average");
        System.out.println(arrayAverage(c));
    }
    public static float arrayAverage(int d[]){
        float average=0;
        for(int i=0;i<d.length;i++)
        average=average+d[i];
        average=average/d.length;
        return average;
    }
}