

//iterable (interface)
//collection (interface)

import java.util.*;


// public class ArrayList1{
//     public static void main(String[] args){
        // Collection nums=new ArrayList();

        // // List<Integer>nums=new ArrayList<>();
        // // ArrayList<Integer>nums=new ArrayList<>();

        // nums.add(6);
        // nums.add(7);
        // nums.add(8);
        // nums.add(9);
        // nums.add(10);
        // System.out.println(nums);

        // for(int n:nums){ // not work because here nums items are not interger values it objects because no where we mention elemnts are inetges
        //     System.out.println(n);
        // }


        




public class ArrayList1{
    public static void main(String[] args){
        // Collection<Integer> nums=new ArrayList<Integer>();
        
        List<Integer> nums=new ArrayList<Integer>();

        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        System.out.println(nums.get(3));
        // for(int n:nums){
        //     System.out.println(n);
        // }

    }
}
