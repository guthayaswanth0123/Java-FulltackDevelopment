class Calculator{
    int num=5;//instance variable
    public int add(int n1,int n2){//n1 and n2 are local variables
        System.out.println(num);
        return n1+n2;
    }
}
public class Demo{
    public static void main(String[] args){
        int data=10;
    
        Calculator obj=new Calculator();//obj is reference variable
        Calculator obj1=new Calculator();
        obj.num=10;
        int r1=obj.add(3,4);
        System.out.println(obj.num);
        System.out.println(obj1.num);//one phone damage onother is not damage that's why result is different
        System.out.println(r1);
    }
}