import java.util.ArrayList;
import java.util.Objects;

/**
 * This class is implementation of rectangle
 * @author Alireza Nasirian
 */
public class Rectangle {
    
    private ArrayList<Integer> sides = new ArrayList<>();

    /**
     * constructor of rectangle class
     * assigns given numbers to sides
     * @param a is 1st side
     * @param b is 2nd side
     * @param c is 3rd side
     * @param d is 4th side
     */
    public Rectangle(int a, int b, int c, int d){
        sides.add(a);
        sides.add(b);
        sides.add(c);
        sides.add(d);
    }

    /**\
     * @return sides of rectangle
     */
    public ArrayList<Integer> getSides() {
        return sides;
    }

    /**
     * This method checks whether the rectangle is square or not
     * @return true if rectangle is square
     */
    public boolean isSquare(){
        boolean square = true;
        int a = sides.get(0);
        for (int b: sides) {
            if (b != a){
                square = false;
                break;
            }
        }
        return square;
    }

    /**
     * this method calculate perimeter of rectangle and return it
     * @return perimeter of rectangle
     */
    public double calculatePerimeter(){
        double perimeter = 0;
        for (int a: sides) {
            perimeter += a;
        }
        return perimeter;
    }


    /**
     * this method calculate rectangle area and return it
     * @return area of rectangle
     */
    public double calculateArea(){
        int a = 1;
        for (int b: sides) {
            a *= b;
        }
        return  Math.sqrt(a);
    }

    /**
     * this method prints type,perimeter and area of shape
     */
    public void draw(){
        System.out.println("Rectangle - perimeter: "+ calculatePerimeter()+" Area: "+calculateArea());
    }

    /**
     * this method check the equality of 2 shape
     * @param o is given shape
     * @return true if o is equal with rectangle
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(sides, rectangle.sides);
    }

    /**
     * @return type and sides of shape
     */
    @Override
    public String toString() {
        return "Rectangle{" +
                "sides=" + sides +
                '}';
    }
}
