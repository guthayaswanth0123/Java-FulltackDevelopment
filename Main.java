abstract class Animal {
    abstract void sound();
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
    // @Override
    // void sleep() {
    //     System.out.println("Dog is sleeping");
    // }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog(){
            @Override
            void sleep(){
                System.out.println("Dog is Sleeping");
            }
        };
        d.sound();
        d.sleep();
    }
}