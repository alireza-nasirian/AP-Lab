public class Main2 {

    public static void main(String[] args) {

        Circle2 circle1 = new Circle2(19);
        Circle2 circle2 = new Circle2(3);

        System.out.println("c1 = c2: "+ circle1.equals(circle2));

        Rectangle2 rect1 = new Rectangle2(1,4,1,4);
        Rectangle2 rect3 = new Rectangle2(1,4,1,4);
        Rectangle2 rect2 = new Rectangle2(8,5,8,5);
        Rectangle2 rect4 = new Rectangle2(6,6,6,6);

        System.out.println(" rec 4 is square: "+rect4.isSquare());
        System.out.println(" rec 2 is square: "+rect2.isSquare());

        System.out.println("rec1 = rec3: "+rect1.equals(rect3));


        Triangle2 tri1 = new Triangle2(2,2,2);
        Triangle2 tri2 = new Triangle2(4,4,6);

        System.out.println("t2 is is Equilateral  "+ tri2.isEquilateral());

        Paint1 paint1 = new Paint1();

        paint1.addShape(circle1);
        paint1.addShape(circle2);
        paint1.addShape(rect1);
        paint1.addShape(rect2);
        paint1.addShape(rect3);
        paint1.addShape(rect4);
        paint1.addShape(tri1);
        paint1.addShape(tri2);

        paint1.drawAll();
        paint1.printAll();
        paint1.describeEqualSides();




    }
}
