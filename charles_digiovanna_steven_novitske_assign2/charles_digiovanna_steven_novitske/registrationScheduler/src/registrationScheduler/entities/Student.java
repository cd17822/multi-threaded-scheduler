package registrationScheduler;//.entities;

import java.util.ArrayList;

public class Student {
    private String name;
    private int preference_score;

    private final int MAX_COURSES = 5;
    private final int MAX_PREFERENCES = 7;

    private ArrayList<Course> courses = new ArrayList<>();
    private Course[] preferences = new Course[MAX_PREFERENCES];
    /**
     * preferences represents: preference_for_A prefrence_for_B
     * preference_for_C preference_for_D,
     * where 1 is top preference and 4 is lowest preference.
     */

    /**
     * Student constructor that assigns name param to name member
     * variable.
     */
    public Student(String nameIn) {
        Logger.writeMessage("Student " + nameIn + " constructed\n",
                            Logger.DebugLevel.CONSTRUCTOR);
        name = nameIn;
    }

    /**
     * @return string with description of object.
     */
    public String toString() {
        return "Student('" + name + "')";
    }

    /**
     * @return name member variable.
     */
    public String getName() {
        return name;
    }

    /**
     * @return preference_score member variable.
     */
    public int getPreferenceScore() {
        return preference_score;
    }

    /**
     * @return courses member variable.
     */
    public ArrayList<Course> getCourses() {
        return courses;
    }

    /**
     * @return preferences member variable.
     */
    public Course[] getPreferences() {
        return preferences;
    }

    /**
     * sets preferences member variable.
     */
    public void setPreferences(Course[] preferencesIn){ //throws BadInputException {
        if (preferencesIn.length != MAX_PREFERENCES) {
            //throw new BadInputException("Preferences array is not of length 4.");
        }

        for (int i = 0; i < preferencesIn.length; ++i) {
            preferences[i] = preferencesIn[i];
        }
    }

    /**
     * @return max_preferences limit
     */
    public int getMaxPreferences() {
        return MAX_PREFERENCES;
    }

    /**
     * Attempts to add a course at the priority specified by the
     * priority param to the student. Possible restrictions
     * include the student having too many courses and/or the course
     * having too many students.
     * @return boolean for whether or not course was able to be added
     */
    public Boolean tryToAddCourseAtPriority(int priority) {
        if (courses.size() >= MAX_COURSES) {
            return false;
        }

        if (preferences[priority].tryToAddStudent(this)) {
            courses.add(preferences[priority]);
            preference_score += priority + 1;
        } else {
            return false;
        }

        return true;
    }
}
