package registrationScheduler.entities;

import java.util.ArrayList;
import registrationScheduler.util.Logger;
import registrationScheduler.entities.Student;

public class Course {
    private String name;
    private final int MAX_STUDENTS = 60;
    private ArrayList<Student> students = new ArrayList<>();

    /**
     * Course constructor that assigns name param to name member
     * variable.
     */
    public Course(String nameIn) {
        Logger.writeMessage("Course " + nameIn + " constructed\n",
                            Logger.DebugLevel.CONSTRUCTOR);
        name = nameIn;
    }

    /**
     * @return string with description of object.
     */
    public String toString() {
        return "Course('" + name + "')";
    }

    /**
     * @return name member variable.
     */
    public String getName() {
        return name;
    }

    /**
     * Assigns nameIn param to name member variable.
     */
    public void setName(String nameIn) {
        name = nameIn;
    }

    /**
     * Attempts to add a student to the course. Possible restrictions
     * include the student having too many courses and/or the course
     * having too many students.
     * @return boolean for whether or not student was able to be added.
     */
    public Boolean tryToAddStudent(Student student) {
        if (students.size() >= MAX_STUDENTS) {
            return false;
        }
        students.add(student);
        return true;
    }

    /**
     * @return students member variable.
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * @return size of students member variable.
     */
    public int getNumStudents() {
        return students.size();
    }
}
