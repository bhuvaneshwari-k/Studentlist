package org.example;
import java.util.logging.*;
import java.util.*;

class StudentTest {
    public static void main(String[] args) {
        Logger l = Logger.getLogger("student.class");
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        String msg="Enter the Student Name,Age,GPA:";
        l.info(msg);
        s1.setDetail(s.nextLine(), sc.nextInt(), sc.nextDouble());
        l.info(msg);
        s2.setDetail(s.nextLine(), sc.nextInt(), sc.nextDouble());
        l.info(msg);
        s3.setDetail(s.nextLine(), sc.nextInt(), sc.nextDouble());
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        int length = list.size();
        int i = 0;
        l.info("UnSorted List:");
        while (i<length) {
            list.get(i).getDetail();
            i++;
        }
        i=0;
        l.info("Sorted List:");
        while (i < length) {
            Collections.sort(list, new Student());
            list.get(i).getDetail();
            i++;
        }

    }
}