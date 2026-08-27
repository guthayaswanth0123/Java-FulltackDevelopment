@FunctionalInterface
interface A{
    int add(int a,int b);
}


public class lamda1 {
    public static void main(String[] args) {
        // A obj=new A(){
        //     public int add(int a,int b){
        //         return a+b;
        //     }
        // };


        A obj=(a,b)->a+b; //here a+b becomes return type
        int res=obj.add(7,8);
        System.out.println(res);
    }
}
