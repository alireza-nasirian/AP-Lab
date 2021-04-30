import java.util.ArrayList;

/**
 * Implementation of customer
 */
public abstract class Customer {

    ArrayList<Seat> seats = new ArrayList<>();

    /**
     * book a seat from cinema for given show
     * @param show is given show
     */
    public abstract void book(Show show);
}
