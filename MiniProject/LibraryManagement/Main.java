import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String memberName,bookName,month,department,designation;
        int memberId,issueDate,bookSubmittingDate,facultyOrStudent;

        System.out.println("\nSelect faculty or Student\nEnter 1 for Faculty\nEnter 2 for Student\n");
        facultyOrStudent = sc.nextInt();
        sc.nextLine();

        if(facultyOrStudent == 2){
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
            s1.returnBook(bookSubmittingDate);
            s1.displayMemberInfo();

        }
        else{

            System.out.println("\nEnter member Id => ");
            memberId = sc.nextInt();
            sc.nextLine();

            System.out.println("\nEnter the member's Name => ");
            memberName = sc.nextLine();

            System.out.println("\nEnter the Book Issuing date => ");
            issueDate = sc.nextInt();
            sc.nextLine();

            System.out.println("\nEnter the Department => ");
            department = sc.nextLine();

            System.out.println("\nEnter the Designation => ");
            designation = sc.nextLine();

            System.out.println("\nEnter the Book's name => ");
            bookName = sc.nextLine();

            System.out.println("\nEnter the date on which Member is returning the book => " );
            bookSubmittingDate = sc.nextInt();
            sc.nextLine();

            System.out.println("\nEnter the month => ");
            month = sc.nextLine();

            Faculty f1 = new Faculty(memberId, memberName,department,designation, issueDate, bookSubmittingDate, month, bookName);
            f1.returnBook(bookSubmittingDate);
            f1.displayMemberInfo();
        
        }

        sc.close();
    }
}