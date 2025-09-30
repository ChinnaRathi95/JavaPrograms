import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args){
        System.out.println("Enter number a: ");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        System.out.println("Enter number b: ");
        int b=scan.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Swapped numbers are,\na="+a+"\nb="+b);




        //swap numbers without using the third vaiable
        a=1000;b=200;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Swapped numbers are,\na="+a+"\nb="+b);

    }


 


    
}
