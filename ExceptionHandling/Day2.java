import java.io.*;

public class Day2 {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.println("Enter Your Name: ");
        String name = br.readLine();
        System.out.println(name);
        

        System.out.println("Enter Your Age: ");
        int age=Integer.parseInt(br.readLine());
        System.out.println(age);

    }
}
