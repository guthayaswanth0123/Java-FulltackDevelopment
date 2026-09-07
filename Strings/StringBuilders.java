import java.util.*;


public class StringBuilders {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        // char ch=sc.nextLine().charAt(0);

        // String s=sc.next();

        // System.out.println(s);


        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextLine();
        }

        for (String val : s) {
            System.out.println(val);
        }
    }
}
