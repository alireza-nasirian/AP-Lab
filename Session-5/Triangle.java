import java.util.ArrayList;
import java.util.Objects;

/**
 * This class is implementation of triangle
 * @author Alireza Nasirian
 */
public class Triangle {

    private ArrayList<Integer> sides = new ArrayList<>();


    /**
     * constructor of triangle class
     * assigns given numbers to sides
     * @param a is 1st side
     * @param b is 2nd side
     * @param c is 3rd side
     */
    public Triangle(int a, int b, int c){
        sides.add(a);
        sides.add(b);
        sides.add(c);
    }

    /**
     * @return the sides of triangle
     */
    public ArrayList<Integer> getSides() {
        return sides;
    }

    /**
     * @return true if triangle is equilateral
     */
    public boolean isEquilateral(){
        int a = sides.get(0);
        int b = sides.get(1);
        int c = sides.get(2);
        return ((a==b) || (a==c) || (b==c));
    }

    /**
     * this method calculate perimeter of triangle and return it
     * @return perimeter of triangle
     */
    public double calculatePerimeter(){
        double perimeter = 0;
        for (int a: sides) {
            perimeter += a;
        }
        return perimeter;
    }

    /**
     * @return area of triangle
     * calculates with Herons formula
     */
    public double calculateArea(){
        double p = 0;
        for (int a: sides) {
            p += a;
        }
        p = p/2;
        for (int a: sides) {
            p *= (p-a);
        }
        return Math.sqrt(p);
    }

    /**
     * this method prints type,perimeter and area of shape
     */
    public void draw(){
        System.out.println("Triangle - perimeter: "+ calculatePerimeter()+" Area: "+calculateArea());
    }

    /**
     * this method check the equality of 2 shape
     * @param o is given shape
     * @return true if o is equal with triangle
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(sides, triangle.sides);
    }

    /**
     * @return type and sides of shape
     */
    @Override
    public String toString() {
        return "Triangle{" +
                "sides=" + sides +
                '}';
    }
}
