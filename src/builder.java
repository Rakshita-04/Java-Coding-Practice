public class builder {
    public static void main(String[] args){
        StringBuilder text = new StringBuilder("Java");
        text.append(" Programming");
        System.out.println(text);
        text.insert(4," is");
        System.out.println(text);
        System.out.println(text);
        text.delete(0,4);
        System.out.println(text);
        text.append(" Easy");
        System.out.println(text);
        text.reverse();
        System.out.println(text);
        String result=text.toString();
        System.out.println(result);
    }
}
