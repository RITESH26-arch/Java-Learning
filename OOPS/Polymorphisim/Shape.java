public class Shape {
    private double length;
    private double breadth;
    private int radius;
    private double pie = 3.14;
    private double area;

    void setLength(double length){
        if(length<0)
            System.out.println("Invalid lenght !");
        else
            this.length = length;
    }

    void setBreadth(double breadth){
        if(breadth<0)
            System.out.println("Invalid breadth !");
        else
            this.breadth = breadth;
    }

    void setRadius(int radius){
        if(radius<0)
            System.out.println("Invalid radius !");
        else
            this.radius = radius;
    }



    Shape(double length,double breadth){
        setLength(length);
        setBreadth(breadth);
         calculateArea(length,breadth);
    }

    Shape(int radius){
        setRadius(radius);
        calculateArea(radius);
    }
    
    double calculateArea(double length,double breadth){
        this.area = length*breadth;
        return area;
    }

    double  calculateArea(int radius){
        this.area = this.pie*(radius*radius);
        return area;
    }

    public double getArea() {
        return area;
    }

    void display(){
        System.out.println(getArea());
    }
    
}
