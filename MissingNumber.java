public class MissingNumber {

    public static void main(String[] args){
        int a[]={1,2,3,4,5,6,7,9,10,11};
        int n=a.length+1;
        int actualSum=(n*(n+1))/2;
        System.out.println(actualSum);
        int sum=0;
        for(int i=0;i<=a.length-1;i++){
            sum+=a[i];
        }

        System.out.println(actualSum-sum);

    }
}
