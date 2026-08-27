//Enum = fixed/limited set of values.
//In Java, an enum (enumeration) is a special type used when a variable should have one value from a fixed set of constants.

//in java enum class extends it enum parent class
enum Status{ //status is a class
    running,falied,processing,sucess;//these are all objects
}

public class Enum{
    public static void main(String[] args){
        // Status s=Status.running;
        // System.out.println(s);
        // System.out.println(s.ordinal());
        // Status[] ss=Status.values();
        // System.out.println(ss[0]);
        // for(Status s:ss){
        //     System.out.println(s);
        // }



        Status s=Status.sucess;

        switch (s) {
            case running:
                System.out.println("All Good");
                break;
            case falied:
                System.out.println("Try Again");
                break;
            case processing:
                System.out.println("Wait for some time");
                break;
            case sucess:
                System.out.println("Done");
                break;
            default:
                break;
        }
        if(s==Status.running){
            System.out.println("All Good");
        }else if(s==Status.falied){
            System.out.println("Try Again");
        }else if(s==Status.processing){
            System.out.println("Wait for some time");
        }else{
            System.out.println("Done");
        }
    }
}