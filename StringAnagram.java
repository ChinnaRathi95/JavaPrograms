import java.util.Arrays;

public class StringAnagram {

    public static void main(String[] args){
        String str1="new";
        String str2="ewnr";
        char[] ar1=str1.toCharArray();
        char[] ar2=str2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        if(Arrays.equals(ar1, ar2)) //checks if both are equal
            System.out.println("Anagram");
        else
            System.out.println("Not an Anagram");

    }
}