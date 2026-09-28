public class arrays {
    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
        int[] c={1,4,6,99,88,67};
        for(int i=0;i<c.length;i++ ){
            int min=i,temp=0;
            for(int j=i+1;j<c.length;j++){
                if(c[j]<c[min]){
                    min=j;
                }
            }
            temp=c[i];

            c[i]=c[min];
            c[min]=temp;
        }
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);

        }
        int[] d={2,10,7,5,6,4};
        int temp,j;
        for(int i=1;i<d.length;i++){
            temp=d[i];
            j=i;
            while(j>0 && d[j-1]>temp){
                d[j]=d[j-1];
                j--;
            }
            d[j]=temp;

        }
        for(int i=0;i<d.length
             ;i++){
            System.out.println(d[i]);
            
        }
    }
    
}
