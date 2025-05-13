import java.util.HashMap;

public class PracticeQuestions {
    public static void main(String[] args){

        //Reverse a string
        String str="eeerkkkqweop0";
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }

        //duplicates in an array
        int[] a={3,5,6,7,9,0,1,2,5,3,6,7,9,0,3,8,89,98,0,0,98,89};
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        
            for(int i=0;i<=a.length-1;i++){
                if(map.containsKey(a[i])){
                    int count=map.get(a[i]); //returns the count of the key
                    map.put(a[i],count+1);
                }
                else{
                    map.put(a[i],1);
                }
                
                
            }
            System.out.println(map);

        //swap two numbers without using third variable
        int ab=9;
        int ac=10;
        int ad=ab+ac;
        ab=ad-ab;
        ac=ad-ab;
        System.out.println("swpped numbers ab="+ab+ "ac="+ac);

        
        
    }
    
}
