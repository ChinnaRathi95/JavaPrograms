public class ReverseDigit {

    public static void main(String[] args){
        int n=123321;
        int c=n;
        int digit=0;
        int reversed=0;
        while(n!=0){
            digit=n%10;
            reversed=reversed*10+digit;
            n=n/10;
        }
        System.out.println(c+"\nReversed number:"+reversed);
        if(c==reversed)
            System.out.println("Palindrome");
        else    
            System.out.println("Not a palindrome");
    }
    
}
