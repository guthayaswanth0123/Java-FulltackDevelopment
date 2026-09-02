// super keyword
// super means parent class.
// It is mainly used when we want to access something from the parent class.
// There are 3 important uses of super


// A. super to call parent variable
// super used to call parent method  => super.methodname()
//super() to call parent constructor muste be teh first statement inside teh constructor
class Parent {
    int x = 10;
}
class Child extends Parent {
    int x = 20;
    void display() {
        System.out.println(x);
        System.out.println(super.x);
    }
}
public class Supr {
    public static void main(String[] args){
        Child obj=new Child();
        obj.display();
    }
    
}
