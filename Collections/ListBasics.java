import java.util.ArrayList;
public class ListBasics {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Ritesh");
        names.add("Prathamesh");
        names.add("Aayush");
        
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        System.out.println("\nWithout for loop !");
        System.out.println(names);
        System.out.println("\nThis is getting index\n");
        System.out.println(names.get(0));
        System.out.println("\nAfter deleting the element at index 0\n");
        names.remove(0);
        System.out.println(names);
        System.out.println(names.get(0));
        System.out.println(names.contains("Aayush"));
        System.out.println(names.indexOf("Aayush"));
        System.out.println(names.contains("DingDing"));
        System.out.println(names.indexOf("DingDing"));
    }
}
