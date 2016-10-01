package registrationScheduler.threadMgmt;

import registrationScheduler.util.Logger;
import registrationScheduler.util.FileProcessor;
import registrationScheduler.store.Results;
import registrationScheduler.pools.CoursePool;
import registrationScheduler.entities.Student;
import registrationScheduler.entities.Course;

public class WorkerThread implements Runnable  {
    private FileProcessor file_processor;
    private Results results;
    private CoursePool course_pool;

	/**
	 * Creates new WorkerThread with proper FileProcessor, Results,
	 * and CoursePool objects
	 */
    public WorkerThread(FileProcessor fp, Results r, CoursePool cp) {
        Logger.writeMessage("WorkerThread constructed\n",
                              Logger.DebugLevel.CONSTRUCTOR);
        file_processor = fp;
        results = r;
        course_pool = cp;
    }

	/**
	 * @return void
	 */
    public void run() {
        Logger.writeMessage("Thread run() called\n",
                              Logger.DebugLevel.THREADRUN);
        String line;
        while((line = file_processor.readLine()) != null) {
            Student student = createStudent(line);
            assignCourses(student);
            results.storeStudent(student);
        }
    }

	/**
	 * @return Student object that was created with the line from file
	 */
    private Student createStudent(String line) {
        String[] tokens = line.split("\\s+");
        if (tokens.length != Student.MAX_PREFERENCES + 1) {
            System.err.println("Invalid line in input: " + line);
            return null;
        }
        Student student = new Student(tokens[0]);
        Course[] preferences = new Course[Student.MAX_PREFERENCES];

        for (int i = 0; i < Student.MAX_PREFERENCES; ++i) {
            String course_name = "";
            if(i==0) course_name = "A";
            else if(i==1) course_name = "B";
            else if(i==2) course_name = "C";
            else if(i==3) course_name = "D";
            else if(i==4) course_name = "E";
            else if(i==5) course_name = "F";
            else if(i==6) course_name = "G";
            preferences[i] = course_pool.getCourseWithName(course_name);
            // if you can't find course in pool, add a new one by that name
            if (preferences[i] == null) {
                Course newCourse = new Course(course_name);
                course_pool.addCourse(newCourse);
                preferences[i] = course_pool.getCourseWithName(course_name);
            }
        }
        student.setPreferences(preferences);

        return student;
    }

	/**
	 * @return void
	 */
    private void assignCourses(Student student) {
        Course[] courses_by_preference = student.getPreferences();
        float average_students_per_course = course_pool.getAverageStudentsPerCourse();
        int rejections = 0; // amount of times they couldn't get into a class they wanted

        for  (int i = 0; i < courses_by_preference.length; ++i) {
            Course course = courses_by_preference[i];
            if (rejections >= 2 || course.getNumStudents()/average_students_per_course <= 1.05) { // 1.05 is the golden ratio
                if (!student.tryToAddCourseAtPriority(i)) {
                    ++rejections;
                }
            } else {
                ++rejections;
            }
        }
    }
}
