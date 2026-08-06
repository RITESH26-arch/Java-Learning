public class Student {
    String name;
    int rollNo;
    double percentage;

    Student(int r,String n,double p){
        rollNo = r;
        name = n;
        percentage = p;
    }

    void  display(){
        System.out.println("Roll No => " + rollNo + "\nName => " + name + "\nPercentage => " + percentage);
    }
}
