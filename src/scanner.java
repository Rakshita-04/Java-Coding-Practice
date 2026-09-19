import java.util.Scanner;
public class scanner{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age:");
        int age= sc.nextInt();
        System.out.print("Enter your percentage:");
        double percentage= sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter your full name:");
        String name= sc.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Age:"+age);
        System.out.println("Percentage:"+percentage);
    }
}