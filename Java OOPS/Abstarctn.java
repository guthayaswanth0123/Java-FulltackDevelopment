// Abstraction
// Definition: Abstraction hides implementation details and only shows essential features.
// It can be achieved using:
// Abstract class
// Interface

// abstract class Vehicle {
//     abstract void start();
//     void stop() {
//         System.out.println("Vehicle stopped");
//     }
// }

// class Car extends Vehicle {
//     void start() {
//         System.out.println("Car started");
//     }
//     void stop() {
//         super.stop();
//         System.out.println("car stopped");
//     }
// }

// public class Abstarctn {
//     public static void main(String[] args){
//         Vehicle c = new Car();
//         c.stop();
//     }
// }




interface Animal {
    void sound();
}

class Cat implements Animal {

    public void sound() {
        System.out.println("Cat meows");
    }
}

public class  Abstarctn {

    public static void main(String[] args) {

        Animal a = new Cat();

        a.sound();
    }
}