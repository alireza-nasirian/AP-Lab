import java.util.Objects;

public class Circle {

    private int radius;

    /**
     * constructor of circle class
     * @param a is radius of circle
     */
    public Circle(int a){
        radius = a;
    }

    /**
     * @return the radius of circle
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @return perimeter of circle
     */
    public double calculatePerimeter(){
        return (2*Math.PI*radius);
    }

    /**
     * @return Area of circle
     */
    public double calculateArea(){
        return (Math.PI*radius*radius);
    }

    /**
     * this method prints type,perimeter and area of shape
     */
    public void draw(){
        System.out.println("Circle - perimeter: "+ calculatePerimeter()+" Area: "+calculateArea());
    }

    /**
     * this method check the equality of 2 shape
     * @param o is given shape
     * @return true if o is equal with circle
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    /**
     * @return type and sides of shape
     */
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
