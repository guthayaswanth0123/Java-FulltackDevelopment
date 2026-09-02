// Definition: Polymorphism means one interface, many forms.
// It allows the same method name to perform different tasks.
// There are two types:
// A. Compile-Time Polymorphism (Method Overloading)
// Methods have:
// Same name
// Different parameters

// Polymorphism means:
// One thing can have many forms.
// In Java, polymorphism mainly means the same method name can behave differently.
// There are 2 types of polymorphism:
// Compile-time polymorphism → Method Overloading
// Runtime polymorphism → Method Overriding


// Java decides which method to call during compilation.
// class Calculator{
//     public int add(int a,int b){
//         return a+b;
//     }
//     public int add(int a,int b,int c){
//         return a+b+c;
//     }
// }

// public class Polymorphsm {
//     public static void main(String []args){
//         Calculator obj=new Calculator();
//         int res=obj.add(2,4);
//         System.out.println(res);
//     }
// }



class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Polymorphsm {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}