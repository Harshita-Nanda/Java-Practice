public class diagonal {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
             for(int k=1;k<=i;k++){
                if(i>=2 && k<=i-1){
                System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println("");
            
        }
    }
    
}
