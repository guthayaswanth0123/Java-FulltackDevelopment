public class ExceptionDemo {
    public static void main(String[] args){
        // int i=9;
        // int j=0;
        // try{
        //     j=18/i; //if it is error it thows an object uisng catch we have to handle
        // }
        // catch(Exception e){
        //     System.out.println("Something is wrong"+ e);
        // }
        // System.out.println(i);
        // System.out.println("Bye");


        //try with multiple catch blocks

        int i=0;
        int j=0;
        String str=null;
        int nums[]=new int[5];

    //    try{
    //         j=18/i;
    //         System.out.println(nums[1]);
    //         System.out.println(nums[5]);
    //     }catch(Exception e){ //in above try we have 2 types of exceptions for every exception it thows same messgae 
    //         System.out.println("Cannot divide by zero");
    //     }
    //     System.out.println(i);
    //     System.out.println("Bye"); 




    try{
        j=18/9;
        System.out.println(str.length());
        System.out.println(nums[1]);
        System.out.println(nums[5]);
    }catch(ArithmeticException e){ 
        System.out.println("Cannot divide by zero");
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("You are try to accesing out of bound array elements");
    }catch(Exception e){
        System.out.println("Something went wrong" + e);
    }
    System.out.println(i);
    System.out.println("Bye");
    }
}
