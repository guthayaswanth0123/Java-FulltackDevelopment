
class A{
    public void show(){
        System.out.println("In A show");
    }
}
// if i wnat ti change the Behevaiour of A method
// class B extends A{
//     public void show(){
//         System.out.println("In B show");
//     }
// }


public class Anonymous {
    public static void main(String[] args) {
        A obj=new A(){
            public void show(){
                System.out.println("In Anonymous show");
            }
        };
        obj.show();
    }
}