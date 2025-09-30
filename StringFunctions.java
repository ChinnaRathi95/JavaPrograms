import java.util.Scanner;

public class StringFunctions {

    public static void main(String args[]){
        //reverse a string. Stringbuilder and string buffer can be used


        String str1;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a new string");
        str1=obj.nextLine();
        StringBuilder str2=new StringBuilder();
        str2.append(str1);
        str2=str2.reverse();
        System.out.println(str2);

        StringBuffer str3=new StringBuffer("Madam");
        System.out.println(str3.reverse());


        //using string in built functions like toCharArray and length()
        String str4="Automation";
        char c[]=str4.toCharArray();
        for(int i=c.length-1;i>=0;i--){
            System.out.print(c[i]);
        }

        //using split() function to reverse a string
        String str5;
        System.out.println("\nEnter a new string");
        str5=obj.nextLine();
        String str6[]=str5.split("");
        for(int i=str6.length-1;i>=0;i--){
            System.out.print(str6[i]);
        }

        //String length(), for char we use length without braces

        String str7="NewTestAutomationString";
        for(int i=str7.length()-1;i>=0;i--){
            System.out.println(str7.charAt(i)); //displays the character at the indicated position
        }

    }
    
}
