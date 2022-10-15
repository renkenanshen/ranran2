package com_ran_demo1;

public class Demo1 {
    private String name;
    private int age;
    private String sex;

    public Demo1() {
    }

    public Demo1(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

//    public static void main(String[] args) {
//        Demo1 person2 = new Demo1();
//        person2.name = "lisi";
//        person2.age = 22;
//        person2.sex = "nv";
//        System.out.println(person2.name);
//    }
}
