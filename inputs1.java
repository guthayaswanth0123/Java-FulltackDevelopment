import java.io.BufferedReader;
import java.io.InputStreamReader;

public class inputs1 {
    public static void main(String[] args) {
        int num=0;
        BufferedReader br=null;
        try{
            InputStreamReader in=new InputStreamReader(System.in);
            br=new BufferedReader(in);
            num=Integer.parseInt(br.readLine());
            System.out.println(num);
        }finally{  // it used to close resources and it exceution any time regardless exception occirs or not
            br.close();
        }
    }
    
}
