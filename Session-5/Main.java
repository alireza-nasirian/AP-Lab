public class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);

        System.out.println("c1 = c2: "+ circle1.equals(circle2));

        Rectangle rect1 = new Rectangle(1,4,1,4);
        Rectangle rect3 = new Rectangle(1,4,1,4);
        Rectangle rect2 = new Rectangle(8,5,8,5);
        Rectangle rect4 = new Rectangle(6,6,6,6);

        System.out.println(" rec 4 is square: "+rect4.isSquare());
        System.out.println(" rec 2 is square: "+rect2.isSquare());

        System.out.println("rec1 = rec3: "+rect1.equals(rect3));


        Triangle tri1 = new Triangle(2,2,2);
        Triangle tri2 = new Triangle(4,4,6);

        System.out.println("t2 is is Equilateral"+ tri2.isEquilateral());

        Paint paint = new Paint();

        paint.addCircle(circle1);
        paint.addCircle(circle2);
        paint.addRectangle(rect1);
        paint.addRectangle(rect2);
        paint.addRectangle(rect3);
        paint.addRectangle(rect4);
        paint.addTriangle(tri1);
        paint.addTriangle(tri2);

        paint.drawAll();
        paint.printAll();




    }
}
