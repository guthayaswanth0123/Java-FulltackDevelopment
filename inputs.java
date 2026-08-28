import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputs {
    public static void main(String[] args)  throws IOException {
        // System.out.println("Enter a number");
        // int num = System.in.read(); //it will give assci of a number
        // System.out.println(num);
        // System.out.println(num-48);


        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in); // bufferdreade is resoulrces after using resourecs we have to olse it
        int num=Integer.parseInt(br.readLine());
        System.out.println(num);
        br.close();

    }
}
