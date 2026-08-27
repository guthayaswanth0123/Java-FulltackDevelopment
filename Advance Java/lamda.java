@FunctionalInterface
interface A{
    //void show();
    void show(int i);
}


public class lamda {
    public static void main(String[] args) {
        //A obj=() -> System.out.println("In Show");
        //obj.show();

        // A obj=(int i) -> System.out.println("In show "+ i);
        A obj= i -> System.out.println("In show "+ i);
        obj.show(5);
    }
}
