class A {
    public A() {
        System.out.println("Hello Yaswanth");
    }

    public void show() {
        System.out.println("show method");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {

        new A();          // Anonymous object 
        //this we cannot reuse again and again if try to use it crates a new object

        new A().show();   // Anonymous object calling method

        A obj = new A();  // Reference object
        obj.show();
    }
}