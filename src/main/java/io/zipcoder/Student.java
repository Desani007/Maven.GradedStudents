package io.zipcoder;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    String grade;
    ArrayList<Double> testScores = new ArrayList<>();

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        for (Double scores : examScores) {
            testScores.add(scores);
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setTestScores(ArrayList<Double> testScores)
    {
        this.testScores = testScores;
    }
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public ArrayList<Double> getTestScores() {
        return testScores;
    }
    public double getNumberOfExamsTaken() {
        int total = 0;
        for (Double score : testScores) {
            total += score;

        }
        return total;
    }

    public String getExamScores() {
        String exams = "";
        int count = 1;
        for (int i = 0; i < testScores.size(); i++) {
            DecimalFormat format = new DecimalFormat("0.#");
            exams += "Exam " + count++ + " -> " + format.format(testScores.get(i)) + "\n";

        }




        return exams;
    }

    public void addExamScore(Double score) {

        testScores.add(score);
    }

    public int setExamScore(int examNumber, double newScore) {
        double value = 0;
        for (int i = 0; i < testScores.size(); i++) {
            value = testScores.set(i, newScore);
        }
        int integer = (int) value;
        return integer;

    }

    public double getAverageExamScore() {


        return getNumberOfExamsTaken() / testScores.size();
    }

    public String toString() {
        DecimalFormat format = new DecimalFormat("0.#");

        String studentName = getFirstName() + " " + getLastName();
        String averageScore = String.valueOf(format.format(getAverageExamScore()));
        String result = "";


        result = "Student Name: " + studentName + "\n" + "Average Score: " +
                averageScore + "\n" + "Exam Scores: \n" + getExamScores();
        return result;
    }

    public String toString( String firstName){

        String  studentName = getFirstName() + " " + getLastName();
        return studentName;

  }
}
