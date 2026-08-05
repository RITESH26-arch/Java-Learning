import java.util.Scanner;

public class CountVowels {
    static int CountingVowels(String b){
        b = b.toLowerCase();
        int Count =0;
        char[] Vowels = {'a','e','i','o','u'};
        for(int i = 0; i<b.length();i++){
            char ch = b.charAt(i);

            for(int j = 0; j < Vowels.length; j++){
                if(ch == Vowels[j]){
                    Count++;
                    break;
                }
            }
        }
        return Count;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word => ");
        String a = sc.nextLine();
        int k = CountingVowels(a);
        System.out.println(k);
        sc.close();

    }
}    
    



