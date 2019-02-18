//1. Create a class called StudentMarks, which prompts user for the number of students, reads it
//        from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
//        grades of each of the students and saves them in an int array called stuGrades. Your program shall
//        check that the grade is between 0 and 100 else has to trow an error message.
package com.stackroute;

public class StudentMarks {
    public String s1 = "true";
    public String s2 = "false";

    /*This method checks if the marks of student is within the range of 0 and 100*/
    public String checkGrade(int numOfStudents, int[] stuGrades) {

        for (int i = 0; i < numOfStudents; i++) {
            if (stuGrades[i] < 0 || stuGrades[i] > 100) {
                return s2;
            }
        }
        return s1;
    }
}
