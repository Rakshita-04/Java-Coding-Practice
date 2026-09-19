import java.util.Scanner;
public class counting {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int digit=0;
        int count=0;
        while(n!=0){
            digit=n%10;
            if(digit %2==0){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
