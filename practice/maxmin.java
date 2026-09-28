import java.util.Scanner;
public class maxmin {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements you want to enter in the array");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element of the array");
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("your max element is: "+ max);
        int min=a[0];
        for(int i=1;i<n;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("your min element is:"+min);
        }
    
}

