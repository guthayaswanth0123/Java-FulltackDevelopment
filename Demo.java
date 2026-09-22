
import java.util.*;
import java.lang.*;

public class Demo{
    public static void main(String[] args){
        String a = "2";
        String b = "6";
        char ch='9';
        int c=8;

        String result = String.valueOf(Integer.parseInt(a) * Integer.parseInt(b));
        System.out.println(result);

        System.out.println(ch-'0');
        System.out.println((char)(c+'0'));


        String s="Yaswanth";

        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        String res=new String(arr);
        System.out.println(res);
    }
}