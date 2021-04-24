import ir.huri.jcal.JalaliCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * @author alireza nasirian
 * @version 1
 */
public class Vote {
/*
    JalaliCalendar jalaliCalendar = new JalaliCalendar(1400, 1, 21);
    GregorianCalendar gregorianCalendar = new GregorianCalendar();*/
    private Person person;
    private String date;

    /**
     * constructor of vote class
     * @param person is person who want to vote
     * @param date is the data of voting
     */
    public Vote(Person person, String date) {
        this.person = person;
        this.date = date;
    }

    /**
     * @return the person of vote
     */
    public Person getPerson() {
        return person;
    }

    /**
     * @return the date of voting
     */
    public String getDate() {
        return date;
    }

    /**
     *
     * @param vote1 is a vote
     * @param vote2 is another vote
     * @return true if the votes are equal
     */
    public boolean equals(Vote vote1, Vote vote2) {
        if (vote1.person.toString().equals(vote2.person.toString()) && vote1.date.equals(vote2.date)) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public int hashCode() {
        return Objects.hash(person, date);
    }
}
