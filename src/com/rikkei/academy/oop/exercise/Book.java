package com.rikkei.academy.oop.exercise;

import java.util.Locale;
import java.util.Scanner;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private double price;
    private int year;
    private boolean status;


    public Book(String bookId, String title, String author, double price, int year, boolean status) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
        this.status = status;
    }
    public Book() {

    }
    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        boolean checkInput = true ;
        do {
            System.out.println("Nhập ID sách : ");
            String id = scanner.nextLine();
            if (id.startsWith("SP")){
                this.bookId = id;
            } else {
                checkInput = false;
                System.out.println("Mã sách phải bắt đầu bằng SP");
            }
        }while (!checkInput);

        System.out.println("Nhập tiêu đề sách : ");
        setTitle(title);
        this.title = scanner.nextLine();

        System.out.print("Nhập tác giả cuốn sách : ");
        this.author = scanner.nextLine();

        System.out.print("Nhập giá cuốn sách : ");
        setPrice(price);
        this.price = scanner.nextDouble();

        System.out.print("Nhập năm sản xuất ");
        this.year = scanner.nextInt();

        System.out.print("Nhập trạng thái cuốn sách true/false :  ");
        this.status = scanner.nextBoolean();


    }

    public void outputData(){
        System.out.println("Thông tin sách : ");
        System.out.println("bookId : " + bookId);
        System.out.println("Tiêu đề : "+title);
        System.out.println("Tác giả : " + author);
        System.out.println("Giá  : " + price);
        System.out.println("Năm sản xuất : " + year);
        System.out.println("Trạng thái : "+status);
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
            this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
