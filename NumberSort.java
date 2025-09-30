public class NumberSort {

    public static void main(String[] args){

        int a[]={1,2,4,5,8,6,9,978,7,10000,1};
        //find the second largest
        for(int i=0;i<=a.length-1;i++){
            for(int j=i+1;j<=a.length-1;j++){
                if(a[i]>=a[j]){
                    int b=a[j];
                    a[j]=a[i];
                    a[i]=b;
                }
            }
            System.out.println(a[i]);
        }

        System.out.println("The second largest element is"+a[a.length-2]);
    }
    
    
    
}
