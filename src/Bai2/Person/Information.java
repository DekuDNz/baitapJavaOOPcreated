package Bai2.Person;

public class Information {

    public static void main(String[] args) {
     Person person = new Person("Viet Long",18,"Male","115","Danang");
        System.out.println("Name :" + person.getName());
        System.out.println("Age  :" + person.getAge());
        System.out.println("Gender :" + person.getGender());
        System.out.println("Phone :" + person.getPhone());
        System.out.println("Address :" + person.getAddress());


    }
}
