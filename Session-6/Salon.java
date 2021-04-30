import java.util.ArrayList;

/**
 * Salon class manage rows of salon
 */
public abstract class Salon {

    ArrayList<Row> rows = new ArrayList<>();

    /**
     * book a seat from given row
     * @param row is given row
     */
    public  abstract void bookSeat(Row row);
}
