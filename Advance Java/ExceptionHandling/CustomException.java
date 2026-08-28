class YashException extends Exception{
    public YashException(String string){
        super(string);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int i=20;
        int j=0;

        try{
            j=18/i;
            if(j==0){
                throw new YashException("I dont wnat to print zero");
            }
        }catch(YashException e){
            j=18/1;
            System.out.println("Thats the default output "+ e);
        }catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println(i);
        System.out.println("Bye");
    }
}
