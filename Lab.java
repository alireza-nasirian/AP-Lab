/**
 * The Lab class contain Laboratory details
 *
 * @author Alireza
 * @version 1.0
 */
public class Lab {

    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize ;

    /**
     * Create a new Laboratory with a given details.
     *
     * @param cap capacity of Laboratory
     * @param  d day of Laboratory
     */
    public Lab(int cap, String d) {
        capacity = cap;
        day = d;
    }

    /**
     * get the name students and increase the capacity
     * @param std name of student
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * @return students field
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     *
     * @param students set students of Lab
     */
    public void setStudents(Student[] students)
    {
        this.students = students;
    }

    /**
     * @return avg field
     */
    public int getAvg() {
        avg = calculateAvg();
        return avg;
    }

    /**
     * this method calculate average grade of students
     * @return average grade
     */
    public int calculateAvg() {
        int sum = 0;
        for (Student i : students){
            sum += i.getMark();
        }
        return (sum/capacity);
    }

    /**
     * @return day field
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day set day of Lab
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return capacity field
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity set the capacity of Lab
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * this method print information of students and Lab
     */
    public void print() {
        for (int i=0;i<capacity;i++){
            students[i].print();
        }
        System.out.println("Lab day: " + day);
        System.out.println("Capacity: " + capacity);
        System.out.println("average grade of students: " + calculateAvg());
    }
}
