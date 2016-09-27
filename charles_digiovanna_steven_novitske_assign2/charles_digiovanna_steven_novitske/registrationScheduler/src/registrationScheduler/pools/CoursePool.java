package registrationScheduler.pools;

import java.util.ArrayList;

public class CoursePool {
    private ArrayList<Course> courses = new ArrayList<Course>();

    public CoursePool() {

    }

    public Course getCourseWithName(String name) {
        for (Course c : this.courses) {
            if (name == c.name) {
                return c;
            }
        }

        return null;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public int getAverageStudentsPerCourse() {
        if (this.courses.size() == 0) return 0;

        float total_spots_filled = 0;

        for (Course c : this.courses) {
            total_spots_filled += c.getNumStudents();
        }

        return total_spots_filled / this.courses.length;
    }
}