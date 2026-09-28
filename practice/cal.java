import java.util.Scanner;
public class cal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        int a = s.nextInt();
        System.out.println("enter second number");
        int b = s.nextInt();
    \    System.out.println("enter symbol(+,-,*,/)");
        String sym = s.next();
        int res;
        switch(sym){
            case"+": res=a+b;
                   System.out.println(res);
                   break;
            case"-": res=a-b;
                    System.out.println(res);
                    break;
            case"*":res=a*b;
                   System.out.println(res);
                   break;
            case"/": res=a/b;
                   System.out.println(res);
                   break;
            default: System.out.println("invalid system");
                    break;
               
    }
    
}
}

