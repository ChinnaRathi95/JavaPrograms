import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);
        System.out.println("enter number");
        int a=scan.nextInt();
        int digitCount=countDigit(a);
        System.out.println("the number of digits"+digitCount);
        scan.close();
    }

    public static int countDigit(int a){
        int count=0;

        while(a!=0){
            a=a/10;
            count++;
        }
        return count;
    }
    
}
