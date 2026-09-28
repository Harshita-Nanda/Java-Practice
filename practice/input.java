import java.util.Scanner;
class input {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter name");
        String name=s.next();
        System.out.println("enter age");
        int age= s.nextInt();
        System.out.println(name);
        System.out.println(age);
    }
    
}
