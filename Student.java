
/**
 * The Student class represents a student in a student
 administration system.
 * It holds the student details relevant in our context.
 *
 * @author َAlireza
 * @version 1.0
 */
public class Student {
    private String name;
    private String ID;
    private int mark;

    /**
     * Create a new student with a given name and ID number.
     *
     * @param name name of student
     * @param ID number of student
     */
    public Student(String name, String ID){
        this.name = name;
        this.ID = ID;
    }

    /**
     * @param name set name of student
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * @param ID set ID of student
     */
    public void setID(String ID){
        this.ID = ID;
    }

    /**
     * @param mark set grade of student
     */
    public void setMark(int mark){
        this.mark = mark;
    }

    /**
     * @return name field
     */
    public String getName(){
        return name;
    }

    /**
     * @return ID field
     */
    public String getID(){
        return ID;
    }

    /**
     * @return mark field
     */
    public int getMark(){
        return mark;
    }

    /**
     * Print the student’s name and ID number  and mark to the
     output terminal.
     */
    public void print() {
        System.out.println(name + ", student ID: "
                + ID + ", grade: " + mark);
    }
}
