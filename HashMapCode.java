import java.util.HashMap;

public class HashMapCode {
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>(); //key ,value pairs
        //Code to count the number of words in the srings that is repeated.
        //Create a string and split it and store in string array
        String str="I am new to this code of Hash map. Yes I am new to this code of Hash map. I I I I I I II";
        String[] str2=str.split(" "); //giving space as a delimiter that is separator
        for(int i=0;i<str2.length;i++)
            System.out.println(str2[i]);

        for(int i=0;i<str2.length;i++){
            if(map.containsKey(str2[i])){
                int count=map.get(str2[i]); //get returns the value of the key given which is stored in count variable
                map.put(str2[i],count+1); // we add the count and save it in the key if the key is repeated
            }
            else
                map.put(str2[i],1); //else if it is a new word we add the value as a new key value pair in the map.
        }
        System.out.println(map);

        //Code to count the number of characters that is repeated.
        String str3="I am new to this code of Hash map. Yes I am new to this code of Hash map. I I I I I I II";
        HashMap<String,Integer> map1=new HashMap<>();
        String[] str4=str3.split(""); //giving nothing as a delimiter separates the string to each characters.
        for(int i=0;i<str4.length;i++)
            System.out.println(str4[i]);

        for(int i=0;i<str4.length;i++){
            if(map1.containsKey(str4[i])){
                int count1=map1.get(str4[i]); //get returns the value of the key given which is stored in count variable
                map1.put(str4[i],count1+1); // we add the count and save it in the key if the key is repeated
            }
            else
                map1.put(str4[i],1); //else if it is a new word we add the value as a new key value pair in the map.
        }
        System.out.println(map1);

    }
    
}
