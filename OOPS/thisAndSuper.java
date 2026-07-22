class A{ // every class in java extends object class 
    public A(){//by default every constructor having super method 
        super();//it is by default for very constructors
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("int A int");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }
    public B(int n){
        this();//it executes current class constructor
        //super();
        System.out.println("in B int");
    }
}
public class thisAndSuper{
    public static void main(String[] args){
        B obj=new B(5);//when we create an object it clals parent clal constructors and child class constrictors
    }
}