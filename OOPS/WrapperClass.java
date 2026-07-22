public class WrapperClass{
    public static void main(String[] args){
        int n1=8; // n1 is primitive variable
        //Integer num= new Integer(num); //this is called boxing
        Integer num = n1; // autoboxing

        int num2 = num.intValue(); // unboxing

        //int num2 =num;//auto-unboxing

        System.out.println(num2);

        String str="12";
        int num3=Integer.parseInt(str);
        System.out.println(str*3);

    }
}