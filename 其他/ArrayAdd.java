class ArrayAdd{
    public static void main(String args[]){
        int c[][]={{1,2,3},{4,5,6},{7,8,9}};
        int d[][]={{2,2,2},{1,1,1},{3,3,3}};
        int i,j;
        int e[][]=new int [3][3];
        System.out.println("Array c");
        for(i=0;i<c.length;i++){
            for(j=0;j<c[i].length;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(" Array d");
    
        for(i=0;i<d.length;i++){
            for(j=0;j<d[i].length;j++){
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Array c+d");
        for(i=0;i<e.length;i++){
            for(j=0;j<e[i].length;j++){
                e[i][j]=c[i][j]+d[i][j];
                System.out.print(e[i][j]+" ");
            }
            System.out.println();
        }
    }
}