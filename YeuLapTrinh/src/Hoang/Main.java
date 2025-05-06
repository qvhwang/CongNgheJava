package Hoang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien sv = new SinhVien();

        System.out.print("Nhập mã sinh viên: ");
        sv.setMaSV(Integer.parseInt(scanner.nextLine()));

        System.out.print("Nhập họ tên: ");
        sv.setHoTen(scanner.nextLine());

        System.out.print("Nhập lớp: ");
        sv.setLop(scanner.nextLine());

        System.out.print("Nhập điểm trung bình: ");
        double diem = scanner.nextDouble();
        sv.setDiemTB(diem);

        System.out.println("\n--- Thông tin sinh viên ---");
        sv.DisplayInfor();

        scanner.close();
    }
}
