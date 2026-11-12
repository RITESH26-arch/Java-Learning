import java.util.*;
public class RemoveWithIterator {
    public static void removeWithIterator(ArrayList<Integer> marks){
        Iterator<Integer> it  = marks.iterator();

        while(it.hasNext()){
            Integer count = it.next();
            if(count < 40){
                it.remove();
                System.out.println("\nIn iterator  Loop := \n");
                System.out.println(marks);
            }
        }

        System.out.println("\nAfter Removing with Iterator\n");
        System.out.println(marks);
        }


}
