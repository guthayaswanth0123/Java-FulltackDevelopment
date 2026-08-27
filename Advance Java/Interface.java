// If we have an abstract class in that class only having abstract methods only we have an alternate
// method to do this using interface
// If class is interface by default all methods inside that is pubic abstract



interface Car {

    int age = 22; //static or final
    String area = "Hyderabad";

    void playMusic();
    void drive();
    void sounds();
}

class BMW implements Car {

    public void playMusic() {
        System.out.println("plays");
    }

    public void drive() {
        System.out.println("it can start");
    }

    public void sounds() {
        System.out.println("BMW sound");
    }
}

public class Interface {

    public static void main(String[] args) {

        Car obj = new BMW();

        obj.drive();
        obj.playMusic();
        obj.sounds();

        System.out.println(obj.area);
        System.out.println(obj.age);
    }
}