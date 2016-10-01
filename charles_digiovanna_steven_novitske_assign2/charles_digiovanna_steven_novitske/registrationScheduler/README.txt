CS442 Design Patterns
Fall 2016
Assign 2 README

Due Date: Friday, September 30, 2016
Submission Date: Friday, September 30, 2016
Author: Charles DiGiovanna & Steve Novitske
Email: cdigiov1@binghamon.edu & snovits1@binghamton.edu
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

Student_1 C D E F G 25
Student_2 A B E F G 21
Student_3 A B C D G 17
Student_4 A B C D E 15
Student_5 A B C D E 15
Student_6 C D E F G 25
Student_7 A B E F G 21
Student_8 A B C D F 16
Student_9 A B C D E 15
Student_10 C D E F G 25
Student_11 A B E F G 21
Student_12 A B C D F 16
Student_13 C D E F G 25
Student_14 A B E F G 21
Student_15 A B C D F 16
Student_16 A B C D E 15
Student_17 A B C D E 15
Student_18 C D E F G 25
Student_19 A B E F G 21
Student_20 A B C D F 16
Student_21 A B C D E 15
Student_22 C D E F G 25
Student_23 A B E F G 21
Student_24 A B C D F 16
Student_25 C D E F G 25
Student_26 A B E F G 21
Student_27 A B C D F 16
Student_28 A B C D E 15
Student_29 A B C D E 15
Student_30 C D E F G 25
Student_31 A B E F G 21
Student_32 A B C D F 16
Student_33 A B C D E 15
Student_34 C D E F G 25
Student_35 A B E F G 21
Student_36 A B C D F 16
Student_37 C D E F G 25
Student_38 A B E F G 21
Student_39 A B C D F 16
Student_40 A B C D E 15
Student_41 A B C D E 15
Student_42 C D E F G 25
Student_43 A B E F G 21
Student_44 A B C D F 16
Student_45 A B C D E 15
Student_46 C D E F G 25
Student_47 A B E F G 21
Student_48 A B C D F 16
Student_49 C D E F G 25
Student_50 A B E F G 21
Student_51 A B C D F 16
Student_52 A B C D E 15
Student_53 C D E F G 25
Student_54 A B E F G 21
Student_55 A B C D F 16
Student_56 A B C D E 15
Student_57 A B C D E 15
Student_58 C D E F G 25
Student_59 A B E F G 21
Student_60 A B C D F 16
Student_61 A B C D E 15
Student_62 C D E F G 25
Student_63 A B E F G 21
Student_64 A B C D F 16
Student_65 A B C D E 15
Student_66 C D E F G 25
Student_67 A B E F G 21
Student_68 A B C D F 16
Student_69 A B C D E 15
Student_70 C D E F G 25
Student_71 A B E F G 21
Student_72 A B C D F 16
Student_73 C D E F G 25
Student_74 A B E F G 21
Student_75 A B C D F 16
Student_76 A B C D E 15
Student_77 C D E F G 25
Student_78 A B E F G 21
Student_79 A B C D F 16
Student_80 A B C D E 15
The average preference value is 19.2625

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
