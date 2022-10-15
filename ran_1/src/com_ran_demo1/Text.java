package com_ran_demo1;

public class Text {
    public static void main(String[] args) {
//        Demo1 person1 = new Demo1("zhangsan", 23, "nan");
//
//        System.out.println(person1.getAge());
////        System.out.println(person2);
//
//
//        Demo2 person3 = new Demo2();
//        person3.name = "wangwu";
//        System.out.println(person3.name);
//
//
//        String str = new String();
//        System.out.println("@" + str + "!");


        Student.teatherName = "hua";
        Student student = new Student("梨花", 21, "nv");
//        student.teatherName = "li";
        student.study();
        student.show();
        Student student1 = new Student("zhanghua", 14, "nan");
        student1.study();
        student1.show();



        int [] arr = {1,2,3};
        System.out.println(arr[1]);
    }
}
