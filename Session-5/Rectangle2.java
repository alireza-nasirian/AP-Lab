import java.util.Objects;

public class Rectangle2 extends Polygon{

    /**
     * constructor os rectangle class
     * @param ints is sides of rectangle
     */
    public Rectangle2(int... ints){
        super(ints);
    }

    /**
     * calculate perimeter of rectangle
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
     * @return area of shape
     */
    @Override
    public double calculateArea() {
        int area = 1;
        for (int i: getSides()){
            area *= i;
        }
        return  Math.sqrt(area);
    }

    /**
     * This method checks whether the rectangle is square or not
     * @return true if rectangle is square
     */
    public boolean isSquare(){
        boolean square = true;
        int a =  getSides().get(0);
        for (int b: getSides()) {
            if (b != a){
                square = false;
                break;
            }
        }
        return square;
    }


    /**
     * this method prints type,perimeter and area of shape
     */
    @Override
    public void draw() {
        System.out.print("Rectangle: ");
        super.draw();
    }

    /**
     * this method check the equality of 2 shape
     * @param o is given shape
     * @return true if o is equal with rectangle
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle2)) return false;
        Rectangle2 rectangle2 = (Rectangle2) o;
        return Objects.equals(getSides(), rectangle2.getSides());
    }

    /**
     * @return sides of rectangle in string form
     */
    @Override
    public String toString() {
        return "rectangle : " + super.toString();
    }
}
