import java.util.*;



public class map1 {
    public static void main(String[] args){
        Map<Integer,Integer>mp=new HashMap<>();

        mp.put(101,28);
        mp.put(102,29);
        mp.put(103,30);

        System.out.println(mp);
        System.out.println(mp.get(102));

    }
}
