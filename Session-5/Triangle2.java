import java.util.Objects;

public class Triangle2 extends  Polygon {

    /**
     * constructor of triangle class
     * @param ints is sides of triangle
     */
    public Triangle2(int... ints){
        super(ints);
    }

    /**
     * calculate perimeter of triangle
     * @return perimeter
     */
    @Override
    public double calculatePerimeter() {
        int perimeter = 0;
        for (int i : getSides()){
            perimeter += i;
        }
        return perimeter;
    }

    /**
     * @return area of triangle
     */
    @Override
    public double calculateArea() {
        double p = 0;
        for (int a: getSides()) {
            p += a;
        }
        p = p/2;
        for (int a: getSides()) {
            p *= (p-a);
        }
        return Math.sqrt(p);
    }

    /**
     * @return true if triangle is equilateral
     */
    public boolean isEquilateral(){
        int a = getSides().get(0);
        int b = getSides().get(1);
        int c = getSides().get(2);
        return ((a==b) || (a==c) || (b==c));
    }

    /**
     * this method prints type,perimeter and area of shape
     */
    @Override
    public void draw() {
        System.out.print("Triangle: ");
        super.draw();
    }

    /**
     * this method check the equality of 2 shape
     * @param o is given shape
     * @return true if o is equal with triangle
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle2)) return false;
        Triangle2 triangle2 = (Triangle2) o;
        return Objects.equals(getSides(), triangle2.getSides());
    }

    /**
     * @return sides of triangle in string format
     */
    @Override
    public String toString() {
        return "triangle: " + super.toString();
    }
}
