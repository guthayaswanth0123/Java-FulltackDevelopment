// import java.util.*;

// public class set1 {

//     public static void main(String[] args) {
//         Set<Integer> nums = new HashSet<Integer>(); // order not mantain and no sorted 
//         nums.add(6);
//         nums.add(7);
//         nums.add(8);
//         nums.add(9);
//         nums.add(10);
//         nums.add(7);
//         System.out.println(nums);
//     }
// }



import java.util.*;

public class set1 {

    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<Integer>(); //gives sorted order
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        nums.add(7);
        System.out.println(nums);
    }
}