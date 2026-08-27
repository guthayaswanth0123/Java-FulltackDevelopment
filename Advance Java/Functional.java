
@FunctionalInterface
interface A{
    void show();
    //void start();
}


// class B implements A{
//     public void show(){
//         System.out.println("In B show");
//     }
// }

public class Functional
{
    public static void main(String[] args) {
        A obj=new A(){
            public void show(){
                System.out.println("In show");
            }
        };
        obj.show();
    }
}
