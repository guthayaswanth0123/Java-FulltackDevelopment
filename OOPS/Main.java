
public class Main{
    public static void main(String[] args){
        VeryAdvCalculator obj= new VeryAdvCalculator();
        int r1=obj.add(4,5);
        int r2=obj.sub(4,5);
        int r3=obj.multi(4,5);
        int r4=obj.div(4,4);
        double r5=obj.power(4,2);

        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
    }
}