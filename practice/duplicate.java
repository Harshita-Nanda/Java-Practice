import java.util.Scanner;
public class duplicate {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] a=new int[7];
        for(int i=0;i<7;i++){
           System.out.println("Enter the element of the array");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<7;i++){
            for(int j=i+1;j<7;j++){
               if(a[i]==a[j] && i!=j){
                System.out.println(a[j]);
                }
            }
        }
    
    }
}
