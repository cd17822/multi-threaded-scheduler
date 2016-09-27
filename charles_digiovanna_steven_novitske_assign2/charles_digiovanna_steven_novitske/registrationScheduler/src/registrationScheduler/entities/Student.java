package registrationScheduler.entities;

import java.util.ArrayList;

public class Student {
    private String name;
    private int preference_score;

    private final int max_courses = 5;
    private final int max_preferences = 7;

    private ArrayList<Course> courses = new ArrayList<>();
    private Course[] preferences = new Course[max_preferences];
    /**
     * preferences represents: preference_for_A prefrence_for_B
     * preference_for_C preference_for_D,
     * where 1 is top preference and 4 is lowest preference.
     */

    /**
     * Student constructor that assigns name param to name member
     * variable.
     */
    public Student(String name) {
        this.name = name;
    }

    /**
     * @return string with description of object.
     */
    public String toString() {
        return "Student('" + this.name + "')";
    }

    /**
     * @return name member variable.
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return preference_score member variable.
     */
    public int getPreferenceScore() {
        return this.preference_score;
    }

    /**
     * @return courses member variable.
     */
    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    /**
     * @return preferences member variable.
     */
    public Course[] getPreferences() {
        return this.preferences;
    }

    /**
     * sets preferences member variable.
     */
    public void setPreferences(Course[] preferences){ //throws BadInputException {
        if (preferences.length != this.max_preferences) {
            //throw new BadInputException("Preferences array is not of length 4.");
        }

        for (int i = 0; i < preferences.length; ++i) {
            this.preferences[i] = preferences[i];
        }
    }

    /**
     * @return max_preferences limit
     */
    public int getMaxPreferences() {
        return this.max_preferences;
    }

    /**
     * Attempts to add a course at the priority specified by the
     * priority param to the student. Possible restrictions
     * include the student having too many courses and/or the course
     * having too many students.
     * @return boolean for whether or not course was able to be added
     */
    public Boolean tryToAddCourseAtPriority(int priority) {
        if (courses.size() >= max_courses) {
            return false;
        }

        if (preferences[priority].tryToAddStudent(this)) {
            this.courses.add(preferences[priority]);
            this.preference_score += priority + 1;
        } else {
            return false;
        }

        return true;
    }
}
