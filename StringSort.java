import java.util.ArrayList;
import java.util.Arrays;

public class StringSort {
    public static void main(String[] args){

        //string comparison. == and .equals
        String st1=new String("Scalar");
        String str2=new String("Scalar");
        System.out.println(st1==str2); //false, because both have different addresses in the memory
        System.out.println(st1.equals(str2));

        //abcdefghijklmnopqrstuvwxyz
        //Sort the string
        String st2="zyxwvutsrqponmlkjihgfedcba";  //If i enter SCalar then i get S in the first as it sorts using ASCII number.
        char str3[]=st2.toCharArray(); //convert the string to character array
        Arrays.sort(str3); //then use the Arrays function sort to sort the characters
        String newString=new String(str3); //convert the sorted array to string again and print it.
        System.out.println(newString);


        // sort using for loop
        
        for(int i=0;i<=str3.length-1;i++){
            for(int j=i+1;j<=str3.length-1;j++){
                if(str3[i]>str3[j]){
                    char m=str3[j];    //swap the two elements
                    str3[j]=str3[i];
                    str3[i]=m;
                }
            }
            System.out.print(str3[i]);
        }

        //Sort using ArrayList.Collections
        ArrayList<String> st=new ArrayList<String>();
        st.add("af");
        st.add("tq");
        st.add("ffer");
        st.add("aaaa");
        st.sort(null);
        System.out.println("\n"+st);

        //Sort in reverse alphabetical order
        st.sort((a,b)->{return -1 * a.compareTo(b);}); //lambda expression.A lambda expression in Java provides a compact way to represent an anonymous function, which is a function without a name. It is essentially a shorter way of writing an implementation of a method for later execution.  lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
        System.out.println("\nReverse alphabetical order"+st);
    }
    
}
