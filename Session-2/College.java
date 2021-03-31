/**
 * The College class contain College details:
 * list of laboratories,average grade of students,capacity of college,college's open days
 *
 * @author Alireza
 * @version 1.0
 */
public class College {

    private Lab[] labs;
    private double avg;
    private int capacity;
    private String openDays;

    /**
     * Create a new College with a given laboratories.
     *
     * @param labs laboratories of college
     */
    public College(Lab[] labs){
        this.labs = labs;
    }

    /**
     * this method set the open days of college
     * @param labs the list of laboratories of college
     */
    public void setOpenDays(Lab[] labs){
        openDays = "";
        for (Lab i : labs){
            openDays += i.getDay();
            openDays += " ";

        }
    }

    /**
     * this method calculate the average grade of college
     * @param labs the list of laboratories of college
     */
    public void setAvg(Lab[] labs){
        int cnt = 0,sum = 0;
        for (Lab i : labs){
            sum += i.getAvg();
            cnt++;
        }
        avg = (double) sum/cnt;
    }

    /**
     * this method set the capacity of college
     * @param labs the list of laboratories of college
     */
    public void setCapacity(Lab[] labs){
        for (Lab i: labs){
            capacity += i.getCapacity();
        }
    }

    /**
     * @return the average grade of college students
     */
    public double getAvg() {
        return avg;
    }

    /**
     * @return the capacity of college
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @return the list if laboratories of college
     */
    public Lab[] getLabs() {
        return labs;
    }

    /**
     * @return the open days if college
     */
    public String getOpenDays() {
        return openDays;
    }


    /**
     * this method print the infrmation of college
     */
    public void print(){
        System.out.println("list of laboratories:");
        for (Lab i : labs){
            System.out.println("");
            i.print();
        }
        System.out.println("");
        System.out.println("Average grade of college students: " + avg);
        System.out.println("college's open days: " + openDays);
        System.out.println("the capacity of college is: " + capacity);
    }
}

