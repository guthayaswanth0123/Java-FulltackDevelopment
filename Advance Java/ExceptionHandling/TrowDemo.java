public class TrowDemo {
    public static void main(String[] args) {
        int i=0;
        int j=0;

        try{
            j=18/i;
            if(j==0){
                throw new ArithmeticException("I dont wnat to print zero");
            }
        }catch(ArithmeticException e){
            j=18/1;
            System.out.println("Thats the default output "+ e);
        }catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println(i);
        System.out.println("Bye");
    }
}
