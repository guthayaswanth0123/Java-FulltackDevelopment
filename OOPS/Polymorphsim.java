class A{
    public void show(){
        System.out.println("In A SHow");
    }
}
class B extends A{
    public void show(){
        System.out.println("In B Show");
    }
}


public class Polymorphsim{
    public static void main(String[] args){
        A obj=new A();
        obj.show();

        obj=new B();
        obj.show();
    }
}