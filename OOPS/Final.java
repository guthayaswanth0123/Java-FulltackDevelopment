
final class Calc{ // inheritance is blocked when we decleare a class is final
    public void add(int a,int b){
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc{

}



public class Final{
    public static void main(String[] args){

        // final int num=9; // if varaibel is final we cannot modify
        // //num=8;// we get error
        // System.out.println(num);    
    }
}