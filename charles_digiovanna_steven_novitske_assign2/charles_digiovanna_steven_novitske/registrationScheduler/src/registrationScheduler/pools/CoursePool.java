package registrationScheduler.pools;

import registrationScheduler.threadMgmt.Student;
import java.util.ArrayList;

public class CoursePool {
    private ArrayList<Course> courses = new ArrayList<Course>();

    public CoursePool();

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
}