import java.util.*;
public class F1{
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int arr[]=new int[]{6,2,9,3,1,0,5};
        // System.out.println(arr.length);
        // System.out.println(Arrays.toString(arr));
        // Arrays.sort(arr);
        // for(int i=0;i<n;i++){
        //     System.out.println(arr[i]);
        // }
        // sc.close();
        int arr[] = {6, 2, 9, 3, 1, 0, 5};
        Arrays.sort(arr,0,3);
        // for(int i=0;i < arr.length/2;i++){
        //     int tmp=arr[i];
        //     arr[i]=arr[arr.length-1-i];
        //     arr[arr.length-1-i]=tmp;
        // }
        System.out.println(Arrays.toString(arr));
    }
}