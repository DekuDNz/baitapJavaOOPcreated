package Bai2.Person;

public class Person {
    public String name;
    public int age;
    public String  gender;
    protected String phone;
    protected String address;

    public Person(String name,int age,String gender,String phone,String address){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone ;
        this.address= address;
    }


    public String getName() {
        return name;
    }

    protected String getAddress() {
        return address;
    }

    protected String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
