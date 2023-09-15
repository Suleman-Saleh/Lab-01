public class Circle {
    private double radius;

    public void setRadius(double radius){
        if (radius>0)
            this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double areainfo(){
        return Math.PI*radius*radius;

    }
    //default constructor
    Circle(double radius){
        this.radius = radius;
    }

    public Circle clone(){
        return new Circle(this.radius);
    }

    public Circle largestCircle(Circle circle1,Circle circle2){
        if(circle1.radius < circle2.radius)
            return  circle2;
        else return circle1;
    }
}

