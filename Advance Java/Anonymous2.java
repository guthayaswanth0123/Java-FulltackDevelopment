
abstract class A{
    public abstract void show();
    public abstract void config();

}



public class Anonymous2 {
    public static void main(String[] args) {
        A obj=new A(){
            public void show(){
                System.out.println("In Anonymous Inner class Show");
            }
            public void config(){
                System.out.println("In Annonymous Inner Config ");
            }
        };
        obj.show();
        obj.config();
    }
}
