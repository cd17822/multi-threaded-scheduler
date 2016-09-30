package registrationScheduler.pools;

import java.util.ArrayList;
import registrationScheduler.util.Logger;
import registrationScheduler.entities.Course;

public class CoursePool {
    private ArrayList<Course> courses = new ArrayList<Course>();

	/**
	 * Creates new CoursePool object
	 */
    public CoursePool() {
      Logger.writeMessage("CoursePool constructed\n",
                            Logger.DebugLevel.CONSTRUCTOR);
    }
	
	/**
	 * @return Course object specified by name or
	 * null if the Course object cannot be found
	 */
    public Course getCourseWithName(String name) {
        for (Course c : courses) {
            if (name.equals(c.getName())) {
                return c;
            }
        }
        return null;
    }

	/**
	 * @return void
	 */
    public void addCourse(Course course) {
        courses.add(course);
    }

	/**
	 * @return float of average number of students per course
	 */
    public synchronized float getAverageStudentsPerCourse() {
        if (courses.size() == 0) return 0;

        float total_spots_filled = 0;

        for (Course c : courses) {
            total_spots_filled += c.getNumStudents();
        }

        return total_spots_filled / courses.size();
    }
}
