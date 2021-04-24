import java.util.ArrayList;

public class Paint {

    private ArrayList<Rectangle> rectangles = new ArrayList<>();
    private ArrayList<Triangle> triangles = new ArrayList<>();
    private ArrayList<Circle> circles = new ArrayList<>();

    /**
     * add a rectangle to list
     * @param rectangle is given shape
     */
    public void addRectangle(Rectangle rectangle){
        rectangles.add(rectangle);
    }

    /**
     * add a triangle to list
     * @param triangle is given shape
     */
    public void addTriangle(Triangle triangle){
        triangles.add(triangle);
    }

    /**
     * add a circle to list
     * @param circle is given shape
     */
    public void addCircle(Circle circle){
        circles.add(circle);
    }

    /**
     * draw all shapes
     */
    public void drawAll(){
        for (Rectangle r: rectangles) {
            r.draw();
        }
        System.out.println();
        for (Triangle t: triangles) {
            t.draw();
        }
        System.out.println();
        for (Circle c: circles) {
            c.draw();
        }
        System.out.println();
    }

    /**
     * print all shapes
     */
    public void printAll(){
        for (Rectangle r: rectangles) {
            System.out.println(r.toString());
        }
        System.out.println();
        for (Triangle t: triangles) {
            System.out.println(t.toString());
        }
        System.out.println();
        for (Circle c: circles) {
            System.out.println(c.toString());
        }
        System.out.println();
    }
}
