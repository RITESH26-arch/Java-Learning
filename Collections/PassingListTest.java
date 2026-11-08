import java.util.*;
public class PassingListTest {
    public static void main(String[] args){
        ArrayList<Integer> markList = new ArrayList<>();

        markList.add(10);
        markList.add(20);
        markList.add(30);
        markList.add(40);
        markList.add(50);

        System.out.println("\nThis is the original list : " + markList);
        System.out.println();

        PassingLists.addInList(markList);
        System.out.println("\nAfter calling method : " + markList);

        RemoveBelow40.removeElement(markList);

        RemoveBelow40.removeByForEach(markList); // this returns an error as the  remove changes the list  and the foreach checks the iterator befor going to the next value


    }
}
