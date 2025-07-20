package bai1;

public class ThongTin {

    public static void main(String[] args) {
        NhanVien nhanVien = new NhanVien("123","Viet Long",18,"0775448338");
        NhanVien nhanVien1 = new NhanVien("456","Minh Ngoc",19,"123121312312");

        nhanVien.showInfo();
        System.out.println("============");
        nhanVien1.showInfo();
    }
}



