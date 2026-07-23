import java.util.Scanner;

public class MaxMin {
    static Scanner sc = new Scanner(System.in);

    static int[] ArrayInput(int[] a,int size){
        for(int i=0;i<size;i++){
            System.out.println("Enter the " + (i+1) + " Number of Array => ");
            a[i] =  sc.nextInt();
        }
        return a;
    }

    static int Max(int[] a,int size){
        int temp = a[0];
        for(int i=0;i<size;i++){
            if(temp<a[i]){
                temp = a[i];    
            }
        }
        return temp;
    }

    static int Min(int[] a,int size){
        int temp = a[0];
        for(int i=0;i<size;i++){
            if(temp>a[i]){
                temp = a[i];    
            }
        }
        return temp;
    }

    public static void main(String[] args){
        System.out.println("Enter the Size of the array => ");
        int Size = sc.nextInt();

        System.out.println("Please Enter the Array Elements => ");
        int[] ArrayOfElements = new int[Size];

        ArrayOfElements = ArrayInput(ArrayOfElements,Size);

        int maximumNumberOfArray = Max(ArrayOfElements,Size);
        System.out.println("The Maximum Number in the Array is => " + maximumNumberOfArray);

        int minimumNumberOfArray = Min(ArrayOfElements,Size);
        System.out.println("The Minimum Number in the Array is => " + minimumNumberOfArray);

        sc.close();
    }

    
}
