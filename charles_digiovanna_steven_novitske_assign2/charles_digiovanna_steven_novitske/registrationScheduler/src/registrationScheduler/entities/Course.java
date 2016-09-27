package registrationScheduler.entities;

import java.util.ArrayList;

public class Course {
    private String name;

    private final int max_students = 60;

    private ArrayList<Student> students = new ArrayList<>();

    /**
     * Course constructor that assigns name param to name member
     * variable.
     */
    public Course(String name) {
        this.name = name;
    }

    /**
     * @return string with description of object.
     */
    public String toString() {
        return "Course('" + this.name + "')";
    }

    /**
     * @return name member variable.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Assigns name param to name member variable.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Attempts to add a student to the course. Possible restrictions
     * include the student having too many courses and/or the course
     * having too many students.
     * @return boolean for whether or not student was able to be added.
     */
    public Boolean tryToAddStudent(Student student) {
        if (students.size() >= this.max_students) {
            return false;
        }

        students.add(student);

        return true;
    }

    /**
     * @return students member variable.
     */
    public ArrayList<Student> getStudents() {
        return this.students;
    }

    /**
     * @return size of students member variable.
     */
    public int getNumStudents() {
        return this.students.size();
    }
}
