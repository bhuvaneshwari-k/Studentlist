package org.example;
import java.util.logging.*;
import java.util.*;
class Student implements Comparator<Student>{
    Logger l=Logger.getLogger("student.class");
    String name;
    int age;
    double gpa;

    Student() {

    }
    void setDetail(String sName,int sAge,double sGPA) {
        this.name = sName;
        this.age = sAge;
        this.gpa = sGPA;
    }
    void getDetail() {
        l.log(Level.INFO,()-> "Student name is :"+name);
        l.log(Level.INFO,()-> "Student age is :"+age);
        l.log(Level.INFO,()-> "Student gpa is :"+gpa);
    }
    public int compare(Student a,Student b){
        return (int) ((int)b.gpa-a.gpa);
    }
}