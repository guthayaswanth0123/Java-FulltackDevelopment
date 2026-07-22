class Calc{
   public int add(int n1,int n2){
    return n1+n2;
   }
}
class AdvCalc extends Calc{//this is method overiding
    public int add(int n1,int n2){
        return n1+n2+1;
    }
}



public class MethodOverriding{
    public static void main(String[] args){
        AdvCalc obj=new AdvCalc();//it will give priority to you then parent 
        int r=obj.add(4,5);
        System.out.println(r);
    }
}