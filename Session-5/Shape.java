import java.util.ArrayList;

/**
 * shape class is super class of shapes
 */
public class Shape {

    /**
     * method to calculate perimeter
     * @return perimeter of shape
     */
    public double calculatePerimeter(){
        return 0;
    }

    /**
     * method to calculate area
     * @return area of shape
     */
    public double calculateArea(){
        return 0;
    }

    /**
     * print type of shape and perimeter and area of shape
     */
    public void draw(){
        System.out.println("perimeter: "+ calculatePerimeter()+" area: "+calculateArea());
    }

    /**
     * this method check the equality of 2 shape
     * @param obj is given shape
     * @return true if o is equal with circle
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * @return type and sides of shape
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
