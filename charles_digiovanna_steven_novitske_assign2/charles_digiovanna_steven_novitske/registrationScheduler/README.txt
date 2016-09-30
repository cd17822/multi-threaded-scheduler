CS442 Design Patterns
Fall 2016
Assign 2 README

Due Date: Friday, September 30, 2016
Submission Date: Friday, September 30, 2016
Author: Charles DiGiovanna & Steve Novitske
e-mail: cdigiov1@binghamon.edu & snovits1@binghamton.edu
Grace Period Remaining: 4 Days & 4 Days
Grace Period Used This Project: 0 Days

PURPOSE:

To use threads in assigning students to courses based on preferences.

PERCENT COMPLETE:

100%

PARTS THAT ARE NOT COMPLETE:

N/A

BUGS:

N/A

FILES:

Included with this project are 12 files:

README.txt, the text file you are presently reading
src/
    - build.xml, ant build directions
    - registrationScheduler/
        - driver/
            - Driver.java, driver with main
        - entities/
            - Course.java, course class
            - Student.java, student class
        - pools/
            - CoursePool.java, pool of courses
        - store/
            - FileDisplayInterface.java, interface that ensures writeSchedulesToFile method
            - Results.java, implements FileDisplayInterface and StdoutDisplayInterface and stores student data structure
            - StdoutDisplayInterface.java, interface that ensures writeSchedulesToScreen method
        - threadMgmt/
            - CreateWorkers.java, creates worker threads to assign students to classes
        - util/
            - FileProcessor.java, reads input file
            - Logger.java, records debugging statements

SAMPLE OUTPUT:

(from output file)

//MAKE SURE WE DO SOMETHING WITH THIS

COMMANDS:

## To clean:
ant -buildfile src/build.xml clean

## To compile:
ant -buildfile src/build.xml all

## To run by specifying arguments from command line [similarly for the 2nd argument and so on ...]
## We will use this to run your code
ant -buildfile src/build.xml run -Darg0=firstarg

## To run by specifying args in build.xml (just for debugging, not for submission)
ant -buildfile src/build.xml run

## To create tarball for submission
ant -buildfile src/build.xml tarzip

EXTRA CREDIT:

N/A

BIBLIOGRAPHY:

N/A

ACKNOWLEDGEMENT:

N/A

RESULTS DATA STRUCTURE:

We chose to use an ArrayList of Student's for our Results data structure so that threads can add students to an array-like structure without having to worry about indices. Insertions take place in constant time.
