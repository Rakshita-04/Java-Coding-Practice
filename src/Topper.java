class Student {
    String name;
    int age;
    int marks;
}
public class Topper {
    public static void main(String[] args){
        Student S1= new Student();
        S1.name="ABC";
        S1.age=15;
        S1.marks=87;
        Student S2 = new Student();
        S2.name="XYZ";
        S2.age=16;
        S2.marks=95;
        Student S3= new Student();
        S3.name="PQR";
        S3.age=14;
        S3.marks=93;
        if(S1.marks>S2.marks && S1.marks>S3.marks){
            System.out.println(S1.name);
        }
        else if(S2.marks>S1.marks && S2.marks>S3.marks){
            System.out.println(S2.name);
        }
        else{
            System.out.println(S3.name);
        }
    }
}
