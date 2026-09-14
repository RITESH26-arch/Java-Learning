import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String memberName,bookName,month;
        int memberId,issueDate,bookSubmittingDate;

        System.out.println("\nEnter member Id => ");
        memberId = sc.nextInt();
        sc.nextLine();

        System.out.println("\nEnter the member's Name => ");
        memberName = sc.nextLine();

        System.out.println("\nEnter the Book Issuing date => ");
        issueDate = sc.nextInt();
        sc.nextLine();

        System.out.println("\nEnter the Book's name => ");
        bookName = sc.nextLine();

        System.out.println("\nEnter the date on which Student is returning the book => " );
        bookSubmittingDate = sc.nextInt();
        sc.nextLine();

        System.out.println("\nEnter the month => ");
        month = sc.nextLine();



        Student s1 = new Student(memberId, memberName, issueDate, bookSubmittingDate, month, bookName);
        s1.calculateFine();
        s1.displayMemberInfo();
        sc.close();
    }
}
