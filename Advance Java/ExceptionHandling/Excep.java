//STATEMENTS:
//normal statements
//critical statements




public class Excep {
    public static void main(String[] args){
        // int i=0;
        // int j=18/i;
        // System.out.println(j);
        // System.out.println("Bye"); //it wont execute because in the above statement execption


        int i=0;
        int j=0;
        try{
            j=18/i; //critical statements
        }catch(Exception e){
            System.out.println("Somwthing went wrong...."+ e);
        }
        System.out.println("Bye");
    }
}
