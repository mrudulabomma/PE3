package com.stackroute.pe3;

public class StudentMarks {
    int count=0;
    public  String grades(int numOfStudents,int[] stuGrades){
        for(int i=0;i<numOfStudents;i++) {
            if (stuGrades[i] >= 0 && stuGrades[i] <= 100)
                count++;
        }
            if(count==numOfStudents)
                return "grades are between 0 and 100";
            else
                return "error";



    }
}
