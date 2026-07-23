import java.util.Scanner;

public class ScannerMethod {

     static int add(int a,int b) {
        int sum = a + b ;
        return sum;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First the number you want to add");
        int a = sc.nextInt();
        System.out.println("Enter the Second number you want to add");
        int b = sc.nextInt();

        int addition = add(a,b);

        System.out.println("Sum = " +addition);
        sc.close();

    }
    
}
