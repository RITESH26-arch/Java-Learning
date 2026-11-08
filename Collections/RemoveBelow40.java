import java.util.*;

public  class RemoveBelow40{
    static void removeElement(ArrayList<Integer> list){
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)<40){
                list.remove(i);
            }
        }
        System.out.println("\nAfter removing the element :" + list);
    }

    static void removeByForEach(ArrayList<Integer> list){
        for (Integer m : list){
            if(m < 40){
                list.remove(m);
            }
        }
        System.out.println("\nAfter removing the element by FOREACH :" + list);
    }
}