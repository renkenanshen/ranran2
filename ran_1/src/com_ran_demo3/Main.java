package com_ran_demo3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student student1 = new Student("zhangsan",22,"nan");
        Student student2 = new Student("lidi",21,"nan");
        Student student3 = new Student("lihua",22,"nan");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        for (int i = 0; i< list.size();i++){
            System.out.println(list.get(i).getName());
        }

    }
}
