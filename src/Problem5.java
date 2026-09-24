class Counter {
    int id;
    static int count = 0;

    Counter(int id) {
        this.id = id;
        Counter.count++;
    }
}
public class Problem5 {
    public static void main(String[] args){
        Counter c1=new Counter(101);
        Counter c2=new Counter(102);
        Counter c3=new Counter(103);
        System.out.println("ID:" +c1.id);
        System.out.println("ID:"+c2.id);
        System.out.println("ID:"+c3.id);
    }
}
