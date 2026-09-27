import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        int c = 0;

        boolean success = false;

        do {
            try {
                System.out.println("Enter 2 numbers => ");
                a = sc.nextInt();        // may throw InputMismatchException
                b = sc.nextInt();        // may throw InputMismatchException
                c = a / b;                // may throw ArithmeticException (int / 0)

                success = true;           // only reached if no exception occurred above

            } catch (InputMismatchException e) {
                System.out.println("Characters are not allowed !!!");
                sc.nextLine();            // clear the bad token so the loop doesn't spin forever

            } catch (ArithmeticException e) {
                System.out.println("A number cannot be divided by zero !!!");

            } finally {
                System.out.println("Attempt finished\n");   // always runs, success or failure
            }

        } while (!success);   // repeat only if the try block never completed cleanly

        System.out.println("Result: " + c);
        sc.close();
    }
}