import java.util.ArrayList;

/**
 * TicketReservationSystem manage salons and shows
 * @author Alireza Nasirian
 */
public abstract class TicketReservationSystem {

    ArrayList<Salon> salons = new ArrayList<>();

    /**
     * reserve a seat from given salon
     * @param salon is given salon
     */
    public abstract void saveReservations(Salon salon);

    /**
     * prints details of a show
     * @param title is title of show
     */
    public abstract void findShow(String title);






}
