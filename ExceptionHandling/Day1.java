//Satements:
//Normal statements 
//critical statements


public class Day1 {
    public static void main(String[] args){
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0){
                throw new ArithmeticException("Invalid Operation");
            }
        }catch(ArithmeticException e){
            j=18/1;
            System.out.println("tahts the defaults output..." + e);

        }catch(Exception e){
            System.out.println("Something went wrong....");
        }
        System.out.println("Bye");
        System.out.println("Yaswnath");
    }
}
