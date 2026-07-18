import java.util.Scanner;

public class FindNumberInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] NumberArray = {45, 12, 78, 23, 56, 89, 34};
        boolean found = false;

        System.out.println("Enter the the  number which you want to Find => ");
        int Find = sc.nextInt();

        for(int i=0;i<NumberArray.length;i++){
            if(Find == NumberArray[i]){
                found = true;
                System.out.println("Number "+Find+" Found at position "+i);
                break;
            }    
        }
        if(!found){
            System.out.println("Number not found !!");
        }
        sc.close();
        
        
    }
    
}
