package bai1;

public class NhanVien {
    public String msnv;
    public String name;
    public int age;
    public String phone;

    public NhanVien(String msnv, String name, int age, String phone) {
        this.msnv = msnv;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public void showInfo() {
        System.out.println("MSNV :" + msnv);
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Phone :" + phone);

    }
}
