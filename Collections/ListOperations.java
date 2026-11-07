import java.util.*;
public class ListOperations {
    public static void main(String[] args){
        ArrayList<Integer> marks = new ArrayList<>();
        int sum = 0;

        marks.add(40);
        marks.add(55);
        marks.add(70);
        marks.add(85);
        marks.add(90);

        System.out.println("\nThe original ArrayList of Marks is :" + marks);

        System.out.println();
        for(int i=0;i<marks.size();i++){
            System.out.println(marks.get(i));
        }

        System.out.println("\nNow after removing by position");
        marks.remove(0);

        System.out.println(marks);

        System.out.println();

        System.out.println("\nNow after removing by value");
        marks.remove(Integer.valueOf(70));
        System.out.println();
        System.out.println(marks);

        System.out.println("\nNow after setting the value");
        marks.set(1,100);
        System.out.println(marks);
        System.out.println();

        System.out.println("\nNow after doing add by the position");
        marks.add(1,26);
        System.out.println(marks);



        for(Integer m : marks ){
            sum += m;
            System.out.println(sum);
        }


        System.out.println("\nNow the copy list will run");
        ArrayList<Integer> copy = marks;
        System.out.println(copy);

        System.out.println("\nNow the newCopy list will run");
        ArrayList<Integer> newCopy = new ArrayList<>(marks);
        System.out.println(newCopy);
        System.out.println();

        marks.add(999);

        System.out.println(marks);
        System.out.println(copy);
        System.out.println(newCopy);


    }
}
