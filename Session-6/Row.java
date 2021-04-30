import java.util.ArrayList;

/**
 * Row class manage seats of salon
 */
public abstract class Row {

    ArrayList<Seat> seats = new ArrayList<>();

    /**
     * reserve given seat
     * @param seat given seat
     */
    public abstract void bookSeat(Seat seat);
}
