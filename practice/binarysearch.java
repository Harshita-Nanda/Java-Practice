import java.util.Scanner;
public class binarysearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array you want");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element of the array in sorted format");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int item=sc.nextInt();
        int li=0;
        int hi=(arr.length-1);
        int flag=0;
        
        while(li<=hi){
            int mid = (li + hi) / 2;
            if(arr[mid]==item){
                System.out.println("item found at "+mid+" index");
                flag=1;
                break;
            }
            else if(item>arr[mid]){
                li=mid+1;
            }  
            else{
                hi=mid-1;
            }
        }
        if(flag==0){
            System.out.println("item not found!");
        }
    }
    
}
