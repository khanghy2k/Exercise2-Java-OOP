package com.rikkei.academy.oop.exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {


        /**
         * Tạo lớp Student gồm các thông tin:
         *      id(String),
         *      firstName(String)
         *      lastName(String)
         *      markJS(double)
         *      markHTML(double)
         *      markCSS(double)
         *      markAvg(double)
         *      rank(String)
         *  Tạo các phương thức get, set cho các thuộc tính, thuộc tính markAvg, rank sẽ chỉ
         *  có phương thức get.
         *  Khai báo constructor không tham số và có tham số (trừ markAvg, rank) để khởi tạo
         *  đối tượng.
         *  Định nghĩa phương thức input() để nhập thông tin sinh viên và output() để hiển thị
         *  thông tin sinh viên.
         *  Định nghĩa phương phức calculatorMarkAvg() tính điểm trung các môn (markAvg) và
         *  xác định xếp loại (rank) (
         *      markAvg <= 5 => rank=TRUNG BÌNH,
         *      5 < markAvg < 8 => rank=KHÁ,
         *      markAvg >= 8 => rank=GIỎI
         *  )
         *
         *
         *  Viết chương trình Java thực hiện các yêu cầu sau:
         *  1. Nhập thông tin n sinh viên
         *  2. Hiển thị danh sách sinh viên
         *  3. Tính điểm trung bình và xếp loại tất cả sinh viên
         *  4. Sắp xếp danh sách sinh viên theo điểm trung bình giảm dần
         *  5. Tìm kiếm sinh viên theo tên (tìm tương đối)
         *  6. Thoát
         * */

        Scanner sc = new Scanner(System.in);
        Student[] students = null;
        while (true) {
            System.out.println("1. Nhập thông tin n sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tính điểm trung bình và xếp loại tất cả sinh viên");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm trung bình giảm dần");
            System.out.println("5. Tìm kiếm sinh viên theo tên (tìm tương đối)");
            System.out.println(" 6. Thoát");
            System.out.println("Chọn tính năng (1->6) : ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1 :
                    System.out.println("Nhập n Sinh Viên ");
                    int n = Integer.parseInt(sc.nextLine());
                    students = new Student[n];
                    for (int i = 0 ; i< n ; i++){
                        Student newStudent = new Student();
                        newStudent.inputData();
                        students[i] = newStudent;
                    }
                    System.out.println("Nhập hoàn thành");
                    break;
                case 2 :
                    System.out.println("Danh sách sinh viên : ");
                    for (Student s : students){
                        s.outputData();
                        System.out.println("--------");
                    }
                    break;
                case 3 :
                    for (Student student : students){
                        student.calculatorMarkAvg();
                        System.out.println("Điểm trung bình và xếp loại cho sinh viên " + student.getFirstName() + " " +student.getLastName());
                        System.out.println("Điểm trung bình : " +student.getMarkAvg());
                        System.out.println("Xếp loại : " +student.getRank());
                        System.out.println("-------------------------------");
                    }
                    break;
                case 4 :
                     //  4. Sắp xếp danh sách sinh viên theo điểm trung bình giảm dần
                    Arrays.sort(students, Comparator.comparingDouble(Student::getMarkAvg).reversed());
                    System.out.println("Danh sách Sinh Viên sau khi sắp xếp theo diểm trung bình giảm dần ");
                    for (Student s : students){
                        s.outputData();
                        System.out.println("-------");
                    }
                    break;
                case 5 :
                    System.out.println("Nhập tên sinh viên cần tìm kiếm:");
                    String searchName = sc.nextLine();
                    boolean find = false;
                    for (Student s : students){
                        if (s.getFirstName().toLowerCase().contains(searchName.toLowerCase())
                        ||s.getLastName().toLowerCase().contains(searchName.toLowerCase())){
                            s.outputData();
                            System.out.println("-------");
                            find = true;
                        }
                    }
                    if (!find){
                        System.out.println("Không tìm thấy sinh viên có tên trong danh sách ");
                    }
                    break;
                case 6 :
                    break;
                default:
                    System.out.println("Chọn sai chức năng");
            }
        }

    }
}
