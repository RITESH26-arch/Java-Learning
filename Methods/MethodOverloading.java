public class MethodOverloading {

    static int Multiply(int a,int b){
        int c = a * b;
        return c;
    }

    static double Multiply(double a,double b){
        double c = a * b;
        return c;
    }

    static int Multiply(int a,int b,int c){
        int d = a * b * c;
        return d;
    }

    public static void main(String[] args){
        int g = Multiply(3,2);
        System.out.println("Mutliplication of the two number you entered is => "+g);

        int h = Multiply(3,2,3);
        System.out.println("Mutliplication of the two number you entered is => "+h);

        double k = Multiply(3.0,2.0);
        System.out.println("Mutliplication of the two number you entered is => "+k);
    }
    
}
