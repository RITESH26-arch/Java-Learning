import java.util.Scanner;
public class Palindrome {

    static void PalindromeCheck(String a){
        String b = a.toLowerCase();
        int Start  = 0;
        int End =  b.length()-1;
        boolean  isPalindrome = true;

        while(Start < End){
            if(b.charAt(Start) != b.charAt(End)){
                isPalindrome = false;
                break;
            }
            Start++;
            End--;
        }

        if(isPalindrome){
            System.out.println(b + " is Palindrome !");
        }
        else{
            System.out.println(b + " is NOT a Palindrome");
        }
        
    }
    public static void main(String[] args){
        String a  = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a word Or a Name to check Weather it is a palindrome or not");
        a = sc.nextLine();
        
        PalindromeCheck(a);
        sc.close();

    }
}
