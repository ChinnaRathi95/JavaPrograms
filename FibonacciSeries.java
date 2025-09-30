public class FibonacciSeries {

    public static void main(String[] args){

        int a=0;
        int b=1;
        int n=20;
        System.out.println("Fibonacci series\n"+a+"\n"+b);
        for(int i=0;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
    
}
