class Calculator{
    int a;
    int b;
    public int add(int num1,int num2){
        int result=num1+num2;
        return result;
    }
}
public class P1{
    public static void main(String[] args){
        Calculator cal=new Calculator();
        int sum=cal.add(4,5);
        System.out.println("sum is"+sum);
    }
}