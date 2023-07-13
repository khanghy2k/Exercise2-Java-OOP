package com.rikkei.academy.oop.oop;

public class Program {
    public static void main(String[] args) {
        Student st;
        st = new Student();
        Student st1 = new Student("HHy","khanghy@gmail.com");
        st.hello();
        st1.hello();
        Student.test();
        System.out.println("st.fullname = " + st.getFullname());
    }
}

