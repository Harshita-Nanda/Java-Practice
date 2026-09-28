import java.util.Scanner;
public class searching {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n;i++){
            System.out.println("Enter the element you want to add in the array");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int item=sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
            if(arr[i]==item){
                System.out.println("Element found at "+ i +" index");
                flag=1;            
            }
        }
        if(flag==0){
            System.out.println("Element not found!");
        }
    }
    
}
