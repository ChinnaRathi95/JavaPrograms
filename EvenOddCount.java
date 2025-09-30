import java.util.Scanner;

public class EvenOddCount {

    public static void main(String[] args){

        int[] c={3,4,6,8,9,233,44,5,99,0,88,9,2,0,0,8,9,9,0};
        int even=0;
        int odd=0;
        int zero=0;
        for (int i=0;i<=c.length-1;i++){
            if(c[i]==0)
                zero++;
            else if(c[i]%2==0) 
                even++;
            else
                odd++;
            System.out.println(c[i]);
        }
        System.out.println("THe number of even numbers entered:"+even+"\nThe number of odd numbers entered:"+odd+"\n the number of zeroes:"+zero);
    }

    //We can also get the number and perform digit wise by using n=n/10 to remove trhe last number
    
}
