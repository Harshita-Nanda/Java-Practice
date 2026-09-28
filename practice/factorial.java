public class factorial {
    static int fact=1;
    public static void main(String[] args){
        int no=5, answer;
        factorial f= new factorial();
        answer=f.calcfact(no);
        System.out.println(answer);
    }
    int calcfact(int no){
        if (no>1){
            fact=fact*no;
            calcfact(no-1);
        }
        return fact;
    }

    
}
