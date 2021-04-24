import java.util.Objects;

public class Circle2 extends Shape{

    private int radius;

    /**
     * @return radius of circle
     */
    public int getRadius() {
        return radius;
    }

    /**
     * constructor of circle class
     * @param radius is radius of circle
     */
    public Circle2(int radius){
        this.radius = radius;
    }

    /**
     * @return perimeter of circle
     */
    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    /**
     * @return area of circle
     */
    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    /**
     * print perimeter and area of circle
     */
    @Override
    public void draw() {
        System.out.print("Circle ");
        super.draw();
    }

    /**
     * this method check the equality of 2 shape
     * @param o is given shape
     * @return true if o is equal with circle
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle2)) return false;
        if (!super.equals(o)) return false;
        Circle2 circle2 = (Circle2) o;
        return radius == circle2.radius;
    }

    /**
     * @return radius of circle in string format
     */
    @Override
    public String toString() {
        return "Circle: radius: " + radius;
    }
}
