public class Factorial {
    
    public static void main(String[] args){
        int n=3;
        System.out.println("Factorial of "+n+" is "+ fact(n));
    }

    public static int fact(int n){

        return n==0?1:n*fact(n-1);
    }
}
