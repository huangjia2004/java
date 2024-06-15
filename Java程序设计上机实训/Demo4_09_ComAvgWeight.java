package Java程序设计上机实训;

public interface Demo4_09_ComAvgWeight{
    public double average(double x[]);
}
class SongGame implements Demo4_09_ComAvgWeight {
    public double average(double x[]){
        int count =x.length;
        double aver=0,temp=0;
        for(int i=0;i<count;i++){
            for(int j=i;j<count;j++){
                if(x[j]<x[i]){
                    temp=x[j];
                    x[j]=x[i];
                    x[i]=temp;
                }
            }
        }
        for(int i=1;i<count-1;i++){
            aver+=x[i];
        }
        if (count>2) {
            aver=aver/(count-2);
        }
        else{
            aver=0;
        }
        return aver;
    }
}
class School implements Demo4_09_ComAvgWeight{
    public double average(double x[]){
        int count =x.length;
        double aver=0,sum=0;
        for(int i=0;i<count-1;i++){
            sum=sum+x[i];
        }
        aver=sum/count;
        return aver;
    }
}