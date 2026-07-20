class Students{
    int rollNo;
    String name;
    int marks;
}
public class ArrayofObjects{
    public static void main(String[] args){
        Students s1=new Students();
        s1.rollNo=28;
        s1.name="Yaswanth";
        s1.marks=88;

        Students s2=new Students();
        s2.rollNo = 8;
        s2.name="Nitheesh";
        s2.marks=99;

        Students s3=new Students();
        s3.rollNo=7;
        s3.name="Pavan";
        s3.marks = 82;


        Students student[] = new Students[3];
        student[0]=s1;
        student[1]=s2;
        student[2]=s3;

        // for(int i=0;i<student.length;i++){
        //     System.out.println(student[i].name + " "+ student[i].rollNo + " "+student[i].marks);
        // }

        for(Students std:student){
            System.out.println(std.name + " "+ std.rollNo + " "+std.marks);

        }
    }
}