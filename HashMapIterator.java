import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterator {

    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"CHinnu");
        map.put(2,"Deepthan");
        map.put(3,"Navilan");
        Iterator itr=map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry me=(Map.Entry)itr.next();
            System.out.println(me.getKey()+"Key="+me.getValue());
        }
    }
    
}
