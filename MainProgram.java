//import java.lang.*;

import java.util.Scanner;

public class MainProgram {
    public static void main(String args[]){
        int n1=0,n2=1;
        int n3;
        System.out.println("HelloWorld");
        System.out.println("First 10 Fibonacci series\n"+n1+"\n"+n2);
        for(int i=0;i<=10;i++){
            n3=n1+n2;
            System.out.println("\n"+n3);
            n1=n2;
            n2=n3;
        }
    
    }

}

