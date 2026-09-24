class Employee{
    String name;
    int age;
    double salary;
    Employee(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
public class Problem6 {
    public static void main(String[] args){
        Employee e1= new Employee("ABC",31,950000);
        Employee e2= new Employee("DEF",21,650000);
        e1.display();
        e2.display();
    }
}
