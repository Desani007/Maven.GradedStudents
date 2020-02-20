package io.zipcoder;

import java.util.ArrayList;

public class Classroom {

    ArrayList<Student> studentsInClass = new ArrayList<>();
    int maxNumberOfStudents;
    Student students;
    public Classroom(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public Classroom(int maxNumberOfStudents, Student... students) {
        this.maxNumberOfStudents = maxNumberOfStudents;
        for (Student student :students){
            studentsInClass.add(student);
        }
    }
    public Classroom(Student... students) {
        for (Student student : students) {
            this.studentsInClass.add(student);
        }
    }



    public ArrayList<Student>  getStudents() {

        return studentsInClass;
    }

    public void setStudent(Student student) {
        this.students = student;
    }


    public void removeStudent ( Student student){
        studentsInClass.remove(student);
    }





    public int getMaxNumberOfStudents() {
        return maxNumberOfStudents;
    }

    public void setMaxNumberOfStudents(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public double getAverageExamScore() {
        double  total = 0;
        for ( Student s : studentsInClass){
            total += s.getNumberOfExamsTaken();
        }
        return total/studentsInClass.size();
 }

    public void add(Student student){
        studentsInClass.add(student);
    }


    public Student getStudentsByScore (Double score){

        for (Student student :studentsInClass){
            ArrayList<Double> testScores = student.testScores;
            for (int i = 0; i < testScores.size(); i++) {
                Double exam = testScores.get(i);
                if (exam.equals(score)) {
                    return student;
                }

            }
        }
      return students;

    }



    public ArrayList<String>  getGradeBook () {
        Double classAverage = getAverageExamScore();
        ArrayList<String> grades = new ArrayList<>();

        for ( Student student : studentsInClass){
                 Double average= student.getAverageExamScore();
                  if ((average>=90.0)){
                      student.setGrade("A");
                      grades.add(student.getGrade());
            }if (( average<=100) && (average>=90)){
                      student.setGrade("B");
                grades.add(student.getGrade());
            }if (( average<=89.0) && (average>=80.0)){
                student.setGrade("C");
                grades.add(student.getGrade());
            }if (( average<=79.0) && (average>=70.0)){
                student.setGrade( "D");
                grades.add(student.getGrade());
            }if (( average<=69.0) && (average>=60.0)){
                student.setGrade( "E");
                grades.add(student.getGrade());
            }if (( average<=59.0) && (average>=0.0)){
               student.setGrade( "F");
                grades.add(student.getGrade());
            }

        }

    return grades;
    }


}