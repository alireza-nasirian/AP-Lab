/**
 * @author alireza nasirian
 * @version 1
 */
public class Person {

    private String firstName;
    private String lastName;

    /**
     * constructor of person class
     * @param firstName in first name of person
     * @param lastName is last name of person
     */
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * @return the firs name of person
     */
    public String getFirstName() {
        return firstName;
    }


    /**
     * @return last name of person
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return first and last name of person
     */
    public String toString(){
        return firstName+" "+lastName;
    }
}
