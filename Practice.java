
import java.util.*;
import java.lang.*;

public class Practice {
   
    
    public static void main(String args[]){
        // System.out.println("Enter the number for which u need to find Factorial");
        // Scanner scan=new Scanner(System.in);
        // int n=scan.nextInt();
        // System.out.println(fact(n));
        // scan.close();

        //reverseString();
        //stringSort();
        secondLargest();
        // int a[]={2,3,5,6,7,88,90,23,5,1};
        // Arrays.sort(a);
        //  for(int i=0;i<=a.length-1;i++){
        //     System.out.println(a[i]);
        // }
    }

    public static long fact(int n){
        return n==0?1:n*fact(n-1);
    }

    //Reverse a string

    public static void reverseString(){
        System.out.println("ENter a string to be reversed");
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String reverseStr="";
        for(int i=str.length()-1;i>=0;i--){
            reverseStr += str.charAt(i);
        }
        System.out.println("REverse of the string is "+ reverseStr);
    }

    //Sort the string

    public static void stringSort(){
        String str="chinn is a woman";
        char[] str2=str.toCharArray();
        Arrays.sort(str2);
        str2.toString();
        System.out.println(str2);

        ArrayList<String> ar=new ArrayList<String>();
        ar.add("Chinnu");
        ar.add("Deepthan");
        ar.sort(null);
        System.out.println(ar);

    }

    public static void secondLargest(){
        int a[]={2,3,5,6,7,88,90,23,5,1};
        Arrays.sort(a);
       
        for(int i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }
        boolean swapped;
        for(int i=0;i<=a.length-1;i++){
            swapped =false;
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swapped=true;
                }
                if(!swapped)
                    break;
            }
            
        }
        
        System.out.println("The second largest number is"+a[a.length-2]);
    }
}
