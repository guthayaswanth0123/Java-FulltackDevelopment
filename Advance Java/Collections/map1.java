import java.util.*;

//set + list = map

public class map1 {
    public static void main(String[] args){
        // Map<Integer,Integer>mp=new HashMap<>();
        Map<Integer,Integer>mp=new Hashtable<>(); // hashtable is synchronoized
        //Synchronized = one at a time / controlled access
        //menas two people try to use washroom at the same time it does not allow it says only one at a time
        

        mp.put(101,28);
        mp.put(102,29);
        mp.put(103,30);

        // System.out.println(mp);
        // System.out.println(mp.get(102));
        // System.out.println(mp.keySet());
        // System.out.println(mp.values());
        // System.out.println(mp.entrySet());

        for(int num:mp.keySet()){
            System.out.println(num +" "+mp.get(num));
        }





    }
}
