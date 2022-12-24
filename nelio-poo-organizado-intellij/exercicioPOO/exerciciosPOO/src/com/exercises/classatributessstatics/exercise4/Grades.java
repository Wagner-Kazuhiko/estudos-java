package com.exercises.classatributessstatics.exercise4;

public class Grades {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade(){
        return (grade1 + grade2 + grade3);
    }

    @Override
    public String toString() {
        return "FINAL GRADE: " + finalGrade();
    }

    public String aprovedOrNot(){
        if (finalGrade() >= 60.0){
            System.out.println("PASS");
        }
        else if (finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.println("MISSING " + (60 - finalGrade()) + " POINTS");
        }
        return "END";
    }
}
