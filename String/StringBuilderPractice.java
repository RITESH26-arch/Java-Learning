public class StringBuilderPractice {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Learning ");
        System.out.println(sb);
        sb.append("Java");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.insert(5,",");
        System.out.println(sb);
    }
    
}
