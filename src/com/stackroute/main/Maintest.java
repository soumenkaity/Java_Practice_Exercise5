package com.stackroute.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Maintest {
    public String implementer(ArrayList<Student> students) {

        Comparator<Student> studentComparator = new StudentSorter();          // creation of comparator object
        Collections.sort(students, studentComparator);                       // sorting the array

        return students.toString();
    }

    public void createStudentListAndSort(){
        ArrayList<Student> students=new ArrayList<Student>();
        Student student1=new Student("abc","sab",1);
        Student student2=new Student("def","yas",2);
        Student student3=new Student("ghi","sac",2);
        Student student4=new Student("jkl","his",3);
        Student student5=new Student("mno","sah",4);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        System.out.println(implementer(students));
    }

    public static void main(String[] args) {
        Maintest maintest = new Maintest();
        maintest.createStudentListAndSort();
    }
}
