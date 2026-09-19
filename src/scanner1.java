import java.util.Scanner;
public class scanner1 {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter your full name:");
        String name= sc.nextLine();
        System.out.print("Enter your age:");
        int age= sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your city:");
        String city=sc.nextLine();
        System.out.println("Name:" + name);
        System.out.println("Age:"+age);
        System.out.println("City:"+city);
    }
}
