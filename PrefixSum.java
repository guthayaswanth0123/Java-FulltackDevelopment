import java.util.*;
public class PrefixSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{7,6,9,3,2,6,8,9};
        int n=arr.length;
        int ps[]=new int[n];
        ps[0]=arr[0];
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(ps));
        int l=2;
        int r=6;
        long sum=ps[r];
        if(l>0){
            sum-=ps[1];
        }
        System.out.println(sum);
    }
}
