

import java.util.*;

public class Com {
    public static void main(String []args){
        List<Integer> nums=new ArrayList<>();


        Comparator<Integer>  com=new Comparator<Integer>()
        {
            public int compare(Integer i,Integer j){
                if(i %10 > j %10){
                    return 1; // 1 means swap
                }else{
                    return -1;//-1 menas no swap
                }
            }
        };
        nums.add(43);
        nums.add(31);
        nums.add(62);
        nums.add(34);

        Collections.sort(nums,com);

        System.out.println(nums);
    }
}
