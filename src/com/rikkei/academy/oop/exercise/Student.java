package com.rikkei.academy.oop.exercise;

import java.util.Scanner;

public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private double markJS;
    private double markHTML;
    private double markCSS;
    private double markAvg;
    private String rank;

    public Student(String id, String firstName, String lastName, double markJS,double markHTML, double markCSS) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.markJS = markJS;
        this.markHTML = markHTML;
        this.markCSS = markCSS;
    }

    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID Sinh Viên");
        this.id = scanner.nextLine();
        System.out.println("First Name : ");
        this.firstName = scanner.nextLine();
        System.out.println("Last Name : ");
        this.lastName = scanner.nextLine();
        System.out.println("MarkJs : ");
        this.markJS = scanner.nextDouble();
        System.out.println("MarkHTML");
        this.markHTML = scanner.nextDouble();
        System.out.println("MarkCSS");
        this.markCSS = scanner.nextDouble();

    }
    public void outputData(){
        System.out.println("ID : "+id);
        System.out.println("Họ  : "+firstName);
        System.out.println("Tên : "+lastName);
        System.out.println("Điểm JS : "+markJS);
        System.out.println("Điểm HTML: "+markHTML);
        System.out.println("Điểm CSS : "+markCSS);

    }

    public Student(){

    }
    public void calculatorMarkAvg(){
        double _result = (markHTML+markJS+markCSS)/ 3;
        markAvg = _result;
        if (_result <= 5) {
            rank = "Trung Bình";
        } else if (_result >= 5 && _result <= 8){
            rank = " Khá";
        } else if (_result <= 10 && _result >= 8){
           rank = "Giỏi";
        }
    }

    public double getMarkHTML() {
        return markHTML;
    }

    public void setMarkHTML(double markHTML) {
        this.markHTML = markHTML;
    }

    public double getMarkAvg() {
        return markAvg;
    }

    public String getRank() {
        return rank;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getMarkJS() {
        return markJS;
    }

    public void setMarkJS(double markJS) {
        this.markJS = markJS;
    }

    public double getMarkCSS() {
        return markCSS;
    }

    public void setMarkCSS(double markCSS) {
        this.markCSS = markCSS;
    }
}
