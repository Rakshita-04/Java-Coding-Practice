public class Problem8 {
    static int multiply(int a, int b){
        return a*b;
    }
    static int multiply(int a, int b, int c){
        return a*b*c;
    }
    public static void main(String[] args){
        System.out.println(multiply(5,4));
        System.out.println(multiply (2,3,4));
    }
}
