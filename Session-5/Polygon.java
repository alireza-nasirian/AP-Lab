import java.util.ArrayList;

public class Polygon extends Shape {

    private ArrayList<Integer> sides = new ArrayList<>();

    /**
     * @return sides of shape
     */
    public ArrayList<Integer> getSides() {
        return sides;
    }

    /**
     * constructor of polygon class
     * @param ints is dides of shape
     */
    public Polygon(int... ints){
        for (int i : ints){
            sides.add(i);
        }
    }

    /**
     * @return sides of shape in string form
     */
    @Override
    public String toString() {
        String res = "";
        int cnt = 0;
        for (int i : sides){
            cnt++;
            res += "side" + cnt + ":" + i + " ";
        }
        return res;
    }
}
