import java.util.ArrayList;

public class Paint1 {

    ArrayList<Shape> shapes = new ArrayList<>();

    /**
     * adds given shape to list
     * @param shape is given shape
     */
    public void addShape(Shape shape){
        shapes.add(shape);
    }

    /**
     * print all shapes
     */
    public void printAll(){
        for (Shape shape : shapes){
            System.out.println(shape.toString());
        }
    }

    /**
     * draw all shapes
     */
    public void drawAll(){
        for (Shape shape : shapes){
            shape.draw();
        }
    }

    /**
     * print squares and equilateral triangles
     */
    public void describeEqualSides(){
        for (Shape shape : shapes){
            if (shape instanceof Rectangle2){
                if (((Rectangle2) shape).isSquare()){
                    System.out.println(shape.toString());
                }
            }else if (shape instanceof Triangle2){
                if (((Triangle2) shape).isEquilateral()){
                    System.out.println(shape.toString());
                }
            }
        }
    }
}
