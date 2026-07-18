import java.util.Scanner;
public class Inputdemo {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your favourite number => ");
        num = sc.nextInt();

        System.out.println("My Favourite number is => "+num);
        sc.close();
    }
}
