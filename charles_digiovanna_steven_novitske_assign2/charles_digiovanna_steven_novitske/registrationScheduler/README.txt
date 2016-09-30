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

(using ant -buildfile src/build.xml run)

run:
     [java] Student_1
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_2
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_3
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_4
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]
     [java]
     [java] Student_5
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]
     [java]
     [java] Student_6
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_7
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_8
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('6')
     [java]
     [java]
     [java] Student_9
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]
     [java]
     [java] Student_10
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_11
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_12
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('6')
     [java]
     [java]
     [java] Student_13
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_14
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_15
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('6')
     [java]
     [java]
     [java] Student_16
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]
     [java]
     [java] Student_17
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]
     [java]
     [java] Student_18
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_19
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_20
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('6')
     [java]
     [java]
     [java] Student_21
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]
     [java]
     [java] Student_22
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_23
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_24
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('6')
     [java]
     [java]
     [java] Student_25
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_26
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_27
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('6')
     [java]
     [java]
     [java] Student_28
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]
     [java]
     [java] Student_29
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]
     [java]
     [java] Student_30
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_31
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_32
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('6')
     [java]
     [java]
     [java] Student_33
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]
     [java]
     [java] Student_34
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_35
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_36
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('6')
     [java]
     [java]
     [java] Student_37
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_38
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_39
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('6')
     [java]
     [java]
     [java] Student_40
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]
     [java]
     [java] Student_41
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]
     [java]
     [java] Student_42
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_43
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_44
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('6')
     [java]
     [java]
     [java] Student_45
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]
     [java]
     [java] Student_46
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_47
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_48
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('6')
     [java]
     [java]
     [java] Student_49
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_50
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_51
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('6')
     [java]
     [java]
     [java] Student_52
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]
     [java]
     [java] Student_53
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_54
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_55
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('6')
     [java]
     [java]
     [java] Student_56
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]
     [java]
     [java] Student_57
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]
     [java]
     [java] Student_58
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_59
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_60
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('6')
     [java]
     [java]
     [java] Student_61
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]
     [java]
     [java] Student_62
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_63
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_64
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('6')
     [java]
     [java]
     [java] Student_65
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]
     [java]
     [java] Student_66
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_67
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_68
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('6')
     [java]
     [java]
     [java] Student_69
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]
     [java]
     [java] Student_70
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_71
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_72
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('6')
     [java]
     [java]
     [java] Student_73
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_74
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_75
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('6')
     [java]
     [java]
     [java] Student_76
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]
     [java]
     [java] Student_77
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_78
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('5')
     [java]  Course('6')
     [java]  Course('7')
     [java]
     [java]
     [java] Student_79
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('6')
     [java]
     [java]
     [java] Student_80
     [java]  Course('1')
     [java]  Course('2')
     [java]  Course('3')
     [java]  Course('4')
     [java]  Course('5')
     [java]
     [java]
     [java] Average preference score: 19.2625

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
