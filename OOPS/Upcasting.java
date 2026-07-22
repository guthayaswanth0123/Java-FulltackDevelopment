
class A{
    public void show(){
        System.out.println("In A show");
    }
}

class B extends A{
    public void show1(){
        System.out.println("In B show");
    }
}


public class Upcasting{
    public static void main(String[] args){
        A obj= (A)new B(); // A obj = new B() this is upcasting
        obj.show();

        B obj1 = (B) obj;
        obj1.show1(); // DownCasting
    }
}