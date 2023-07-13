package com.rikkei.academy.oop.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        /**
         * Định nghĩa lớp Book gồm các thông tin
         * bookId(String),
         * title(String),
         * author(String),
         * price(double),
         * year(int),
         * status(boolean)
         * Trong lớp Book, khai báo 2 constructor không tham số và có tham số (khởi tạo đầy đủ các
         * thông tin của đối tượng Book). Định nghĩa 2 phương thức inputData() để nhập dữ liệu cho
         * Book và outputData() hiển thị thông tin của đối tượng Book ra màn hình
         *
         * Khởi tạo đối tượng book ở hàm main(),gọi các phương thức inputData() và outputData()
         * để kiểm tra.
         *
         * Yêu cầu nhập :
         * bookId : phải bắt đầu bằng "SP"
         * title : Nhập In Hoa
         * price : Tối thiếu 1000
         * */
//        Book myBook = new Book();
//        myBook.inputData();
//        myBook.outputData();

        /**
         * Viết chương trình Java quản lý mảng n Quyển sách. Có các chức năng sau:
         * 1. Nhập n quyển sách
         * 2. Hiển thị danh sách các quyển sách vừa nhập
         * 3. Sắp xếp sách theo tiêu đề từ A-Z
         * 4. Tìm các quyển sách theo năm xuất bản
         * 5. Thoát chương trình
         * */
        Scanner sc = new Scanner(System.in);
        Book[] books = null;
            while (true) {
           System.out.println("1.Nhập n quyển sách");
           System.out.println("2. Hiển thị danh sách các quyển sách vừa nhập");
           System.out.println("3. Sắp xếp sách theo tiêu đề từ A-Z");
           System.out.println("4. Tìm các quyển sách theo năm xuất bản");
           System.out.println("5. Thoát chương trình");
           System.out.println("Chọn tính năng (1->5) : ");

           int choose = Integer.parseInt(sc.nextLine());
           switch (choose){
               case 1 :
                   System.out.println("Số sách cần nhập : ");
                   int n = Integer.parseInt(sc.nextLine());
                   books = new Book[n];
                   for (int i = 0 ; i <n ; i++){
                       Book newBook = new Book();
                       newBook.inputData();
                       books[i] = newBook;
                   }
                   System.out.println("Nhập hoàn thành!");
                   break;
               case 2 :
                   System.out.println("Danh sách các cuốn sách vừa nhập ");
                   for (Book b : books){
                       b.outputData();
                       System.out.println("--------");
                   }
                   break;
               case 3 :
                   Arrays.sort(books,(b1,b2)->b1.getTitle().compareTo(b2.getTitle()));
                   System.out.println("Sắp xếp hoàn thành");
                   break;
               case 4 :
                   System.out.println("Nhập năm xuất bản");
                   int _year = Integer.parseInt(sc.nextLine());
                   for (Book b : books){
                       if (b.getYear() == _year)
                           b.outputData();
                   }
                   System.out.println("Tìm kiếm hoàn thành");
                   break;
               case 5 :
                   System.out.println("Thoát chương trình");
                   System.exit(0);
                   break;
               default:
                   System.out.println("Chọn sai chức năng");
           }
       }
    }
}
