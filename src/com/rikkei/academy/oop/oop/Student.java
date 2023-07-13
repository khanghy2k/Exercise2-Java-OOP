package com.rikkei.academy.oop.oop;

import java.util.Locale;

public class Student {
    //Thuộc tính / Field
    private String fullname;
    private String email;
    private String address;


    // hàm khởi tạo (constructor)
    public Student(){

    }
    public Student(String fullName,String email){
        this.fullname = fullName;
        this.email = email;
    }
    // Phương thức getter / setter
    public String getFullname(){
        return this.fullname.toUpperCase();
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail(){
        return  this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    // Hành vi của đối tượng (Method)
    public void hello(){
        System.out.println("Student Hello");
    }
    public static void test(){
        System.out.println("Static method");
    }
}