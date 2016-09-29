package registrationScheduler;//.pools;

import java.util.ArrayList;

public class CoursePool {
    private ArrayList<Course> courses = new ArrayList<Course>();

    public CoursePool() {
      Logger.writeMessage("CoursePool constructed\n",
                            Logger.DebugLevel.CONSTRUCTOR);
    }

    public Course getCourseWithName(String name) {
        for (Course c : courses) {
            if (name == c.getName()) {
                return c;
            }
        }
        return null;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public float getAverageStudentsPerCourse() {
        if (courses.size() == 0) return 0;

        float total_spots_filled = 0;

        for (Course c : courses) {
            total_spots_filled += c.getNumStudents();
        }

        return total_spots_filled / courses.size();
    }
}
