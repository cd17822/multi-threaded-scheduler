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

Student_1 Course('5') Course('2') Course('6') Course('1') Course('7')
Student_2 Course('7') Course('2') Course('4') Course('5') Course('3')
Student_3 Course('6') Course('4') Course('1') Course('2') Course('3')
Student_4 Course('4') Course('5') Course('7') Course('3') Course('6')
Student_5 Course('3') Course('5') Course('1') Course('7') Course('6')
Student_6 Course('5') Course('2') Course('1') Course('7') Course('4')
Student_7 Course('6') Course('1') Course('4') Course('2') Course('3')
Student_8 Course('2') Course('7') Course('4') Course('5') Course('3')
Student_9 Course('1') Course('7') Course('4') Course('5') Course('6')
Student_10 Course('1') Course('6') Course('3') Course('2') Course('7')
Student_11 Course('4') Course('1') Course('2') Course('6') Course('3')
Student_12 Course('5') Course('6') Course('3') Course('4') Course('2')
Student_13 Course('5') Course('7') Course('4') Course('2') Course('1')
Student_14 Course('3') Course('7') Course('5') Course('6') Course('1')
Student_15 Course('5') Course('3') Course('4') Course('2') Course('1')
Student_16 Course('6') Course('7') Course('1') Course('4') Course('5')
Student_17 Course('6') Course('5') Course('2') Course('1') Course('3')
Student_18 Course('7') Course('2') Course('4') Course('3') Course('6')
Student_19 Course('6') Course('3') Course('1') Course('5') Course('7')
Student_20 Course('4') Course('5') Course('7') Course('1') Course('2')
Student_21 Course('7') Course('6') Course('5') Course('3') Course('2')
Student_22 Course('2') Course('1') Course('6') Course('4') Course('3')
Student_23 Course('6') Course('2') Course('3') Course('7') Course('5')
Student_24 Course('4') Course('5') Course('7') Course('1') Course('2')
Student_25 Course('4') Course('3') Course('6') Course('7') Course('1')
Student_26 Course('7') Course('6') Course('1') Course('3') Course('5')
Student_27 Course('2') Course('1') Course('3') Course('4') Course('5')
Student_28 Course('1') Course('5') Course('3') Course('6') Course('2')
Student_29 Course('3') Course('6') Course('4') Course('1') Course('5')
Student_30 Course('4') Course('6') Course('2') Course('3') Course('7')
Student_31 Course('2') Course('4') Course('1') Course('7') Course('6')
Student_32 Course('2') Course('1') Course('3') Course('7') Course('5')
Student_33 Course('1') Course('4') Course('6') Course('5') Course('7')
Student_34 Course('2') Course('4') Course('7') Course('3') Course('5')
Student_35 Course('6') Course('1') Course('5') Course('7') Course('4')
Student_36 Course('6') Course('3') Course('1') Course('2') Course('7')
Student_37 Course('3') Course('7') Course('5') Course('6') Course('2')
Student_38 Course('6') Course('4') Course('1') Course('2') Course('7')
Student_39 Course('4') Course('7') Course('5') Course('3') Course('6')
Student_40 Course('2') Course('6') Course('7') Course('1') Course('4')
Student_41 Course('2') Course('4') Course('5') Course('6') Course('1')
Student_42 Course('3') Course('2') Course('7') Course('4') Course('1')
Student_43 Course('6') Course('2') Course('7') Course('4') Course('3')
Student_44 Course('5') Course('3') Course('4') Course('2') Course('7')
Student_45 Course('6') Course('5') Course('7') Course('1') Course('4')
Student_46 Course('2') Course('3') Course('6') Course('4') Course('1')
Student_47 Course('3') Course('7') Course('6') Course('1') Course('2')
Student_48 Course('1') Course('5') Course('2') Course('3') Course('4')
Student_49 Course('7') Course('3') Course('1') Course('6') Course('4')
Student_50 Course('4') Course('3') Course('1') Course('5') Course('7')
Student_51 Course('1') Course('7') Course('3') Course('4') Course('6')
Student_52 Course('3') Course('1') Course('6') Course('2') Course('4')
Student_53 Course('5') Course('3') Course('6') Course('2') Course('7')
Student_54 Course('1') Course('4') Course('6') Course('5') Course('3')
Student_55 Course('7') Course('1') Course('6') Course('4') Course('2')
Student_56 Course('6') Course('2') Course('3') Course('1') Course('5')
Student_57 Course('4') Course('3') Course('1') Course('2') Course('5')
Student_58 Course('5') Course('3') Course('6') Course('2') Course('4')
Student_59 Course('3') Course('6') Course('5') Course('2') Course('1')
Student_60 Course('1') Course('7') Course('4') Course('5') Course('3')
Student_61 Course('4') Course('2') Course('5') Course('1') Course('7')
Student_62 Course('4') Course('6') Course('7') Course('3') Course('2')
Student_63 Course('6') Course('5') Course('2') Course('7') Course('1')
Student_64 Course('1') Course('2') Course('7') Course('5') Course('3')
Student_65 Course('3') Course('7') Course('1') Course('2') Course('6')
Student_66 Course('4') Course('3') Course('5') Course('7') Course('6')
Student_67 Course('2') Course('7') Course('4') Course('1') Course('3')
Student_68 Course('1') Course('5') Course('6') Course('2') Course('7')
Student_69 Course('2') Course('4') Course('6') Course('5') Course('3')
Student_70 Course('3') Course('7') Course('6') Course('5') Course('4')
Student_71 Course('2') Course('1') Course('6') Course('3') Course('5')
Student_72 Course('7') Course('5') Course('6') Course('4') Course('3')
Student_73 Course('1') Course('2') Course('7') Course('6') Course('4')
Student_74 Course('5') Course('7') Course('1') Course('4') Course('6')
Student_75 Course('1') Course('7') Course('4') Course('6') Course('2')
Student_76 Course('5') Course('4') Course('7') Course('3') Course('2')
Student_77 Course('3') Course('4') Course('5') Course('6') Course('1')
Student_78 Course('5') Course('6') Course('2') Course('1') Course('7')
Student_79 Course('4') Course('7') Course('2') Course('3') Course('5')
Student_80 Course('5') Course('3') Course('6') Course('4') Course('1')
Average preference score: 16.15

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
