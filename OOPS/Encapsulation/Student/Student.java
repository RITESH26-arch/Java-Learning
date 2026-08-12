public class Student {
    private  String name;;
    private int age;
    private double marks;

    void setName(String name){
        if(name.length()>60){
                        System.out.println("\nINVALID NAME");
        }
        else{
            this.name = name;
        }
    }
    

    void setAge(int age){
            if(age<=0){
                System.out.println("\nINVALID STUDENT");
            }
            else{
                this.age = age;
            }
    }

    void setMarks(double marks){
        if(marks>0 && marks<100){
            this.marks = marks;
        }
        else{
            System.out.println("\nINVALID MARKS");
        }
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }


    public double  getMarks(){
        return marks;
    }



    Student(String name,int age,double marks){
        setName(name);
        setAge(age);
        setMarks(marks);
    }

    Student(String name,int age){
        setName(name);
        setAge(age);
    }

    Student(String name){
        setName(name);
    }

    void Display(){
        if(marks>75 && marks<100){
            System.out.println("\nGrade => Distinction");
        }
        else if(marks>60 && marks<75){
            System.out.println("\nGrade => A");
        }
        else if(marks>50 && marks<60){
            System.out.println("\nGrade => B");
        }
        else if(marks>40 && marks<50){
            System.out.println("\nGrade => C");
        }
        else if(marks>35 && marks<40){
            System.out.println("\nGrade => D");
        }
        else if(marks<35 && marks>0){
            System.out.println("\nGrade => FAIL");
        }

        System.out.println("\nName = > " + name + "\nAge => " + age + "\nMarks => " + marks);
    }




        
    

}
